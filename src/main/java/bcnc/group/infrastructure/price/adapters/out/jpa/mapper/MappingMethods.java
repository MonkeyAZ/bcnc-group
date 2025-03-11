package bcnc.group.infrastructure.price.adapters.out.jpa.mapper;

import java.time.LocalDateTime;

import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import bcnc.group.domain.price.model.BrandId;
import bcnc.group.domain.price.model.Currency;
import bcnc.group.domain.price.model.EndDate;
import bcnc.group.domain.price.model.Price;
import bcnc.group.domain.price.model.PriceList;
import bcnc.group.domain.price.model.Priority;
import bcnc.group.domain.price.model.ProductId;
import bcnc.group.domain.price.model.ProductPriceId;
import bcnc.group.domain.price.model.StartDate;

@Component
public class MappingMethods {

    @Named("toProductPriceId")
    public ProductPriceId toProductPriceId(Long productPriceId) {
        return new ProductPriceId(productPriceId);
    }

    @Named("toBrandId")
    public BrandId toBrandId(Long brandId) {
        return new BrandId(brandId);
    }

    @Named("toProductId")
    public ProductId toProductId(Long productId) {
        return new ProductId(productId);
    }

    @Named("toStartDate")
    public StartDate toStartDate(LocalDateTime startDate) {
        return new StartDate(startDate);
    }

    @Named("toEndDate")
    public EndDate toEndDate(LocalDateTime endDate) {
        return new EndDate(endDate);
    }

    @Named("toPriceList")
    public PriceList toPriceList(Long priceList) {
        return new PriceList(priceList);
    }

    @Named("toPrice")
    public Price toPrice(Double price) {
        return new Price(price);
    }

    @Named("toCurrency")
    public Currency toCurrency(String currency) {
        return new Currency(currency);
    }

    @Named("toPriority")
    public Priority toPriority(Integer priority) {
        return new Priority(priority);
    }
}
