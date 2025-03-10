package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bcnc.group.domain.price.exception.PriceException;
import bcnc.group.domain.price.exception.PriceExceptionEnum;

import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;

class EndDateTest {

  @Test
  void testEndDate() {
    OffsetDateTime date = OffsetDateTime.now();
    EndDate endDate = new EndDate(date);
    assertEquals(date, endDate.getValue());
  }

  @Test
  void testEndDateWithNullEndDate() {
    PriceException ex = assertThrows(PriceException.class, () -> new EndDate(null));
    assertEquals(PriceExceptionEnum.END_DATE_MUST_BE_A_VALID_DATE.getMessage(), ex.getErrorMessage());
  }
}
