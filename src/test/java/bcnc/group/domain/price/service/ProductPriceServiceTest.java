package bcnc.group.domain.price.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
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

import bcnc.group.domain.price.model.Priority;
import bcnc.group.domain.price.model.ProductPrice;
import bcnc.group.domain.price.model.dto.query.ProductPriceQuery;
import bcnc.group.domain.price.ports.repository.ProductPriceRepository;

@ExtendWith(MockitoExtension.class)
class ProductPriceServiceTest {

        @Mock
        ProductPriceRepository productPriceRepository;

        ProductPriceService productPriceService;

        @BeforeEach
        void init() {
                productPriceService = new ProductPriceService(productPriceRepository);
        }

        @Test
        void testExecuteQuery_withSingleResult() {
                when(productPriceRepository.getPriceByProductBrandAndDate(anyLong(), anyLong(),
                                any(LocalDateTime.class)))
                                .thenReturn(List.of(new ProductPrice()));
                assertNotNull(productPriceService
                                .execute(new ProductPriceQuery().setBrandId(0L).setProductId(0L)
                                                .setDate(LocalDateTime.now())));
        }

        @Test
        void testExecuteQuery_withMultipleResults() {
                ProductPrice p1 = new ProductPrice().setPriority(new Priority(10));
                ProductPrice p2 = new ProductPrice().setPriority(new Priority(20));

                List<ProductPrice> producPriceList = List.of(p1, p2);

                when(productPriceRepository.getPriceByProductBrandAndDate(anyLong(), anyLong(),
                                any(LocalDateTime.class)))
                                .thenReturn(producPriceList);
                assertEquals(20, productPriceService
                                .execute(new ProductPriceQuery().setBrandId(0L).setProductId(0L)
                                                .setDate(LocalDateTime.now()))
                                .getPriority().getValue());
        }

        @Test
        void testExecuteQuery_withEmptyResult() {
                when(productPriceRepository.getPriceByProductBrandAndDate(anyLong(), anyLong(),
                                any(LocalDateTime.class)))
                                .thenReturn(List.of());

                assertNull(productPriceService
                                .execute(new ProductPriceQuery().setBrandId(0L).setProductId(0L)
                                                .setDate(LocalDateTime.now())));
        }
}
