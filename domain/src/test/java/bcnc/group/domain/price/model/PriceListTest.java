package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bcnc.group.domain.price.exception.PriceException;
import bcnc.group.domain.price.exception.PriceExceptionEnum;

import org.junit.jupiter.api.Test;

class PriceListTest {

  @Test
  void testPriceList() {
    PriceList priceList = new PriceList(1L);
    assertEquals(1L, priceList.getValue());
  }

  @Test
  void testPriceListWithNullPriceListId() {
    PriceException ex = assertThrows(PriceException.class, () -> new PriceList(null));
    assertEquals(PriceExceptionEnum.PRICE_LIST_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }

  @Test
  void testPriceListWithNegativeNumber(){
    PriceException ex = assertThrows(PriceException.class, () -> new PriceList(-1L));
    assertEquals(PriceExceptionEnum.PRICE_LIST_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }
}
