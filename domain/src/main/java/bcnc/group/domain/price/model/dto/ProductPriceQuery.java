package bcnc.group.domain.price.model.dto;

import java.time.OffsetDateTime;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProductPriceQuery {
    private Long productId;
    private Long brandId;
    private OffsetDateTime date;
}
