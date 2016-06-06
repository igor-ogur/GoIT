package enterprise.homework2;

public class Professional extends Employee {
    int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Professional(String name, String surname, String profession, int experience) {
        super(name, surname, profession);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Professional{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                "profession='" + profession + '\'' +
                "experience=" + experience +
                '}';
    }
}
