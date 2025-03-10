package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bcnc.group.domain.price.exception.PriceException;
import bcnc.group.domain.price.exception.PriceExceptionEnum;

import org.junit.jupiter.api.Test;

class BrandIdTest {

  @Test
  void testBrandId() {
    BrandId brandId = new BrandId(1L);
    assertEquals(1L, brandId.getValue());
  }

  @Test
  void testBrandIdWithNullBrandId() {
    PriceException ex = assertThrows(PriceException.class, () -> new BrandId(null));
    assertEquals(PriceExceptionEnum.BRAND_ID_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }

  @Test
  void testBrandIdWithNegativeNumber(){
    PriceException ex = assertThrows(PriceException.class, () -> new BrandId(-1L));
    assertEquals(PriceExceptionEnum.BRAND_ID_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }
}
