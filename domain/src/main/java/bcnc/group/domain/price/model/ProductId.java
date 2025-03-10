package bcnc.group.domain.price.model;

import bcnc.group.domain.price.exception.PriceException;
import bcnc.group.domain.price.exception.PriceExceptionEnum;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProductId {
  private final Long value;

  public ProductId(Long value) {
    this.value = validate(value);
  }

  private Long validate(Long value) {

    if (value == null || value < 0) {
      throw new PriceException(PriceExceptionEnum.PRODUCT_ID_MUST_BE_A_POSITIVE_NUMBER);
    }

    return value;
  }
}
