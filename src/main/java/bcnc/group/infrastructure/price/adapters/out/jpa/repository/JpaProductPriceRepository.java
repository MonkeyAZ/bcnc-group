package bcnc.group.infrastructure.price.adapters.out.jpa.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bcnc.group.infrastructure.price.adapters.out.jpa.entity.ProductPriceEntity;

public interface JpaProductPriceRepository extends JpaRepository<ProductPriceEntity, Long> {

    @Query("SELECT pp FROM ProductPriceEntity pp " +
            "WHERE pp.productId = :productId " +
            "AND pp.brandId = :brandId " +
            "AND (pp.startDate <= :date AND pp.endDate >= :date)")
    List<ProductPriceEntity> getPriceByProductBrandAndDate(Long productId, Long brandId, LocalDateTime date);

}
