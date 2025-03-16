package bcnc.group.infrastructure.price.adapters.in.rest.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceNotFoundException;
import bcnc.group.openapi.model.CommonError;

@ControllerAdvice
public class PriceControllerAdvice {

    @ExceptionHandler(ProductPriceException.class)
    public ResponseEntity<CommonError> handleEmptyInput(ProductPriceException exception) {
        return new ResponseEntity<>(new CommonError().code(HttpStatus.BAD_REQUEST.value())
                .message(exception.getErrorMessage()).timestamp(LocalDateTime.now()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ProductPriceNotFoundException.class)
    public ResponseEntity<CommonError> handleProductPriceNotFoundException(ProductPriceNotFoundException exception) {
        return new ResponseEntity<>(new CommonError().code(HttpStatus.NOT_FOUND.value())
                .message(exception.getErrorMessage()).timestamp(LocalDateTime.now()), HttpStatus.NOT_FOUND);
    }

}