package lesson3;

import java.util.*;

public class Phonebook {
       private HashMap <String, Set <Long>> phoneBook = new HashMap<>();
    private Object HashSet;

    private void add (String name, long phone){
        Set <Long> tel = phoneBook.getOrDefault(name, new HashSet <>());
        tel.add (phone);
        phoneBook.put (name, tel);
    }
    public void add (String name, Long ... phones){
        Set <Long> tel = phoneBook.getOrDefault(name, new HashSet <>());
        tel.addAll(Arrays.asList (phones));
        phoneBook.put (name, tel);
    }
    public Set<Long> get (String name){
        return Collections.unmodifiableSet(phoneBook, get(name));
    }
}
