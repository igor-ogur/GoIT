package enterprise.homework2;

public class Employee extends Person {
    private String profession;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Employee(String name, String surname, String profession) {
        super(name, surname);
        this.profession = profession;
    }
}
