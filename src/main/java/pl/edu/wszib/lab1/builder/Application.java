package pl.edu.wszib.lab1.builder;

public class Application {

    public static void main(String[] args) {
        Address.Builder address = Address.build();
        Person.Builder person = Person.build()
                .name("Jan")
                .surname("Kowalski")
                .address(address)
                .gender(Gender.MALE)
                .age(20);

    }
}
