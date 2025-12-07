#!/bin/bash

# n8n Local Server Startup Script

echo "================================"
echo "   n8n Local Server Setup"
echo "================================"
echo ""

# Check if Docker is installed
if ! command -v docker &> /dev/null; then
    echo "❌ Docker is not installed. Please install Docker first."
    echo "Visit: https://docs.docker.com/get-docker/"
    exit 1
fi

# Check if Docker Compose is installed
if ! command -v docker-compose &> /dev/null; then
    echo "❌ Docker Compose is not installed. Please install Docker Compose first."
    echo "Visit: https://docs.docker.com/compose/install/"
    exit 1
fi

echo "✓ Docker is installed"
echo "✓ Docker Compose is installed"
echo ""

# Create necessary directories
echo "Creating directories..."
mkdir -p n8n-workflows n8n-backup
echo "✓ Directories created"
echo ""

# Start the n8n container
echo "Starting n8n server..."
docker-compose up -d

# Wait for the container to start
echo ""
echo "Waiting for n8n to be ready..."
sleep 5

# Check if container is running
if docker ps | grep -q "n8n-local"; then
    echo ""
    echo "================================"
    echo "✓ n8n server is running!"
    echo "================================"
    echo ""
    echo "Access n8n at: http://localhost:5678"
    echo ""
    echo "Login credentials:"
    echo "  Username: admin"
    echo "  Password: admin123"
    echo ""
    echo "To stop the server, run:"
    echo "  docker-compose down"
    echo ""
    echo "To view logs, run:"
    echo "  docker-compose logs -f n8n"
    echo "================================"
else
    echo ""
    echo "❌ Failed to start n8n server"
    echo "Check logs with: docker-compose logs n8n"
    exit 1
fi
