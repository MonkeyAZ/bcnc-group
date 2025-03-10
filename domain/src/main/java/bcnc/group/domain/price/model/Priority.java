package bcnc.group.domain.price.model;

import bcnc.group.domain.price.exception.PriceException;
import bcnc.group.domain.price.exception.PriceExceptionEnum;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Priority {
  private Integer value;

  public Priority(Integer value) {
    this.value = validate(value);
  }

  private Integer validate(Integer value) {

    if (value == null || value < 0) {
      throw new PriceException(PriceExceptionEnum.PRIORITY_MUST_BE_A_POSITIVE_NUMBER);
    }

    return value;
  }
}
