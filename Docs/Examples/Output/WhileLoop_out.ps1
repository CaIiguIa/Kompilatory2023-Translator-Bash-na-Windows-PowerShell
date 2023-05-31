$counter=1
while( $counter -le  5) {
    Write-Host "Counter: $counter"
     manbash  -u | Select-String "cos" | Get-Content
}
