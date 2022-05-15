package pruebaTecnica.prueba.exceptions;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Implementation of logger for logs of the personalized exceptions
     */
    private static final Logger logger = Logger.getLogger(GlobalExceptionHandler.class);



    /**
     * <p>
     * This method is used for made a response entity for different exceptions
     * </p>
     * @param ResourceNotFoundException to handle
     * @return ResponseEntity NOT FOUND with exception body message
     * @since 1.0
     */
    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<String> recursoNoEncontrado(ResourceNotFoundException ex){
        logger.error(ex.getMessage());
        return ResponseEntity.status( HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}