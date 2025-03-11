package bcnc.group.infrastructure.price.adapters.in.rest.controller;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import bcnc.group.application.price.query.ProductPriceHandler;
import bcnc.group.domain.price.model.dto.query.ProductPriceQuery;
import bcnc.group.infrastructure.price.adapters.in.rest.mapper.PriceMapper;
import bcnc.group.openapi.api.PricesApiDelegate;
import bcnc.group.openapi.model.Price;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProductPriceQueryController implements PricesApiDelegate {

    private final ProductPriceHandler productPriceHandler;
    private final PriceMapper mapper;

    @Override
    public ResponseEntity<Price> getPrice(Long productId, Long brandId, LocalDateTime date) {
        return ResponseEntity.ok(mapper.toApiDto(productPriceHandler.execute(
                new ProductPriceQuery().setBrandId(brandId).setProductId(productId)
                        .setDate(LocalDateTime.from(date)))));
    }
}
