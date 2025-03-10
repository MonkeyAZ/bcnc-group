package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bcnc.group.domain.price.exception.PriceException;
import bcnc.group.domain.price.exception.PriceExceptionEnum;

import org.junit.jupiter.api.Test;

class ProductIdTest {
  @Test
  void testProductId() {
    ProductId productId = new ProductId(1L);
    assertEquals(1L, productId.getValue());
  }

  @Test
  void testProductIdNull() {
    PriceException ex = assertThrows(PriceException.class, () -> new ProductId(null));
    assertEquals(PriceExceptionEnum.PRODUCT_ID_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }
  @Test
  void testProductIdNegativeNumber() {
    PriceException ex = assertThrows(PriceException.class, () -> new ProductId(-1L));
    assertEquals(PriceExceptionEnum.PRODUCT_ID_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }
}
