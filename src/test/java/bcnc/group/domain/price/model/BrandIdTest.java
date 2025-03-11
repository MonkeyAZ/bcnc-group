package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;

class BrandIdTest {

  @Test
  void testBrandId() {
    BrandId brandId = new BrandId(1L);
    assertEquals(1L, brandId.getValue());
  }

  @Test
  void testBrandIdWithNullBrandId() {
    ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new BrandId(null));
    assertEquals(ProductPriceExceptionEnum.BRAND_ID_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }

  @Test
  void testBrandIdWithNegativeNumber(){
    ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new BrandId(-1L));
    assertEquals(ProductPriceExceptionEnum.BRAND_ID_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }
}
