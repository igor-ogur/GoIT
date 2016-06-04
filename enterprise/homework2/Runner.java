package enterprise.homework2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Vadim", "Sidorov"));
        persons.add(new Person("Sergey", ""));
        persons.add(new Employee("Alex", "Alexandrov", "Doctor"));
        persons.add(new Employee("Oleg", "", "Doctor"));
        persons.add(new Professional("Olga", "Goncharova", "Ingenier", 10));
        persons.add(new Professional("", "Melnik", "Ingenier", 10));

        Executor<Person> personExecutor = new ExecutorImpl<>();
        for (Person person : persons) {
            personExecutor.addTask(new PersonTask(), new PersonValidator());
        }

    }

}
