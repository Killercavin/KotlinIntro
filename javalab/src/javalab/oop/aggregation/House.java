package javalab.oop.aggregation;

import java.util.ArrayList;
import java.util.List;

public class House {
    private final List<Person> residents;

    public House () {
        this.residents = new ArrayList<>();
    }

    public void addResident(Person person) {
        residents.add(person);
    }

    public void showResidents() {
        IO.println("House residents: ");
        for (Person p: residents) {
            System.out.println(p.getName());
        }
    }

    static void main() {
        // Creating Person objects independently
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        // Creating House and adding residents
        House house = new House();
        house.addResident(person1);
        house.addResident(person2);
        house.showResidents();
    }
}
