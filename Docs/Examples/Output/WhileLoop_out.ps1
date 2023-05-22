counter=1
while( $counter -le  5) {
    Write-Output  "Counter: $counter"
    man bash -u | Select-String  "cos" | cat

}
