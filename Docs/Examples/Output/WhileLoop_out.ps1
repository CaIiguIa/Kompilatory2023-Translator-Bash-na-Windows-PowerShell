counter=1
while( $counter -le  5) {
    echo  "Counter: $counter"
    man bash -u | Select-String  "cos" | cat

}
