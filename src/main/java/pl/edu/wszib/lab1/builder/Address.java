package pl.edu.wszib.lab1.builder;

public class Address {
    private final String city;
    private final String street;
    private final String number;
    private final String code;

    private Address(String city, String street, String number, String code) {
        this.city = city;
        this.street = street;
        this.number = number;
        this.code = code;
    }

    public static final class Builder() {
        private String city;
        private String street;
        private String number;
        private String code;

        public Address build() {
            return new Address(city, street, number,code);
        }
    }

    public static builder() {
        return new Person.Builder();
    }


}
