package bcnc.group.domain.price.model;

import bcnc.group.domain.price.exception.PriceException;
import bcnc.group.domain.price.exception.PriceExceptionEnum;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProductPriceId {
  private Long value;

  public ProductPriceId(Long value) {
    this.value = validate(value);
  }

  private Long validate(Long value) {

    if (value == null || value < 0) {
      throw new PriceException(PriceExceptionEnum.PRICE_ID_MUST_BE_A_POSITIVE_NUMBER);
    }

    return value;
  }
}
