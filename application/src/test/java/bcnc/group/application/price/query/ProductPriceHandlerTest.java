package bcnc.group.application.price.query;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import bcnc.group.application.price.mapper.ProductPriceDtoMapper;
import bcnc.group.domain.price.model.ProductPrice;
import bcnc.group.domain.price.model.dto.ProductPriceDto;
import bcnc.group.domain.price.model.dto.query.ProductPriceQuery;
import bcnc.group.domain.price.service.ProductPriceService;

@ExtendWith(MockitoExtension.class)
class ProductPriceHandlerTest {

    @Mock
    ProductPriceService productPriceService;
    @Mock
    ProductPriceDtoMapper productPriceDtoMapper;

    ProductPriceHandler productPriceHandler;

    @BeforeEach
    void init() {
        productPriceHandler = new ProductPriceHandler(productPriceService, productPriceDtoMapper);
    }

    @Test
    void testExecute_withResults() {
        when(productPriceService.execute(any(ProductPriceQuery.class))).thenReturn(new ProductPrice());
        when(productPriceDtoMapper.toDto(any(ProductPrice.class))).thenReturn(new ProductPriceDto());
        assertNotNull(productPriceHandler.execute(new ProductPriceQuery()));
    }

    @Test
    void testExecute_withNullResult() {
        when(productPriceService.execute(any(ProductPriceQuery.class))).thenReturn(null);
        assertNull(productPriceHandler.execute(new ProductPriceQuery()));
    }
}
