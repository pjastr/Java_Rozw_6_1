1. W nowym projekcie wykonaj poniższe czynności:
* Stwórz klasę `Osoba` z polami `imie` i `nazwisko`. Następnie stwórz klasę potomną `Student` z polami `rokStududiów`, `numerGrupy`, `numerAlbumu`. Dodaj w obu klasach konstruktory domyślne i parametryczne (można wykorzystać kod z jednych z poprzednich ćwiczeń).
* W obu klasach stwórz metody `WypiszInfo()` wyświetlające wszystkie pola z klasy na konsoli (mają to być tylko instrukcje `System.out.println()` z parametrami).
* Wykonaj rzutowanie w górę (`Osoba student1 = new Student()`) i wywołaj dla tego obiektu metodę `WypiszInfo()`.
* Zmodyfikuj metodę `WypiszInfo()` w klasie `Student` używając `super.WypiszInfo();` (o ile nie zrobiono tego wcześniej). Dodaj również atrybut `@Override` - zastanów się czy to coś zmienia (lub w jakim kontekście zmieni).
* Narysuj diagram klas UML projektu.
