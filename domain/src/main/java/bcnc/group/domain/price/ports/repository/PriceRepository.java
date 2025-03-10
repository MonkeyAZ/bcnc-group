package bcnc.group.domain.price.ports.repository;

import bcnc.group.domain.price.model.ProductPrice;
import java.time.OffsetDateTime;
import java.util.Optional;

public interface PriceRepository {
  Optional<ProductPrice> getPriceByProductBrandAndDate(
      Long productId, Long brandId, OffsetDateTime date);
}
