package bcnc.group.domain.price.model;

import java.time.LocalDateTime;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class EndDate {
  private LocalDateTime value;

  public EndDate(LocalDateTime value) {
    this.value = validate(value);
  }

  private LocalDateTime validate(LocalDateTime value) {
    if (value == null) {
      throw new ProductPriceException(ProductPriceExceptionEnum.END_DATE_MUST_BE_A_VALID_DATE);
    }

    return value;
  }
}
