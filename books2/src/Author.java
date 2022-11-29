import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString(){
        return this.firstName + " " +this.lastName;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author2 = (Author) other;
        return (lastName.equals(author2.lastName) && firstName.equals(author2.firstName));
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(lastName, firstName);
    }
}

