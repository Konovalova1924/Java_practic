import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    public static void main(String[] args) {
    PhoneBook phoneBook = new PhoneBook();

    phoneBook.add("Васильцов Е.В.", "+79167336622");
    phoneBook.add("Васильцов Е.В.", "+79263002121");
    phoneBook.add("Исинбаева А.С.", "+79058964478");

    System.out.println("Номера телефонов Васильцова Е.В.: " + phoneBook.get("Васильцов Е.В."));
    System.out.println("Номера телефонов Исинбаева А.С.: " + phoneBook.get("Исинбаева А.С."));
}

    private final Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }


    public void add(String name, String phoneNumber) { // Добавляем
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }


    public List<String> get(String name) { // Фильтр
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }
}