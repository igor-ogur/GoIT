package enterprise.homework2;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ExecutorImplTest {

    static List<Person> persons;
    static Executor<Person> executor;
    static Validator<Person> validator;
    static Person person;
    static Employee employee;
    static Professional professional;
    @BeforeClass
    public static void setUpClass() throws Exception {
        executor = new ExecutorImpl<>();
        persons = new ArrayList<>();
        validator = new PersonValidator();
        person = new Person("Vadim", "Sidorov");
        employee = new Employee("Oleg", "", "Doctor");
        professional = new Professional("Olga", "Goncharova", " ", 10);
        persons.add(person);
        persons.add(employee);
        persons.add(professional);
    }

    @Test
    public void testValidResults() throws Exception {
        for (Person person : persons) {
            executor.addTask(new PersonTask(person), validator);
        }
        executor.execute();
        List<Person> expectedResult = new ArrayList<>();
        expectedResult.add(person);
        expectedResult.add(professional);
        List<Person> actualResult = executor.getValidResults();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInvalidResults() throws Exception {
        for (Person person : persons) {
            executor.addTask(new PersonTask(person), validator);
        }
        executor.execute();
        List<Person> expectedResult = new ArrayList<>();
        expectedResult.add(employee);
        List<Person> actualResult = executor.getInvalidResults();
        Assert.assertEquals(expectedResult, actualResult);

    }

}