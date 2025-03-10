package bcnc.group.application.price.query;

import org.springframework.stereotype.Component;

import bcnc.group.application.price.mapper.ProductPriceDtoMapper;
import bcnc.group.domain.price.model.dto.ProductPriceDto;
import bcnc.group.domain.price.model.dto.query.ProductPriceQuery;
import bcnc.group.domain.price.service.ProductPriceService;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProductPriceHandler {
    
    private final ProductPriceService productPriceService;
    private final ProductPriceDtoMapper productPriceDtoMapper;
    
    public ProductPriceDto execute(ProductPriceQuery query) {
        return productPriceDtoMapper.toDto(productPriceService.execute(query));
    }
}
