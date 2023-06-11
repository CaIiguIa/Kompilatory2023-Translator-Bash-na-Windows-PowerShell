#!/bin/bash
fruit="apple"
case $fruit in
    "apple")
        echo "It's an apple.";;
    "banana")
        echo "It's a banana.";;
    *)
        echo "It's something else."
esac
