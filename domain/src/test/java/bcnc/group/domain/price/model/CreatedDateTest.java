package bcnc.group.domain.price.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.OffsetDateTime;

import org.junit.jupiter.api.Test;

class CreatedDateTest {

  @Test
  void testCreatedDate() {
    OffsetDateTime date = OffsetDateTime.now();
    CreatedDate createdDate = new CreatedDate(date);
    assertEquals(date, createdDate.getValue());
  }
}
