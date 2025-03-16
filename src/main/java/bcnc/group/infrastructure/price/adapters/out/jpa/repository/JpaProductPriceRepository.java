package bcnc.group.infrastructure.price.adapters.out.jpa.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bcnc.group.infrastructure.price.adapters.out.jpa.entity.ProductPriceEntity;

public interface JpaProductPriceRepository extends JpaRepository<ProductPriceEntity, Long> {

    @Query(value = "SELECT p1.* FROM PRICES as p1 " +
            "JOIN" +
            "(SELECT BRAND_ID, PRODUCT_ID, MAX(PRIORITY) PRIORITY " +
            "FROM PRICES " +
            "WHERE BRAND_ID = :brandId AND PRODUCT_ID = :productId AND START_DATE <= :date AND END_DATE >= :date " +
            "GROUP BY BRAND_ID, PRODUCT_ID) as p2 " +
            "ON  " +
            "p1.BRAND_ID = p2.BRAND_ID AND " +
            "p1.PRODUCT_ID = p2.PRODUCT_ID AND " +
            "p1.PRIORITY = p2.PRIORITY " +
            "WHERE p1.START_DATE <= :date AND p1.END_DATE >= :date", nativeQuery = true)
    Optional<ProductPriceEntity> getPriceByProductBrandAndDate(Long productId, Long brandId, LocalDateTime date);

}
