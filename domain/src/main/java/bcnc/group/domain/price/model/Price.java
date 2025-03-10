package bcnc.group.domain.price.model;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Price {
  private Double value;

  public Price(Double value) {
    this.value = validate(value);
  }

  private Double validate(Double value) {

    if (value == null || value < 0) {
      throw new ProductPriceException(ProductPriceExceptionEnum.PRICE_MUST_BE_A_POSITIVE_NUMBER);
    }

    return value;
  }
}
