package bcnc.group.domain.price.service;

import java.util.Comparator;
import java.util.List;

import bcnc.group.domain.price.model.ProductPrice;
import bcnc.group.domain.price.model.dto.query.ProductPriceQuery;
import bcnc.group.domain.price.ports.repository.ProductPriceRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductPriceService {
    private final ProductPriceRepository priceRepository;

    public ProductPrice execute(ProductPriceQuery query) {
        List<ProductPrice> priceByProductBrandAndDate = priceRepository
                .getPriceByProductBrandAndDate(query.getProductId(), query.getBrandId(), query.getDate());

        return priceByProductBrandAndDate.stream().max(Comparator.comparing(price -> price.getPriority().getValue()))
                .orElse(null);
    }
}
