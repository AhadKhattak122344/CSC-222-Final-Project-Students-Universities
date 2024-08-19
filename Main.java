// Autho: Ahad Khattak
 //Date: 8 Purpose: Students Unversities project, 
 //Honor code: This is my code Ahad Khattak

public class Main {
    public static void main(String[] args) {
        // Create Name instances
        Name name1 = new Name("John", "A", "Doe");
        Name name2 = new Name("Jane", "B", "Smith");

        // Create Person instances
        Person person1 = new Person(name1, 20, 'M', "123 Elm St", "Somewhere", "CA", "90210", "555-1234");
        Person person2 = new Person(name2, 22, 'F', "456 Oak St", "Anywhere", "CA", "90211", "555-5678");

        // Create Student instances
        Student student1 = new Student(name1, 20, 'M', "123 Elm St", "Somewhere", "CA", "90210", "555-1234", 
                                        "S123", "University A", 15, "Yes", "No", "Plan B", "Plan A");
        Student student2 = new Student(name2, 22, 'F', "456 Oak St", "Anywhere", "CA", "90211", "555-5678", 
                                        "S456", "University B", 12, "No", "Yes", "Plan A", "Plan C");

        // Create University instances
        University university1 = new University("University A", "789 College Rd", "Townsville", "CA", "90212", 
                                                 "555-8765", 500.0, 450.0, 400.0, 600.0, 550.0, 500.0, 
                                                 50.0, 100.0, 30.0, 2000.0, 2500.0, 3000.0);
        University university2 = new University("University B", "101 Campus Ave", "Villagetown", "CA", "90213", 
                                                 "555-4321", 520.0, 470.0, 420.0, 620.0, 570.0, 520.0, 
                                                 55.0, 110.0, 35.0, 2100.0, 2600.0, 3100.0);

        // Print out details
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(university1);
        System.out.println(university2);
    }
}
