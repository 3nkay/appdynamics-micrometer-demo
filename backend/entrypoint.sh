#!/bin/bash
java -javaagent:"/sharedFiles/agent/javaagent.jar" $JAVA_OPTS -jar /app/*.jar