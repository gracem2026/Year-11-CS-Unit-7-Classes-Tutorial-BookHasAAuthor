public class Author {
    // properties
    private String name;
    private String email;
    private char gender;

    // constructors
    public Author(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String em) {
        email = em;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return name + " (" + gender + ") " + "at " + email;
    }
}
