package lesson3;

import java.util.*;

public class Main {
    public static void main (String [] args) {
        System.out.println(" Task 1.");

        String[] words = {"дочь", "солнце", "кошка", "собака", "солнце", "мышь", "дочь", "телефон", "компьютер", "лето", "солнце", "осень", "лето", "зима"};
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> map = new HashMap<>();
        for (String x : words) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        System.out.println(map);

        Phonebook phone = new Phonebook();
        phone.add("Васильев", 89115569487L);
        phone.add("Пеньков", 89115899485L);
        phone.add("Зубарев", 89065589487L);
        phone.add("Самойлов", 89116639487L);
        phone.add("Васильев", 89115128787L);
        phone.add("Зубарев", 89055565487L);

        System.out.println("тел: " + phone.get("Зубарев"));
        System.out.println("тел: " + phone.get("Самойлов"));

    }


}
