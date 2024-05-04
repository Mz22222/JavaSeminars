//Задание:
//        Реализуйте структуру телефонной книги с помощью HashMap.
//        Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами,
//        их необходимо считать, как одного человека с разными телефонами.
//
//        Вывод должен быть отсортирован по убыванию числа телефонов.


import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> namePhones = new HashMap<>();

    public void addPhone(String phone, String name) {
        if (namePhones.containsKey(name)) {
            namePhones.get(name).add(phone);
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            namePhones.put(name, phones);
        }
    }

    public void print() {
        Map<String, List<String>> sorted = new TreeMap<>((a, b) -> {
            int sizeA = namePhones.get(a).size();
            int sizeB = namePhones.get(b).size();
            return Integer.compare(sizeB, sizeA);
        });
        sorted.putAll(namePhones);
        for (Map.Entry<String, List<String>> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone("+7-964-527-76-00", "Василий");
        phoneBook.addPhone("+7-903-546-19-11", "Петр");
        phoneBook.addPhone("+7-963-681-36-06", "Петр");
        phoneBook.addPhone("+7-964-555-44-00", "Василий");
        phoneBook.addPhone("+7-800-555-35-35", "Петр");
        phoneBook.addPhone("+7-964-552-77-02", "Юлия");
        phoneBook.print();
    }
}


