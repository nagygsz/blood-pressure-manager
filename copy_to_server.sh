#!/bin/bash

if [ $# -ne 2 ]; then
    echo "Usage: $0 <remote_username> <remote_ip>"
    exit 1
fi

REMOTE_USERNAME="$1"
REMOTE_IP="$2"

# Source files and directory
SOURCE_JAR="target/blood-pressure-manager.jar"
SOURCE_DOCKERFILE="Dockerfile"

# Destination directory on the remote server
DEST_DIRECTORY="services/blood-pressure-manager"

# Copy files using scp
scp "$SOURCE_JAR" "$SOURCE_DOCKERFILE" "$REMOTE_USERNAME@$REMOTE_IP:$DEST_DIRECTORY"
