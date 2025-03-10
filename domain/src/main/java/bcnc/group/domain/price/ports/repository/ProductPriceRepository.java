package bcnc.group.domain.price.ports.repository;

import java.time.OffsetDateTime;
import java.util.List;

import bcnc.group.domain.price.model.ProductPrice;

public interface ProductPriceRepository {
  List<ProductPrice> getPriceByProductBrandAndDate(
      Long productId, Long brandId, OffsetDateTime date);
}