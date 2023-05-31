$fname=$("example.txt")
if((Test-Path -Path  "$fname" -PathType Leaf))
{
    Write-Host "File exists."
}
else {
    Write-Host "File does not exist."
}
