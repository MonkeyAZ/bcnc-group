package bcnc.group.domain.price.model;

import java.time.OffsetDateTime;

import bcnc.group.domain.price.model.exception.ProductPriceException;
import bcnc.group.domain.price.model.exception.ProductPriceExceptionEnum;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class StartDate {
  private OffsetDateTime value;

  public StartDate(OffsetDateTime value) {
    this.value = validate(value);
  }

  private OffsetDateTime validate(OffsetDateTime value) {
    if (value == null) {
      throw new ProductPriceException(ProductPriceExceptionEnum.START_DATE_MUST_BE_A_VALID_DATE);
    }
    
    return value;
  }
}
