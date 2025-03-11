package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;

class StartDateTest {

  @Test
  void testStartDate() {
    LocalDateTime date = LocalDateTime.now();
    StartDate startDate = new StartDate(date);
    assertEquals(date, startDate.getValue());
  }

  @Test
  void testStartDateWithNullEndDate() {
    ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new StartDate(null));
    assertEquals(ProductPriceExceptionEnum.START_DATE_MUST_BE_A_VALID_DATE.getMessage(), ex.getErrorMessage());
  }
}
