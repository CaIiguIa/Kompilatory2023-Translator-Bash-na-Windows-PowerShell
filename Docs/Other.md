### WindowsPowerShell


1. Spis:
    * T_Function_starter <= function
    *


# Translacja Bash na PowerShell


| Element                           | Bash             | PowerShell                              | 
|-----------------------------------|------------------|-----------------------------------------|
| Komentarz                         | #                | #                                       |
| Zmiana lokalizacji                | cd               | Set-Location                            |
| Wpis na terminal                  | echo             | Write-Output                            |
| Wpis o błędzie na terminal        | echoerr          | Write-Error                             |
| Koniec skryptu                    | exit             | Exit                                    |
| Koniec skryptu i wyrzucenie błędu | exiterr          | throw + $ErrorActionPreference = "Stop" |
| Przypisanie zmiennej              | export/nic + a=b | Set-Variable z opcją -scope             |
| Ewaluacja wyrażenia               | expr             | Invoke-Expression                       |
| Lista obiektów w folderze         | find             | Get-ChildItem + opcje                   |
| RAM info                          | free             | ???                                     |
| File info                         | ls               | Get-ChildItem + opcje                   |
| Zabicie procesu                   | kill             | Stop-Process                            |
| Zmiana wartości zmiennej          | set              | Set-Variable                            |
| Spanko                            | sleep            | Start-Sleep                             |
|                                   | sudo             | ????                                    |
| Czytaj plik                       | read             | Get-Content                             |
| Wyszukiwanie                      | grep             | Select-String                           |
| Zliczanie                         | wc               | Measure-Object                          |
|                                   |                  |                                         |
|                                   |                  |                                         |
|                                   |                  |                                         |
|                                   |                  |                                         |
|                                   |                  |                                         |
|                                   |                  |                                         |
|                                   |                  |                                         |
|                                   |                  |                                         |

