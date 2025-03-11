package bcnc.group.infrastructure.price.adapters.in.rest.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import bcnc.group.application.price.query.ProductPriceHandler;
import bcnc.group.domain.price.model.dto.ProductPriceDto;
import bcnc.group.domain.price.model.dto.query.ProductPriceQuery;
import bcnc.group.infrastructure.price.adapters.in.rest.mapper.PriceMapper;
import bcnc.group.openapi.model.Price;

@ExtendWith(MockitoExtension.class)
class ProductPriceQueryControllerTest {

    @Mock
    ProductPriceHandler productPriceHandler;

    @Mock
    PriceMapper mapper;

    ProductPriceQueryController productPriceQueryController;

    @BeforeEach
    void init() {
        productPriceQueryController = new ProductPriceQueryController(productPriceHandler, mapper);
    }

    @Test
    void testGetPrice() {
        when(productPriceHandler.execute(any(ProductPriceQuery.class))).thenReturn(new ProductPriceDto());
        when(mapper.toApiDto(any(ProductPriceDto.class))).thenReturn(new Price());
        assertNotNull(productPriceQueryController.getPrice(0L, 0L, LocalDateTime.now()));
    }
}
