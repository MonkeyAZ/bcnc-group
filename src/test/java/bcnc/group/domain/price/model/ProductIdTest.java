package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;

class ProductIdTest {
  @Test
  void testProductId() {
    ProductId productId = new ProductId(1L);
    assertEquals(1L, productId.getValue());
  }

  @Test
  void testProductIdNull() {
    ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new ProductId(null));
    assertEquals(ProductPriceExceptionEnum.PRODUCT_ID_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }
  @Test
  void testProductIdNegativeNumber() {
    ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new ProductId(-1L));
    assertEquals(ProductPriceExceptionEnum.PRODUCT_ID_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }
}
