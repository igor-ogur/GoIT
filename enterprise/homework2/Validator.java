package enterprise.homework2;

public interface Validator<T> {

    // Валидирует переданое значение
    boolean isValid(T result);

}
