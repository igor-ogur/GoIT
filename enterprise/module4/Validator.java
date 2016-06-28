package enterprise.module4;

public interface Validator<T> {

    // Валидирует переданое значение
    boolean isValid(T result);

}
