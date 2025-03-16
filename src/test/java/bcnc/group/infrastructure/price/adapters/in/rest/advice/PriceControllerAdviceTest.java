package bcnc.group.infrastructure.price.adapters.in.rest.advice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;
import bcnc.group.domain.price.model.exception.ProductPriceNotFoundException;
import bcnc.group.openapi.model.CommonError;

class PriceControllerAdviceTest {
    @Test
    void testHandleEmptyInput() {
        PriceControllerAdvice priceControllerAdvice = new PriceControllerAdvice();
        ProductPriceException exception = new ProductPriceException(
                ProductPriceExceptionEnum.BRAND_ID_MUST_BE_A_POSITIVE_NUMBER);

        ResponseEntity<CommonError> result = priceControllerAdvice.handleEmptyInput(exception);

        assertEquals(ProductPriceExceptionEnum.BRAND_ID_MUST_BE_A_POSITIVE_NUMBER.getMessage(),
                result.getBody().getMessage());
        assertEquals(HttpStatus.BAD_REQUEST, result.getStatusCode());
    }

    @Test
    void testHandleProductPriceNotFoundException() {
        PriceControllerAdvice priceControllerAdvice = new PriceControllerAdvice();
        ProductPriceNotFoundException exception = new ProductPriceNotFoundException(
                0l, 0l, LocalDateTime.now());

        ResponseEntity<CommonError> result = priceControllerAdvice.handleProductPriceNotFoundException(exception);

        assertEquals(HttpStatus.NOT_FOUND, result.getStatusCode());

    }
}
