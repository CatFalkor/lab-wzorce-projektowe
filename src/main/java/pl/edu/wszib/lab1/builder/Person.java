package pl.edu.wszib.lab1.builder;

public class Person {

    private final String name;
    private final String surname;
    private final Gender gender;
    private final Address address;
    private final int age;

    private Person(String name, String surname, Gender gender, Address address, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }


    public static final class Builder {
        private String name;
        private String surname;
        private Gender gender;
        private Address address;
        private int age;

        public Person build() {
            return new Person(name, surname, gender, address, age);
        }
    }

    public static builder() {
        return new Builder();
    }

}
