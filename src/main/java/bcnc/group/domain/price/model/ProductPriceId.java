package bcnc.group.domain.price.model;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;
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
      throw new ProductPriceException(ProductPriceExceptionEnum.PRICE_ID_MUST_BE_A_POSITIVE_NUMBER);
    }

    return value;
  }
}
