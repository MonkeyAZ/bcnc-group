package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;

class EndDateTest {

  @Test
  void testEndDate() {
    LocalDateTime date = LocalDateTime.now();
    EndDate endDate = new EndDate(date);
    assertEquals(date, endDate.getValue());
  }

  @Test
  void testEndDateWithNullEndDate() {
    ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new EndDate(null));
    assertEquals(ProductPriceExceptionEnum.END_DATE_MUST_BE_A_VALID_DATE.getMessage(), ex.getErrorMessage());
  }
}
