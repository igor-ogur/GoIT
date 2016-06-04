package enterprise.homework2;


import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.StringUtils.*;

public class PersonValidator implements Validator<Person> {
    @Override
    public boolean isValid(Person result) {
        return isNotBlank(result.getName()) && isNotBlank(result.getSurname());
    }
}
