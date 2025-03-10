package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bcnc.group.domain.price.exception.PriceException;
import bcnc.group.domain.price.exception.PriceExceptionEnum;

import org.junit.jupiter.api.Test;

class ProductPriceIdTest {

  @Test
  void testProductPriceId() {
    ProductPriceId productPriceId = new ProductPriceId(1L);
    assertEquals(1L, productPriceId.getValue());
  }

  @Test
  void testProductPriceIdWithNullPriceId() {
    PriceException ex = assertThrows(PriceException.class, () -> new ProductPriceId(null));
    assertEquals(PriceExceptionEnum.PRICE_ID_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }
  @Test
  void testProductPriceIdWithNegativeNumber() {
    PriceException ex = assertThrows(PriceException.class, () -> new ProductPriceId(-1L));
    assertEquals(PriceExceptionEnum.PRICE_ID_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }
}
