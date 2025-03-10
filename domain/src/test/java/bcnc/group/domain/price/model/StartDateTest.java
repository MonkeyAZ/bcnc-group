package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bcnc.group.domain.price.exception.PriceException;
import bcnc.group.domain.price.exception.PriceExceptionEnum;

import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;

class StartDateTest {

  @Test
  void testStartDate() {
    OffsetDateTime date = OffsetDateTime.now();
    StartDate startDate = new StartDate(date);
    assertEquals(date, startDate.getValue());
  }

  @Test
  void testStartDateWithNullEndDate() {
    PriceException ex = assertThrows(PriceException.class, () -> new StartDate(null));
    assertEquals(PriceExceptionEnum.START_DATE_MUST_BE_A_VALID_DATE.getMessage(), ex.getErrorMessage());
  }
}
