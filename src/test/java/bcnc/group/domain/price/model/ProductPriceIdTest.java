package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;

class ProductPriceIdTest {

  @Test
  void testProductPriceId() {
    ProductPriceId productPriceId = new ProductPriceId(1L);
    assertEquals(1L, productPriceId.getValue());
  }

  @Test
  void testProductPriceIdWithNullPriceId() {
    ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new ProductPriceId(null));
    assertEquals(ProductPriceExceptionEnum.PRICE_ID_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }

  @Test
  void testProductPriceIdWithNegativeNumber() {
    ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new ProductPriceId(-1L));
    assertEquals(ProductPriceExceptionEnum.PRICE_ID_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }
}
