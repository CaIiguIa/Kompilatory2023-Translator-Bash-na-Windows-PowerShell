## Lista tokenów

### Symbole terminalne

// * T_Komentarz <= "#[^\n]+\n"
* T_identyfikator <= "[a-zA-Z-][a-zA-Z0-9_]*"
// * T_while_początek <= "while"
// * T_until_początek <= "until"
// * T_for_początek <= "for"
* T_pętla_środek <= "do"
* T_pętla_koniec <= "done"
* T_if_początek <= "if"
* T_if_środek <= "then"
* T_if_koniec <= "fi"
* T_warunek_początek_pojedyńczy <= "["
* T_warunek_początek_podwójny <= "[["
* T_warunek_koniec_pojedyńczy <= "]"
* T_warunke_koniec_podwójny <= "]]"
* T_warunek_equal <= ("-eq")
* T_warunek_equal_string <= ("=="|"=")
* T_warunek_not_equal <= ("-ne"|"!=")
* T_warunek_gt <= "-gt"
* T_warunek_ge <= ("-ge"|">=")
* T_warunek_lt <= "-lt"
* T_warunek_le <= ("-le"|"<=")
* T_warunek_AND_Nieunarne <= "&&"
* T_warunek_OR_Nieunarne <= "||"
* T_warunek_else <= "else"
* T_warunek_else_if <= "elif"
* T_switch_case_początek <= "case"
* T_switch_break_absolutny <= ";;"
* T_switch_break_z_kontynuacją <= ";&"
* T_switch_break_z_egzekucją_następnego <= ";;&"
* T_switch_case_koniec <= "esac"
* T_String <= "".*""
* T_ciagi_znaków <= "'.*'"
* T_zmienna <= "$[^$#\n;0-9][^$#\n;]*"
* T_liczba_argumentów_skryptu <= "$#"
* T_kolejny_argumen* t_skryptu <= "$[0-9]"
* T_bool <= ("true"|"false")
* T_liczba_calkowita_bez_znaku <= "[0-9]+"
* T_liczba_hexagonalna_bez_znaku <= "(Ox|16#)[0-9A-Fa-f]+"
T-liczba_ósemkaowa_bez_znaku <= "(O|8#)[0-7]+"
* T_rozdzielacz_identyfikatorów <= (" "|"\t")
* T_rozdzielacz_koniec_komend <= (";"|"\n")
* T_pipe <= "|"
* T_pipe_z_błędami <= "|&"
* T_plus <= "+"
* T_razy_lub_wildcard <= "*"
* T_wildcard_1 <= "?"
* T_minus <= "-"
* T_dziel <= "/"
* T_zabice_asynchronicznej_komendy <= "&"
* T_nawias_otwierający_półokrągły <= "("
* T_nawias_zamykający_półokrągły <= ")"
* T_nawias_otwierający_wąsaty <= "{"
* T_nawias_zamykający_wąsaty <= "}"
* T_Przekaż_do_pliku_w_prawo_i_nadpisz_go <= ">"
* T_Przekaż_do_pilku_w_prawo_i_dopisz_do_końca <= ">>"
* T_Przekaż_do_pliku_w_lewo_i_nadpisz_go <= "<"
* T_Przekaż_do_pilku_w_lewo_i_dopisz_do_końca <= "<<"
* T_Negacja_wyrażeń_boolowskich <= "!"
* T_operator_przypisania <= "="
* T_początek funkcji <= "function"
* T_wybranie <= "select"
* T_asynchronizacja <= "coproc"
* T_czas <= "time"
* T_tworzenie_zmiennych <= "declare"
* T_home_folder <= "~"
* T_ten_folder <= "."
* T_poprzedni_folder <= ".."
* T_loop_in <= “in”
//* T_DIGIT <= “0|1|2|3|4|5|6|7|8|9”