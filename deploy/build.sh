#!/bin/bash

cd "$(dirname "$0")"

echo "Building appdynamics image..."
cd ../appdynamics/ && docker build -t=nkavtur/java-appd-agent .

echo "Building backend app..."
cd ../backend/ && mvn clean package -DskipTests=true && docker build -t nkavtur/users-backend-app:latest .

echo "Building gateway app..."
cd ../gateway/ && mvn clean package -DskipTests=true && docker build -t nkavtur/users-gateway-app:latest .

