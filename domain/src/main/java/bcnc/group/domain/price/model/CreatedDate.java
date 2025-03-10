package bcnc.group.domain.price.model;

import java.time.OffsetDateTime;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CreatedDate {
  private OffsetDateTime value;

  public CreatedDate(OffsetDateTime value) {
    this.value = validate(value);
  }

  private OffsetDateTime validate(OffsetDateTime value) {    
    return value;
  }
}