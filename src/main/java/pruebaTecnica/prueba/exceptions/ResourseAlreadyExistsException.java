package pruebaTecnica.prueba.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FOUND)
public class ResourseAlreadyExistsException extends Exception{

    public ResourseAlreadyExistsException(String message){
        super(message);
    }
}

