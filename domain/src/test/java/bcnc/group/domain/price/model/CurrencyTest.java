package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bcnc.group.domain.price.exception.PriceException;
import bcnc.group.domain.price.exception.PriceExceptionEnum;

import org.junit.jupiter.api.Test;

class CurrencyTest {

  @Test
  void testCurrency() {
    Currency currency = new Currency("USD");
    assertEquals("USD", currency.getValue());
  }

  @Test
  void testCurrencyWithNullCurrency() {
    PriceException ex = assertThrows(PriceException.class, () -> new Currency(null));
    assertEquals(PriceExceptionEnum.CURRENCY_MUST_BE_A_VALID_CURRENCY.getMessage(), ex.getErrorMessage());
  }

  @Test
  void testCurrencyWithEmptyCurrency() {
    PriceException ex = assertThrows(PriceException.class, () -> new Currency(""));
    assertEquals(PriceExceptionEnum.CURRENCY_MUST_BE_A_VALID_CURRENCY.getMessage(), ex.getErrorMessage());
  }
}
