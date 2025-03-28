public class Doctor {
    static int id = 0; // Autoincrement
    String name;
    String speciality;

    // Constructor method: is a method that is called when an object is created
    // It has the same name as the class
    // It doesn't have a return type
    // It can have parameters
    // It can be overloaded, that is, it can have multiple versions of the same method with different parameters
    Doctor() {
        id++;
        System.out.println("Constructor method");
    }

    Doctor(String name) {
        System.out.println("Constructor method with name: " + name);
    }

    // Methods
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID: " + id);
    }

}