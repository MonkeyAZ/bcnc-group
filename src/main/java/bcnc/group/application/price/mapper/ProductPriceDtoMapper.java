package bcnc.group.application.price.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import bcnc.group.domain.price.model.ProductPrice;
import bcnc.group.domain.price.model.dto.ProductPriceDto;

@Mapper(componentModel = "spring")
public interface ProductPriceDtoMapper {

    @Mapping(target = "brandId", source = "brandId.value")
    @Mapping(target = "productId", source = "productId.value")
    @Mapping(target = "startDate", source = "startDate.value")
    @Mapping(target = "endDate", source = "endDate.value")
    @Mapping(target = "price", source = "price.value")
    @Mapping(target = "currency", source = "currency.value")
    @Mapping(target = "priceList", source = "priceList.value")
    @Mapping(target = "priority", source = "priority.value")
    ProductPriceDto toDto(ProductPrice productPrice);
} 