package bcnc.group.domain.price.model.dto;

import java.time.OffsetDateTime;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProductPriceDto {
    private Long productId;
    private Long brandId;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
    private Long priceList;
    private Double price;
    private String currency;
    private Integer priority;
}
