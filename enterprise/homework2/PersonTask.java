package enterprise.homework2;

public class PersonTask implements Task<Person> {

    Person person;

    public PersonTask(Person person) {
        this.person = person;
    }

    @Override
    public void execute() {
        new PersonValidator().isValid(person);
    }

    @Override
    public Person getResult() {
        return person;
    }
}
