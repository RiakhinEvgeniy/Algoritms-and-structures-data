package Arrays;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String lastName, String firstName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void displayPerson() {
        System.out.printf("%s %s\n Age = %d;\n", lastName, firstName, age);
    }
}
