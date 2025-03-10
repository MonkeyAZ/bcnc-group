package bcnc.group.domain.price.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;

class PriceExceptionTest {

  @Test
  void testPriceException() {
    ProductPriceException priceException =
        new ProductPriceException(ProductPriceExceptionEnum.PRICE_MUST_BE_A_POSITIVE_NUMBER);
    assertEquals("Price must be a positive number", priceException.getErrorMessage());
  }
}
