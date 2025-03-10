package bcnc.group.domain.price.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PriceExceptionEnumTest {

  @Test
  void testPriceExceptionEnum() {
    assertEquals("Price must be a positive number", PriceExceptionEnum.PRICE_MUST_BE_A_POSITIVE_NUMBER
        .getMessage());
    assertEquals("PriceList must be a positive number", PriceExceptionEnum.PRICE_LIST_MUST_BE_A_POSITIVE_NUMBER
        .getMessage());
    assertEquals("Currency must be a valid currency", PriceExceptionEnum.CURRENCY_MUST_BE_A_VALID_CURRENCY
        .getMessage());
    assertEquals("StartDate must be a valid date", PriceExceptionEnum.START_DATE_MUST_BE_A_VALID_DATE
        .getMessage());
    assertEquals("EndDate must be a valid date", PriceExceptionEnum.END_DATE_MUST_BE_A_VALID_DATE
        .getMessage());
    assertEquals("PriceId must be a positive number", PriceExceptionEnum.PRICE_ID_MUST_BE_A_POSITIVE_NUMBER
        .getMessage());
    assertEquals("ProductId must be a positive number", PriceExceptionEnum.PRODUCT_ID_MUST_BE_A_POSITIVE_NUMBER
        .getMessage());
    assertEquals("BrandId must be a positive number", PriceExceptionEnum.BRAND_ID_MUST_BE_A_POSITIVE_NUMBER
        .getMessage());
    assertEquals("Priority must be a positive number", PriceExceptionEnum.PRIORITY_MUST_BE_A_POSITIVE_NUMBER
        .getMessage());
  }
}
