package bcnc.group.infrastructure.price.adapters.in.rest.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceNotFoundException;

@ControllerAdvice
public class PriceControllerAdvice {

    @ExceptionHandler(ProductPriceException.class)
    public ResponseEntity<String> handleEmptyInput(ProductPriceException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ProductPriceNotFoundException.class)
    public ResponseEntity<String> handleProductPriceNotFoundException(ProductPriceNotFoundException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.NOT_FOUND);
    }

}