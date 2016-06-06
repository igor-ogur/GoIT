package enterprise.homework2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws ExecutorException {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Vadim", "Sidorov"));
        persons.add(new Person("Sergey", ""));
        persons.add(new Employee("Alex", "Alexandrov", "Doctor"));
        persons.add(new Employee("Oleg", "", "Doctor"));
        persons.add(new Professional("Olga", "Goncharova", "Engineer", 10));
        persons.add(new Professional("", "Melnik", "Engineer", 10));

        Executor<Person> personExecutor = new ExecutorImpl<>();
        for (Person person : persons) {
            personExecutor.addTask(new PersonTask(person), new PersonValidator());
        }
        personExecutor.addTask(new PersonTask(new Professional("Ivan", "Ivanov", "Cook", 5)));

        personExecutor.execute();

        System.out.println("Valid results:");
        for (Person person : personExecutor.getValidResults()) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("Invalid results:");
        for (Person person : personExecutor.getInvalidResults()) {
            System.out.println(person);
        }
    }

}
