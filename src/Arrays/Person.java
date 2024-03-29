package Arrays;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String lastName, String firstName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void displayName() {
        System.out.printf("%s %s\n Age = %d;\n", lastName, firstName, age);
    }
}
