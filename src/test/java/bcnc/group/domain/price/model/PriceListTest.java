package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;

class PriceListTest {

  @Test
  void testPriceList() {
    PriceList priceList = new PriceList(1L);
    assertEquals(1L, priceList.getValue());
  }

  @Test
  void testPriceListWithNullPriceListId() {
    ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new PriceList(null));
    assertEquals(ProductPriceExceptionEnum.PRICE_LIST_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }

  @Test
  void testPriceListWithNegativeNumber(){
    ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new PriceList(-1L));
    assertEquals(ProductPriceExceptionEnum.PRICE_LIST_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }
}
