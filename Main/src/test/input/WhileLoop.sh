#!/bin/bash
counter=1
while [ $counter -le 5 ]; do
    echo "Counter: $counter"
    man bash -u | grep "cos" | cat
    #((counter++))
done
