counter=1
while( $counter -le  5) {
    Write-Host "Counter: $counter"
    man bash-u | Select-String "cos" | Get-Content

}
