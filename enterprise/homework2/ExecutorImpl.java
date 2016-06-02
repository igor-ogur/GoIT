package enterprise.homework2;

import java.util.List;

public class ExecutorImpl<Employee> implements Executor<Employee>{
    @Override
    public <T> void addTask(Task<T> task) {

    }

    @Override
    public <T> void addTask(Task<? extends T> task, Validator<? extends T> validator) {

    }

    @Override
    public void execute() {

    }

    @Override
    public List<Employee> getValidResults() {
        return null;
    }

    @Override
    public List<Employee> getInvalidResults() {
        return null;
    }
}
