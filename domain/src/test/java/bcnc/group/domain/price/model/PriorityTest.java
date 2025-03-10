package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bcnc.group.domain.price.exception.PriceException;
import bcnc.group.domain.price.exception.PriceExceptionEnum;

import org.junit.jupiter.api.Test;

class PriorityTest {
  @Test
  void testPriority() {
    Priority priority = new Priority(1);
    assertEquals(1, priority.getValue());
  }

  @Test
  void testPriorityWithNullValue(){
    PriceException ex = assertThrows(PriceException.class, () -> new Priority(null));
    assertEquals(PriceExceptionEnum.PRIORITY_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }

  @Test
  void testPriorityNegative() {
    PriceException ex = assertThrows(PriceException.class, () -> new Priority(-1));
    assertEquals(PriceExceptionEnum.PRIORITY_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }
}
