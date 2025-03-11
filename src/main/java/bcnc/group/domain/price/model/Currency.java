package bcnc.group.domain.price.model;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Currency {
  private String value;

  public Currency(String value) {
    this.value = validate(value);
  }

  private String validate(String value) {
    if (value == null || value.isEmpty()) {
      throw new ProductPriceException(ProductPriceExceptionEnum.CURRENCY_MUST_BE_A_VALID_CURRENCY);
    }
    return value;
  }
}
