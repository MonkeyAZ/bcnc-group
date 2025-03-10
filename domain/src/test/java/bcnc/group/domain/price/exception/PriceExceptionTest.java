package bcnc.group.domain.price.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PriceExceptionTest {

  @Test
  void testPriceException() {
    PriceException priceException =
        new PriceException(PriceExceptionEnum.PRICE_MUST_BE_A_POSITIVE_NUMBER);
    assertEquals("Price must be a positive number", priceException.getErrorMessage());
  }
}
