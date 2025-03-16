package bcnc.group.domain.price.ports.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import bcnc.group.domain.price.model.ProductPrice;

public interface ProductPriceRepository {
  Optional<ProductPrice> getPriceByProductBrandAndDate(
      Long productId, Long brandId, LocalDateTime date);
}