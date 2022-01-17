package one.digitalinnovation.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PersonFoundException extends Exception {
    
    public PersonFoundException(String cpf) {
        super("Person already registered with CPF: " + cpf);
    }
}