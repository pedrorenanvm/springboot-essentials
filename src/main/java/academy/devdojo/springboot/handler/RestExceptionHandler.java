package academy.devdojo.springboot.handler;

import academy.devdojo.springboot.exception.BadRequestException;
import academy.devdojo.springboot.exception.BadRequestExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

// Podemos ter varios tipos de exceções dentro da classe por isso o nome
@ControllerAdvice// aqui falamos para o controller que essa é uma classe onde possui informações a serem usadas por ele
// tem que utilizar o que colocarmos dentro dessa classe, como se fosse uma flag @ExceptionHandler
public class RestExceptionHandler {
@ExceptionHandler(BadRequestException.class) //se voce lançar uma BadRequestException use esse método e seus valores
    public ResponseEntity<BadRequestExceptionDetails> handlerBadRequestException(BadRequestException bre){
    return new ResponseEntity<>(
            BadRequestExceptionDetails.builder()
                    .timestamp(LocalDateTime.now())
                    .status(HttpStatus.BAD_REQUEST.value())
                    .title("Bad Request Exception, Check the Doc")
                    .details(bre.getMessage())
                    .developerMessage(bre.getClass().getName())
                    .build(), HttpStatus.BAD_REQUEST);
    // Falando para os controllers usarem essa BadRequest
    }
}
