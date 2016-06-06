package enterprise.homework2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExecutorImpl<Person> implements Executor<Person>{

    boolean isExecute = false;
    Map<Task, Validator> personTasks = new HashMap<>();
    List<Person> validPersons = new ArrayList<>();
    List<Person> invalidPersons = new ArrayList<>();

    @Override
    public <T> void addTask(Task<? extends T> task) throws ExecutorException {
        if (isExecute) throw new ExecutorException("Tasks have been executed already");
        personTasks.put(task, null);
    }

    @Override
    public <T> void addTask(Task<? extends T> task, Validator<? extends T> validator) throws ExecutorException {
        if (isExecute) throw new ExecutorException("Tasks have been executed already");
        personTasks.put(task, validator);
    }

    @Override
    public void execute() {
        for (Map.Entry<Task, Validator> task : personTasks.entrySet()){
            task.getKey().execute();
            if (task.getValue() == null) validPersons.add((Person) task.getKey().getResult());
            else {
                if (task.getValue().isValid(task.getKey().getResult())) validPersons.add((Person) task.getKey().getResult());
                else invalidPersons.add((Person) task.getKey().getResult());
            }
        }
        isExecute = true;
    }

    @Override
    public List<Person> getValidResults() throws ExecutorException {
        if (!isExecute) throw new ExecutorException("Execution method has to be invoked before this");
        return validPersons;
    }

    @Override
    public List<Person> getInvalidResults() throws ExecutorException {
        if (!isExecute) throw new ExecutorException("Execution method has to be invoked before this");
        return invalidPersons;
    }
}
