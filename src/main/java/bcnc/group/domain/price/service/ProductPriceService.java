package bcnc.group.domain.price.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import bcnc.group.domain.price.model.ProductPrice;
import bcnc.group.domain.price.model.dto.query.ProductPriceQuery;
import bcnc.group.domain.price.model.exception.ProductPriceNotFoundException;
import bcnc.group.domain.price.ports.repository.ProductPriceRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductPriceService {
        private final ProductPriceRepository priceRepository;

        public ProductPrice execute(ProductPriceQuery query) {
                return priceRepository
                                .getPriceByProductBrandAndDate(query.getProductId(), query.getBrandId(),
                                                query.getDate())
                                .orElseThrow(() -> new ProductPriceNotFoundException(query.getProductId(),
                                                query.getBrandId(), query.getDate()));
        }
}
