public class Developer {
    // Attributes
    private String name;
    private int age;
    private int experienceYears;
    private double salary;
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int age, int experienceYears, double salary, String programmingLanguage) {
        this.name = name;
        this.age = age;
        this.experienceYears = experienceYears;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public double getSalary() {
        return salary;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Setters with integrity checks
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears >= 0) {
            this.experienceYears = experienceYears;
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage != null && !programmingLanguage.isEmpty()) {
            this.programmingLanguage = programmingLanguage;
        }
    }

    // Method to display all information
    public void displayDeveloperInfo() {
        System.out.println("Developer Info:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Experience Years: " + experienceYears);
        System.out.println("Salary: $" + salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
