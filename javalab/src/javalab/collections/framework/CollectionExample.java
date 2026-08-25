package javalab.collections.framework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    void main() {
        Collection<String> collection = new ArrayList<>();

        collection.add("Duke");
        collection.add("loves");
        collection.add("Java");

        collection.forEach(IO::println);

        IO.println("-------------------");

        for (String element : collection) {
            IO.print(" " + element);
        }
    }
}
