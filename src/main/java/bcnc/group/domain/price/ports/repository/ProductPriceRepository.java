package bcnc.group.domain.price.ports.repository;

import java.time.LocalDateTime;
import java.util.List;

import bcnc.group.domain.price.model.ProductPrice;

public interface ProductPriceRepository {
  List<ProductPrice> getPriceByProductBrandAndDate(
      Long productId, Long brandId, LocalDateTime date);
}