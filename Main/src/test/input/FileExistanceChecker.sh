#!/bin/bash
filename="example.txt"
if [ -e "$filename" ]; then
    echo "File exists."
else
    echo "File does not exist."
fi
