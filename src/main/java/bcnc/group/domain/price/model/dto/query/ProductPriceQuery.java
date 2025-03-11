package bcnc.group.domain.price.model.dto.query;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProductPriceQuery {
    private Long productId;
    private Long brandId;
    private LocalDateTime date;
}
