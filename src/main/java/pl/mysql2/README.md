## Zadanie 1 

W pliku `Main1.java` wpisz zapytania do przygotowanych zmiennych,

W bazie danych mamy następujące tabele:
```SQL
* users: id : int (AUTO_INCREMENT, PRIMARY KEY), name : varchar(60), email : varchar(60), password : varchar(60)
* messages: id : int (AUTO_INCREMENT, PRIMARY KEY), user_id: int, message : text
* items: id : int (AUTO_INCREMENT, PRIMARY KEY), name : varchar(40), description : text, price : decimal(7,2)
* orders: id : int (AUTO_INCREMENT, PRIMARY KEY), description : text, created - typ daty, user_id: int
```
Napisz następujące zapytania SQL
Zapytania wpisz w odpowiednie zmienne w przygotowanym pliku `Main1.java`, np. `QUERY1`.

### Nazwa bazy danych to `exam2`.

1. Tworzące tabelę `users` (email ma być unikatowy).
2. Tworzące tabelę `messages` (pamiętaj o relacji jeden do wielu z tabelą `users`).
3. Tworzące tabelę `items`.
4. Tworzące tabelę `orders` (pamiętaj o relacji jeden do wielu z tabelą `users`).
5. Stworzenie relacji wiele do wielu między tabelami `items` a `orders`.  
Tabela łącząca ma się nazywać `items_orders`. Klucze obce nazwij `item_id` i `order_id`. 

**Wywołaj wszystkie zapytania w metodzie `main` programu.**

W udostępnionym pliku `insert.sql` znajdziesz zapytania, które wypełnią Twoją bazę przykładowymi danymi.


## Zadanie 2

Zapytania wpisz w odpowiednie zmienne w przygotowanym pliku `Main2.java`, np. `QUERY1`.

**Nie musisz wywoływać zapytań w kodzie Javy.**
     
1. Wybranie wszystkich itemów o cenie większej niż `50`, `posortowanych rosnąco` po `cenie`.
Oczekiwany wynik dla danych z pliku `insert.sql`:
```plaintext
2 Bob Doe 51.00
3 Bob Doe 52.00
```
2. Włożenie do tabeli `items` nowego produktu o nazwie `product1` i opisie : `desc1`.
3. Usuniecie użytkownika o `id` 3.
4. Wybranie wszystkich użytkowników (tylko kolumny: `id`, `name`, `email`), którzy maja jakąś wiadomość, `posortowanych malejąco` po `id` użytkownika.
Oczekiwany wynik dla danych z pliku `insert.sql`:
```plaintext
2 user2 222@email.pl
1 user1 user1@coderslab.pl
```
5. Pobranie największej wartości z zamówienia (**tabela orders**) o id równym 1.
Oczekiwany wynik dla danych z pliku `insert.sql`:
```plaintext
51.00
```
6. Pobranie wszystkich zamówień z dnia 2017-11-12.

7.  Dodanie do tabeli `items_orders` wpisu łączącego zamówienie (tabela `orders`) o `id` `3`
 z przedmiotem (tabela `items`) o `id` `2`.
 
8. Napisz zapytanie pobierające wiadomości z tabeli `messages` dla których wartość pola `message` zaczyna się od litery **a**. (wykorzystaj `LIKE`).
Oczekiwany wynik dla danych z pliku `insert.sql`:
```plaintext
4 2 amessage 2 user 2
```


## Zadanie 3

W pliku `Main03.java` napisz program, który spełni następujące założenia:

1. z linii komend pobierze następujące parametry:
    * `name`: napis,
    * `description`: napis,
    * `price`: liczba

2. Zapisze te dane do bazy danych do tabeli `items` (tabela taka sama jak w zadaniu 1).


## Zadanie 4

W pliku `Main04.java` napisz program, który spełni następujące założenia:
1. Pobierze `id` użytkownika z konsoli
2. Wyświetli wszystkie wiadomości dla użytkownika o `id` pobranym z konsoli.
3. Następnie wyświetli wszystkie jego zamówienia.
 
Pamiętaj o poprawnym połączeniu do bazy danych i jego zamknięciu.


## Zadanie 5 

Utwórz klasę `VIPUser`. 

Klasa ma spełniać następujące właściwości:

1. Dziedziczyć po klasie `User` (znajduje się w pliku **User.java**).
2. Mieć dodatkowy prywatny atrybut: ```vipCardNumber``` typu **Integer** - typ opakowujący dla **int**.
3. Mieć prywatną metodę ```checkCard(newNumber)``` &ndash; numer jest prawidłowy, 
jeżeli jest większy niż 999 i podzielny przez 2 - metoda ma zwracać wartość logiczną.
4. Mieć konstruktor, który przyjmuje następujące dane: imię (String), nazwisko (String), mail(String), numer karty VIP(Integer).
 Imię, nazwisko i mail mają być przekazywane do konstruktora klasy nadrzędnej.
 Konstruktor ma sprawdzać, czy podany numer jest prawidłowy wykorzystując w tym celu metodę ```checkCard```
  Jeżeli jest  &ndash; to go nastawiać, jeżeli nie  &ndash; to numer ma być nastawiony na ```null```.
5. Mieć publiczną metodę ```setVipCardNumber(newCardNumber)``` i ```getVipCardNumber()```. 
Metoda **setVipCardNumber** ma nastawiać zmienną `vipCardNumber` (jeżeli podany nowy numer spełnia założenia), 
a metoda **getVipCardNumber** &ndash; ją zwracać.
