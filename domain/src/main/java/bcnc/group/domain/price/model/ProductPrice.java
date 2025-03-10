package bcnc.group.domain.price.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProductPrice {
  private ProductPriceId priceId;
  private ProductId productId;
  private BrandId brandId;
  private StartDate startDate;
  private EndDate endDate;
  private PriceList priceList;
  private Priority priority;
  private Price price;
  private Currency currency;
}
