/*One class must be PUBLIC*/
/*Method*/
public class Person {
    String name;
    String lastName;
    String id;

    /*Constructor*/
    public Person(String name, String lastName, String id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    /*Member of class*/
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public static void main(String[] args) {
        //Instance of person
        Person person = new Person("Jose", "Gutierrez", "Dublioros");
        //Print the information
        System.out.println("Name: " +person.getName());
        System.out.println("Lastname: " + person.getLastName());
        System.out.println("ID: " + person.getId());
    }
}