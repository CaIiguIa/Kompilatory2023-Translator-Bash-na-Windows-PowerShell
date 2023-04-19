## Gramatyka

"" - oznaczenia na znak pusty - epsilon


### Symbole nieterminalne


START <= "#!/bin/bash"  INSTRUCTION;


INSTRUCTION <= INSTRUCTION INSTRUCTION
|| Comment
|| White_Space
|| “”
|| IF_INSTRUCTION
|| FOR_LOOP
|| WHILE_LOOP
|| UNTIL_LOOP
|| SWITCH
|| SELECT
|| COPROCESS
|| LIST

IF_INSTRUCTION <= T_if_początek BOOL_CONDITION_PARENTHESIS T_if_środek
INSTRUCTION (T_warunek_else_if BOOL_CONDITION_PARENTHESIS T_if_środek
INSTRUCTION)* (T_warunek_else T_if_środek INSTRUCTION) T_if_koniec

BOOL_CONDITION_PARENTHESIS <= T_warunek_początek_pojedyńczy BOOL_CONDITION T_warunek_koniec_pojedyńczy
|| T_warunek_początek_podwójny BOOL_CONDITION_STRING T_warunek_koniec_podwójny;

BOOL_CONDITION <= VARIABLE BOOL_OPERATOR VARIABLE
BOOL_CONDITION_STRING <= VARIABLE (BOOL_OPERATOR | T_warunek_equal_string) VARIABLE

BOOL_OPERATOR <= T_warunek_equal
|| T_warunek_gt
|| T_warunek_ge
|| T_warunek_lt
|| T_warunek_le                                                                                         
|| T_warunek_not_equal

FOR_LOOP <= T_for_początek VARIABLE T_loop_in FOR_LOOP_ARG T_pętla_środek INSTRUCTION T_pętla_koniec

FOR_LOOP_ARG <= C_STYLE_CONDITION
|| NUMBERS_LIST
|| VARIABLE_LIST
|| VARIABLE_FROM_COMMAND

C_STYLE_CONDITION <= “((”  EXPRESSION_ASSIGN_VALUE “;” BOOLEAN_CONDITION   “;”    EXPRESSION  “))”
|| “((”  “;”  “;”  “))”

//(( c=1; c<=5; c++ )), Użyte do for

NUMBERS_LIST <= SIGNED_NUMBER (SIGNED_NUMBER)* (“..” SIGNED_NUMBER)
|| “{“ SIGNED_NUMBER “..” SIGNED_NUMBER (“..” SIGNED_NUMBER)?  “}”

// {1..5} ALBO 1 2 3 4 5 ALBO 1 2 3 4 5 .. N ALBO {0..10..2}


SIGNED_NUMBER <= “+” NUMBER 
|| “-” NUMBER

NUMBER <= NUMBER_INTEGER 
|| NUMBER_FLOAT

NUMBER_FLOAT <= NUMBER_INTEGER “.|,” NUMBER*

NUMBER_INTEGER <= NON_ZERO_DIGIT 
|| T_DIGIT T_DIGIT

NON_ZERO_DIGIT <= “1|2|3|4|5|6|7|8|9”

VARIABLE_LIST <= ARGUMENT 
|| ARGUMENT VARIABLE_LIST

//lista argumentów, uzyte do for

ARGUMENT_
//plików (pliki, zmienne, katalog)

VARIABLE_FROM_COMMAND $(Linux-Or-Unix-Command-Here)

EXPRESSION_ASSIGN_VALUE <= T_identyfikator “=”

// przypisanie zmienna = wartość
COMMAND <= T_identyfikator T_rozdzielacz_komend


EXPRESSION <= EXPRESSION_ASSIGN_VALUE

// zmiana wartości zmiennej

VALUE <= T_String ||

// cat plik.txt | grep -e “[0-9]+”

PIPLINE_BEGIN_1 <= “”
|| PIPLINE_BEGIN_2
|| PIPLINE_BEGIN_2 T_Negacja_wyrażeń_boolowskich

PIPLINE_BEGIN_2 <= T_czas
||  T_czas -p

PILPLINE <= PIPLINE_BEGIN COMMAND PIPLINE_POWTÓRZENIE

PIPLINE_POWTÓRZENIE <= COMMAND PIPLINE_POWTÓRZENIE
|| T_pipe COMMAND PIPLINE_POWTÓRZENIE
|| T_pipe_z_błędami COMMAND PIPLINE_POWTÓRZENIE
|| “”

// cat plik.txt | grep -e “[0-9]+”; * kilka

LISTA_RODZIELACZ <= T_rozdzielacz_koniec_komend
|| T_zabice_asynchronicznej_komendy
|| T_warunek_AND_Nieunarne
|| T_warunek_OR_Nieunarne
|| LISTA_RODZIELACZ_MN

LISTA_RODZIELACZ_MN <= T_rozdzielacz_koniec_komend LISTA_RODZIELACZ_MN
|| “”

LIST <= PIPLINE LISTA_RODZIELACZ LIST
|| PIPLINE LISTA_RODZIELACZ
|| INSTRUCTION

WHILE_LOOP <= T_while_początek BOOL_CONDITION_PARENTHESIS T_rozdzielacz_koniec_komend T_pętla_środek_ LIST T_rozdzielacz_koniec_komend T_pętla_koniec

UNTIL_LOOP <= T_until_początek BOOL_CONDITION_PARENTHESIS T_rozdzielacz_koniec_komend T_pętla_środek_ LIST T_rozdzielacz_koniec_komend T_pętla_koniec

SWITCH_

SELECT_

FUNCTIONS_

COPROCESSES_
