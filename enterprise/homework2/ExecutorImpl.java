package enterprise.homework2;

import java.util.ArrayList;
import java.util.List;

public class ExecutorImpl<Person> implements Executor<Person>{

    List<Task> personTasks = new ArrayList<>();

    @Override
    public <T> void addTask(Task<T> task) {
        personTasks.add(task);
    }

    @Override
    public <T> void addTask(Task<? extends T> task, Validator<? extends T> validator) {
        personTasks.add(task);
    }

    @Override
    public void execute() {

    }

    @Override
    public List<Person> getValidResults() {
        return null;
    }

    @Override
    public List<Person> getInvalidResults() {
        return null;
    }
}
