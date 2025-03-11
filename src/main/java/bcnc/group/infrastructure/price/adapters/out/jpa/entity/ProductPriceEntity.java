package bcnc.group.infrastructure.price.adapters.out.jpa.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Entity
@Table(name = "PRICES")
public class ProductPriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productPriceId;

    @Column(name = "PRODUCT_ID", nullable = false)
    private Long productId;
    @Column(name = "BRAND_ID", nullable = false)
    private Long brandId;
    @Column(name = "START_DATE", nullable = false)
    private LocalDateTime startDate;
    @Column(name = "END_DATE", nullable = false)
    private LocalDateTime endDate;
    @Column(name = "PRICE_LIST", nullable = false)
    private Long priceList;
    @Column(name = "PRICE", nullable = false)
    private Double price;
    @Column(name = "CURR", nullable = false)
    private String currency;
    @Column(name = "PRIORITY", nullable = false)
    private Integer priority;
}
