import java.util.Objects;

public class Person implements Comparable<Person> {
    private final Name name;
    private int age;
    private final char gender;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;

    public Person(Name name, int age, char gender, String streetAddress, String city, String state, String zip, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public Name getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return Objects.equals(name, other.name) && age == other.age && gender == other.gender &&
               Objects.equals(streetAddress, other.streetAddress) && Objects.equals(city, other.city) &&
               Objects.equals(state, other.state) && Objects.equals(zip, other.zip) &&
               Objects.equals(phoneNumber, other.phoneNumber);
    }

    @Override
    public int compareTo(Person other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                ", gender=" + gender +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
