package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.OffsetDateTime;

import org.junit.jupiter.api.Test;

class UpdatedDateTest {

  @Test
  void testUpdatedDate() {
    OffsetDateTime date = OffsetDateTime.now();
    UpdatedDate updatedDate = new UpdatedDate(date);
    assertEquals(date, updatedDate.getValue());
  }
}
