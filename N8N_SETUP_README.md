# n8n Local Docker Setup

## מהירות התקנה (Quick Start)

### 1. התקנת Docker
ודא ש-Docker ו-Docker Compose מותקנים במערכת שלך.

### 2. הפעלת השרת
```bash
docker-compose up -d
```

### 3. גישה לממשק n8n
פתח דפדפן וגש לכתובת:
```
http://localhost:5678
```

**פרטי התחברות:**
- שם משתמש: `admin`
- סיסמה: `admin123`

### 4. עצירת השרת
```bash
docker-compose down
```

### 5. עצירה ומחיקת נתונים
```bash
docker-compose down -v
```

---

## תיאור Workflow המומלץ

Workflow זה מיועד לבדיקת API ושליחת התראות על נתונים חדשים.

### מבנה ה-Workflow:

#### 1. **Trigger (טריגר - מתי לבדוק)**
- **Cron Node** או **Interval Node**
  - Interval: בדיקה כל 10 דקות
  - Cron: בדיקה בשעות ספציפיות

#### 2. **API Request (משיכת הנתונים)**
- **HTTP Request Node**
  - Method: `GET`
  - URL: כתובת ה-API שלך (לדוגמה: `https://api.example.com/data`)
  - Authentication: הוסף Headers אם נדרש (API Key, Bearer Token)
  - Response Format: JSON

#### 3. **Data Preparation (הכנת הנתונים)**
- **Split In Batches** או **Item Lists**
  - עיבוד כל הרשומות
  - המרה לפורמט JSON מתאים

#### 4. **Data Extraction (חילוץ מזהה ייחודי)**
- **Code Node (JavaScript)**
  - חילוץ מזהה ייחודי (token, orderId)
  - חילוץ metadata מהתגובה
  - פרסור תאריכים וזמנים

**דוגמת קוד JavaScript:**

```javascript
const item = $json;
const imageUrl = item.metaData.coverImage;

// חילוץ timestamp מה-URL של התמונה
const match = imageUrl.match(/\/(\d{14})\.jpeg/);
const timestamp = match ? match[1] : null;

if (timestamp) {
  // המרת timestamp למרכיבים
  const year = timestamp.substring(0, 4);
  const month = timestamp.substring(4, 6);
  const day = timestamp.substring(6, 8);
  const time = timestamp.substring(8, 14);
  
  // הוספת נתונים מעובדים לפריט
  item.uniqueId = item.token; // המזהה הייחודי
  item.postDate = `${day}/${month}/${year}`;
  item.postTime = `${time.substring(0, 2)}:${time.substring(2, 4)}`;
  item.fullTimestamp = timestamp;
}

return item;
```

#### 5. **Comparison (בדיקה האם הפריט חדש)**
- **NoSQL Database Node** (Differentiator)
  - השוואה עם נתונים קודמים
  - Previous Data Key: המזהה הייחודי
  - Key Path: הנתיב למזהה בתוך הנתונים
  - תוצאה: "New" או "Existing"

#### 6. **Notification (שליחת התראה)**
- **Email Send Node** (רק עבור "New")
  - To: כתובת המייל שלך
  - Subject: כותרת המייל (לדוגמה: "התראה: נתונים חדשים")
  - Body: תוכן המייל עם פרטי הפריט החדש
    ```
    ({{ $json.postDate }})
    {{ $json.uniqueId }}
    ```

#### 7. **Database Update (עדכון מאגר הנתונים)**
- **NoSQL Database Node** - "Write" או "Add"
  - שמירת ה-uniqueId החדש במסד הנתונים
  - מניעת התראות כפולות

---

## הגדרות נוספות

### שינוי סיסמת Admin
ערוך את הקובץ `.env`:
```
N8N_BASIC_AUTH_USER=your_username
N8N_BASIC_AUTH_PASSWORD=your_password
```

אחר כך הפעל מחדש:
```bash
docker-compose restart
```

### שינוי Port
ערוך את `docker-compose.yml`:
```yaml
ports:
  - "8080:5678"  # שנה את 8080 לפורט הרצוי
```

### Timezone
שנה ב-`.env`:
```
GENERIC_TIMEZONE=Asia/Jerusalem
TZ=Asia/Jerusalem
```

---

## Backup ו-Restore

### יצוא Workflow
1. היכנס ל-n8n
2. פתח את ה-Workflow
3. לחץ על Download (ייצא כקובץ JSON)
4. שמור בתיקייה `n8n-workflows/`

### ייבוא Workflow
1. היכנס ל-n8n
2. לחץ על Import from File
3. בחר את קובץ ה-JSON
4. הפעל את ה-Workflow

---

## פתרון בעיות

### השרת לא עולה
```bash
docker-compose logs n8n
```

### איפוס סיסמה
עצור את השרת ומחק את הנתונים:
```bash
docker-compose down -v
docker-compose up -d
```

### בדיקת סטטוס
```bash
docker-compose ps
```

---

## קישורים שימושיים

- [n8n Documentation](https://docs.n8n.io/)
- [n8n Community Forum](https://community.n8n.io/)
- [Workflow Templates](https://n8n.io/workflows/)

---

## מבנה קבצים

```
/workspace/
├── docker-compose.yml       # הגדרות Docker
├── .env                     # משתני סביבה
├── n8n-workflows/           # תיקיית Workflows
├── n8n-backup/              # תיקיית גיבויים
└── N8N_SETUP_README.md      # המדריך הזה
```

---

**הערה:** אל תשכח לשנות את פרטי ההתחברות לפני הפעלה בסביבת ייצור!
