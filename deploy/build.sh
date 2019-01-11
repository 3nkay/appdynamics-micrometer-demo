#!/bin/bash

cd "$(dirname "$0")"

echo "Building appdynamics image..."
cd ../appdynamics/ && docker build -t=nkavtur/java-appd-agent .

echo "Building backend app..."
cd ../backend/ && mvn clean package -DskipTests=true && docker build -t nkavtur/micrometer-app:latest .

