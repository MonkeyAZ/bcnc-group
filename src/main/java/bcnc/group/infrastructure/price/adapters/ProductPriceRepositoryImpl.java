package bcnc.group.infrastructure.price.adapters;

import java.time.LocalDateTime;
import java.util.Optional;

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
    public Optional<ProductPrice> getPriceByProductBrandAndDate(Long productId, Long brandId, LocalDateTime date) {
        Optional<ProductPriceEntity> priceByProductBrandAndDate = jpaProductPriceRepository
                .getPriceByProductBrandAndDate(productId, brandId, date);

        return Optional.ofNullable(productPriceEntityMapper.toDomain(priceByProductBrandAndDate.orElse(null)));
    }

}
