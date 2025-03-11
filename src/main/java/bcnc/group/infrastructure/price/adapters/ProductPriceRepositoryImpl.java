package bcnc.group.infrastructure.price.adapters;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import bcnc.group.domain.price.model.ProductPrice;
import bcnc.group.domain.price.ports.repository.ProductPriceRepository;
import bcnc.group.infrastructure.price.adapters.out.jpa.entity.ProductPriceEntity;
import bcnc.group.infrastructure.price.adapters.out.jpa.mapper.ProductPriceEntityMapper;
import bcnc.group.infrastructure.price.adapters.out.jpa.repository.JpaProductPriceRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ProductPriceRepositoryImpl implements ProductPriceRepository {

    private final JpaProductPriceRepository jpaProductPriceRepository;
    private final ProductPriceEntityMapper productPriceEntityMapper;

    @Override
    public List<ProductPrice> getPriceByProductBrandAndDate(Long productId, Long brandId, LocalDateTime date) {
        List<ProductPriceEntity> priceByProductBrandAndDate = jpaProductPriceRepository
                .getPriceByProductBrandAndDate(productId, brandId, date);

        return priceByProductBrandAndDate.stream().map(productPriceEntityMapper::toDomain).toList();
    }

}
