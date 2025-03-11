package bcnc.group.domain.price.model.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class ProductPriceNotFoundExceptionTest {
    @Test
    void testGetErrorMessage() {
        LocalDateTime now = LocalDateTime.now();
        ProductPriceNotFoundException productPriceNotFoundException = new ProductPriceNotFoundException(0l, 0l, now);
        assertEquals(new StringBuilder()
                .append("Product price not found for productId: ")
                .append(0l)
                .append(", brandId: ")
                .append(0l)
                .append(", date: ")
                .append(now)
                .toString(), productPriceNotFoundException.getErrorMessage());

    }
}
