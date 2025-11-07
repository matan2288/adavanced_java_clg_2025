public class Drill8 {
    public int getValues(int[] items, int value) {
        int count = 0;
        for(int i = 0; i < items.length; i++) {
            if (items[i] == value) {
                count++;
            }
        }
        System.out.println("The number: " + value + " appears: " + count + " times in the array");
        return count;
    }

    void main() {
        int[] arr = { 1, 2, 3, 3, 3};
        getValues(arr, 3);
    }
}
