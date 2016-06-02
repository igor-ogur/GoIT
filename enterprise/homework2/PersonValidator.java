package enterprise.homework2;

public class PersonValidator implements Validator<Person> {
    @Override
    public boolean isValid(Person result) {
        return false;
    }
}
