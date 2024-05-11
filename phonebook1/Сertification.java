package phonebook1;

public class Сertification {
    public static void main(String[] args) {
        phonebook phoneBook = new phonebook();
        phoneBook.add("+7(915)3251120", "Собакевич");
        phoneBook.add("+7(985)7251189", "Чичиков  ");
        phoneBook.add("+7(985)1258123", "Коробочка");
        phoneBook.add("+7(495)2510064", "Собакевич");
        phoneBook.add("+7(913)0246128", "Коробочка");
        phoneBook.add("+7(917)1259127", "Собакевич");
        phoneBook.add("+7(987)3251215", "Ноздрев  ");
        phoneBook.add("+7(916)5249127", "Ноздрев  ");
        phoneBook.add("+7(495)5259889", "Манилов  ");

        phoneBook.printByDecreasingNumberOfPersonalPhones();
    }

}
// Результат:

// Собакевич: +7(495)2510064
// Собакевич: +7(915)3251120
// Собакевич: +7(917)1259127
// Коробочка: +7(913)0246128
// Коробочка: +7(985)1258123
// Ноздрев  : +7(916)5249127
// Ноздрев  : +7(987)3251215
// Манилов  : +7(495)5259889
// Чичиков  : +7(985)7251189