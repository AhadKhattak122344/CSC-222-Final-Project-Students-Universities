import java.util.Objects;

public class Name implements Comparable<Name> {
    private final String firstName;
    private final String middleName;
    private final String lastName;

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Name)) return false;
        Name other = (Name) obj;
        return Objects.equals(firstName, other.firstName) && Objects.equals(middleName, other.middleName) &&
               Objects.equals(lastName, other.lastName);
    }

    @Override
    public int compareTo(Name other) {
        int result = lastName.compareTo(other.lastName);
        if (result == 0) {
            result = firstName.compareTo(other.firstName);
            if (result == 0) {
                result = middleName.compareTo(other.middleName);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }
}
