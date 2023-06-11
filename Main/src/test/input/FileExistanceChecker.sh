#!/bin/bash
fname="example.txt"
if [ -e "$fname" ]; then
    echo "File exists."
else
    echo "File does not exist."
fi
