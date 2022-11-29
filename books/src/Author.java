public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(Author author) {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString(){
        return this.firstName + " " +this.lastName;
    }
}
