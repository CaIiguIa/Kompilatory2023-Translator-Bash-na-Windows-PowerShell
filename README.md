# Transpiler z Bash na WindowsPowerShell

[![Java CI with Maven](https://github.com/CaIiguIa/Kompilatory2023-Translator-Bash-na-Windows-PowerShell/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/CaIiguIa/Kompilatory2023-Translator-Bash-na-Windows-PowerShell/actions/workflows/maven.yml)

---

## Spis treści:

1.  [Opis projektu](#opis)
	- [Cel](#cel-projektu)
	- [Technologie](#zastosowane-technologie)
2.  [Instrukcje użycia](#instrukcje-użycia)
    - [Linia komend](#funckjonalności-lini-komend)
    - [GUI](#funckjonalności-gui)
3.  [Instalacja](#instalacja)
4.  [Dokumentacja](#dokumentacja)
    - [Uwagi](#ogólne-uwagi)
    - [Błędy](#zgłaszanie-błędów)
5.  [Autorzy](#autorzy)

## Opis:

#### Cel projektu:

Stworzyć translator skryptów napisanych w Bash-u (plik .bs) na ich ekwiwalenty napisane w Windows Power Shell (plik .ps1).

#### Zastosowane technologie:

1. Java 17 - [Link do strony kompilartora którego użyliśmy](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html).
2. Maven - jako narzędzie do budowy projektu.
3. ANTLR4 - generator lexerów i perserów, w implementacji użyliśmy Listener -a.
4. Openjfx - GUI projektu.
5. Junit - do testów aplikacji.
6. Inne pomniejsze *dependencies* np. do parsowania plików .json lub .csv.

## Instrukcje użycia:

Aplikację można użytkować na dwa sposoby:
- Jako zwykły program do szybkiej translacji z wiersza poleceń.
- Jako pełny edytor skryptów z bierzącą translacją.

Głównym determinantem, który z tyrybów będziemy użytkować jest to, czy został podany argument odpowiedzialny za start GUI programu.

#### Funckjonalności lini komend

**Nie podano `[-g | -G | --GUI]` jako argument aplikacji.**

Lista dostępnych argumentów do podania w lini komend:
1.  `[-i | -I | --Input] <Dane>`
    -    `Dane to ścieżka do pliku` - tylko ten jeden skrypt zostanie przetworzony.
    -    `Dane to ścieżka do folderu`- wówczas wszystkie pliki w nim zostaną potraktowane jako pliki do translacji.
    -    W obu przypadkach pliki nie muszą mieć rozszerzenia `.bs`.
2.  `[-o | -O | --Output] <Dane>`
    -    `Dane to ścieżka do folderu` - w danym folderze zostaną utworzone pliki o adekwatnej nazwie i rozszerzeniu `.ps1`.
3.  `[--NoComments]`
	-    Flaga ta spowoduje, że komentarze z pliku wejściowego nie są umieszczane w pliku wynikowym.
4.  `[--NoWarnings]`
	-    Flaga ta powoduje nie wyświetlanie się ostrzeżeń translatora o niedokładnościach translacji.
5.  `[--CustomSuffix]` <Sufix pliku>
	-    `Dane to string` - Jest to sufix nazwy wygenerowanego pliku umieszczany: `<Nazwa pliku wejściowego bez rozszerzenia><Sufix pliku>.ps1`
    -    Domyślna wartość to `_out`.
6.  `[-g | -G | --GUI]`
	-    Flaga ta sprawia włączenie się GUI oraz neguje wszystekie funckje aplikacji dotyczące lini poleceń.
7.  `[-h | -H | --Help]`
	-    Wypisuje informacje o wszystkich możliwych argumentach programu.
8.  `[-v | -V | --Version]`
	-    Wypisuje informacje o wersji prograu prosto z pliku .pom mavena.

**Uwagi:**
- Flagi i argumenty oczywiście podajemy bez nawiasów kwadratowych. 
- Kolejność podanych argumentów nie ma znaczenia, jeżeli tylko dane do poszczególnych argumentów są prawidłowo ułożone.

#### Funckjonalności GUI

**Podano `[-g | -G | --GUI]` jako argument aplikacji.**

#### TODO!!!!!

## Instalacja:

#### TODO!!!!!

## Dokumentacja:

#### Ogólne uwagi
- Całość dokumentacji znajduje się w: [\[Link\]](/Docs)
- Gramatyka w oparciu o którą wygenerowano parser i lexer: [\[Link\]](/Docs/Grammar.md)
- Zbiór tokenów w oparciu o który wygenerowano parser i lexer: [\[Link\]](/Docs/Tokens.md)
- Przykładowe pliki wyjściowe wygenerowane przez program znajdują się w: [\[Link\]](/Docs/Examples/Output)
- Przykładowe skrypty w bashu w oparciu o które stworzono powyżej zamieszczone pliki:  [\[Link\]](/Main/src/test/input)

#### Zgłaszanie błędów

Jeżeli wykryłeś jakikolwiek błąd, nieprawidłowość w działaniu programu lub też nieścisłość w dokumentacji stwórz `Github Issue` i przypisz jednego z autorów podanych poniżej. 

## Autorzy

1.	Dominik Breksa - `dominikbreksa@student.agh.edu.pl` - [\[Link do githuba\]](https://github.com/ForNeus57)
2.	Szymon Jurecki - `sdjurecki@student.agh.edu.pl` - [\[Link do githuba\]](https://github.com/CaIiguIa)
