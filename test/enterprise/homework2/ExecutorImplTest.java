package enterprise.homework2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ExecutorImplTest {

    @Test
    public static void test() throws Exception {
        List<Task<Professional>> professionalTasks = new ArrayList<>();
        Executor<Person> personExecutor = new ExecutorImpl<>();

        for (Task<Professional> professionalTask : professionalTasks) {
            personExecutor.addTask(professionalTask);
        }
        personExecutor.addTask(new PersonTask(), new PersonValidator());

        personExecutor.execute();

        System.out.println("Valid results:");
        for (Person person : personExecutor.getValidResults()) {
            System.out.println(person);
        }
        System.out.println("Invalid results:");
        for (Person person : personExecutor.getInvalidResults()) {
            System.out.println(person);
        }
    }

}