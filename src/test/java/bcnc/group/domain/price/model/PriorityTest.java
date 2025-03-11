package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;

class PriorityTest {
  @Test
  void testPriority() {
    Priority priority = new Priority(1);
    assertEquals(1, priority.getValue());
  }

  @Test
  void testPriorityWithNullValue(){
    ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new Priority(null));
    assertEquals(ProductPriceExceptionEnum.PRIORITY_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }

  @Test
  void testPriorityNegative() {
    ProductPriceException ex = assertThrows(ProductPriceException.class, () -> new Priority(-1));
    assertEquals(ProductPriceExceptionEnum.PRIORITY_MUST_BE_A_POSITIVE_NUMBER.getMessage(), ex.getErrorMessage());
  }
}
