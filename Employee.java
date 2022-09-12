public class Employee {
    private String name;
    private String lastname;
    private String surname;
    private int department;
    private float salary;
    private static int counter = 0;
    private int id;


    // Геттеры
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSurname() {
        return surname;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }


    public int getId() {
        return id;
    }
// Сеттеры
    public void setDepartment(int department) {
        this.department = department;
    }


        public void setSalary(float salary) {
            this.salary = salary;
        }

    public Employee(String name, String lastname, String surname, int department, float salary) {
        this.name = name;
        this.lastname = lastname;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.id =counter++;
    }
}
}





    }}








