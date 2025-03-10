package bcnc.group.domain.price.model;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;
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
      throw new ProductPriceException(ProductPriceExceptionEnum.PRIORITY_MUST_BE_A_POSITIVE_NUMBER);
    }

    return value;
  }
}
