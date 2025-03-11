package bcnc.group.infrastructure.price.adapters;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import bcnc.group.infrastructure.price.adapters.out.jpa.entity.ProductPriceEntity;
import bcnc.group.infrastructure.price.adapters.out.jpa.mapper.ProductPriceEntityMapper;
import bcnc.group.infrastructure.price.adapters.out.jpa.repository.JpaProductPriceRepository;

@ExtendWith(MockitoExtension.class)
class ProductPriceRepositoryImplTest {

    @Mock
    JpaProductPriceRepository jpaProductPriceRepository;

    @Mock
    ProductPriceEntityMapper productPriceEntityMapper;

    ProductPriceRepositoryImpl productPriceRepositoryImpl;

    @BeforeEach
    void init() {
        productPriceRepositoryImpl = new ProductPriceRepositoryImpl(jpaProductPriceRepository,
                productPriceEntityMapper);
    }

    @Test
    void testGetPriceByProductBrandAndDate() {
        when(jpaProductPriceRepository.getPriceByProductBrandAndDate(anyLong(), anyLong(), any(LocalDateTime.class)))
                .thenReturn(List.of(new ProductPriceEntity()));
        assertNotNull(productPriceRepositoryImpl.getPriceByProductBrandAndDate(0L, 0L, LocalDateTime.now()));
    }
}
