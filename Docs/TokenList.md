# Mapa headerów


# Legenda notacji:

#### Treść identyczna jak w notacji używanej podczas przekazywania wyrażń reguralnych w programie GREP:

* []
* {}
* "       "  <=====  aby ukazać białe znaki



# Lista tokenów

### Bash

#### Ogólne

Describtion co to kategoria ogólne


* T_Start <= %^                     Znak początku pliku
* T_Komentarz <= #[^\n]*\n
* T_Komenda <= "(cd|echo|echoerr|exit|exiterr|export|expr|find|free|ls|kill|set|sleep|sudo|read|...) "
* T_komenda_Argument <= ????
* T_while <= "while "
* T_for_początek <= "for "
* T_pętla_środek <= (; |\n)do(....)?
* T_pętla_koniec <= (; |\n)done
* T_if_początek <= if
* T_if_środek <= then
* T_if_koniec <= fi
* T_warunek <= "[ [^\]]* ]"
* T_warunek_equal <= (" -eq ")
* T_warunek_equal_string <= (" == "|" = ")
* T_warunek_not_equal <= (" -ne "| " != ")
* T_warunek_AND_Nieunarne <= &&
* T_warunek_OR_Nieunarne <= ||
* T_warunek_else <= else
* T_warunek_else_if <= elif
* T_switch_case_początek <= "case "                   Trzeba się doedukować w switchach....
* 
* 

#### Literały

* T_String <= \".*\"
* T_ciagi_znaków <= \'.*\'
* T_zmienna_początek <= $[^#]
* T_liczba_argumentów_skryptu <= "$#"
* T_bool <= (true|false)
* T_liczba_calkowita_bez_znaku <= [0-9]+
* T_liczba_hexagonalna_bez_znaku <= (Ox|16#)[0-9A-Fa-f]+
* T-liczba_ósemkaowa_bez_znaku <= O[0-7]+
* 
* 

#### Znaki specjalne

* T_blank <= ( |\t)
* T_Średnik <= (;|\n)
* T_pipe <= " | "
* T_lewy_nawias_otwierający_półokrągły <= "("
* T_prawy_nawias_otwierający_półokrągły <= ")"
* T_lewy_nawias_otwierający_wąsaty <= "{"
* T_prawy_nawias_otwierający_wąsaty <= "}"
* T_lewy_nawias_otwierający_kwadratowy <= "["
* T_prawy_nawias_otwierający_kwadratowy <= "]"
* T_Przekaż_do_pliku_w_prawo_i_nadpisz_go <= ">"
* T_Przekaż_do_pilku_w_prawo_i_dopisz_do_końca <= ">>"
* T_Przekaż_do_pliku_w_lewo_i_nadpisz_go <= "<"
* T_Przekaż_do_pilku_w_lewo_i_dopisz_do_końca <= "<<"
* T_Negacja wyrażeń_boolowskich <= "!"
* 

#### operatory

* T_operator_przypisania <= "="

### WindowsPowerShell

### Ogólne

1. Spis:
    * T_Function_starter <= function
    * 



#### Operatory


# Translacja Bash na PowerShell

#### Ogólne

Describtion co to kategoria ogólne


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
|                                   | kill             |                                         |
|                                   | set              |                                         |
|                                   | sleep            |                                         |
|                                   | sudo             |                                         |
|                                   | read             |                                         |
|                                   |                  |                                         |
|                                   |                  |                                         |
|                                   |                  |                                         |
|                                   |                  |                                         |
|                                   |                  |                                         |
|                                   |                  |                                         |
|                                   |                  |                                         |
|                                   |                  |                                         |
|                                   |                  |                                         |
|                                   |                  |                                         |


* 
* T_komenda_Argument <= ????
* T_while <= "while "
* T_for_początek <= "for "
* T_pętla_środek <= (; |\n)do(....)?
* T_pętla_koniec <= (; |\n)done
* T_if_początek <= if
* T_if_środek <= then
* T_if_koniec <= fi
* T_warunek <= "[ [^\]]* ]"
* T_warunek_equal <= (" -eq ")
* T_warunek_equal_string <= (" == "|" = ")
* T_warunek_not_equal <= (" -ne "| " != ")
* T_warunek_AND_Nieunarne <= &&
* T_warunek_OR_Nieunarne <= ||
* T_warunek_else <= else
* T_warunek_else_if <= elif
* T_switch_case_początek <= "case "                   Trzeba się doedukować w switchach....
*
* 


 









