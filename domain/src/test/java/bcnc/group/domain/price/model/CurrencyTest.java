package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;

class CurrencyTest {

  @Test
  void testCurrency() {
    Currency currency = new Currency("USD");
    assertEquals("USD", currency.getValue());
  }

  @Test
  void testCurrencyWithNullCurrency() {
    ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new Currency(null));
    assertEquals(ProductPriceExceptionEnum.CURRENCY_MUST_BE_A_VALID_CURRENCY.getMessage(), ex.getErrorMessage());
  }

  @Test
  void testCurrencyWithEmptyCurrency() {
    ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new Currency(""));
    assertEquals(ProductPriceExceptionEnum.CURRENCY_MUST_BE_A_VALID_CURRENCY.getMessage(), ex.getErrorMessage());
  }
}
