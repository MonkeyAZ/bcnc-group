package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;

class PriceTest {

    @Test
    void testPrice() {
        Price price = new Price(1.0);
        assertEquals(1.0, price.getValue());
    }

    @Test
    void testPrice_NullValue() {
        ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new Price(null));
        assertEquals(ProductPriceExceptionEnum.PRICE_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
    }

    @Test
    void testPrice_NegativeValue() {
        ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new Price(-1.0));
        assertEquals(ProductPriceExceptionEnum.PRICE_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
    }
}
