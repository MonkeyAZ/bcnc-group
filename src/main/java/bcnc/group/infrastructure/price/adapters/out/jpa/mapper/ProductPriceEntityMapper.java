package bcnc.group.infrastructure.price.adapters.out.jpa.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import bcnc.group.domain.price.model.ProductPrice;
import bcnc.group.infrastructure.price.adapters.out.jpa.entity.ProductPriceEntity;

@Mapper(componentModel = "spring", uses = MappingMethods.class)
public interface ProductPriceEntityMapper {

    @Mapping(target = "productPriceId", source = "productPriceId", qualifiedByName = "toProductPriceId")
    @Mapping(target = "brandId", source = "brandId", qualifiedByName = "toBrandId")
    @Mapping(target = "productId", source = "productId", qualifiedByName = "toProductId")
    @Mapping(target = "startDate", source = "startDate", qualifiedByName = "toStartDate")
    @Mapping(target = "endDate", source = "endDate", qualifiedByName = "toEndDate")
    @Mapping(target = "priceList", source = "priceList", qualifiedByName = "toPriceList")
    @Mapping(target = "price", source = "price", qualifiedByName = "toPrice")
    @Mapping(target = "currency", source = "currency", qualifiedByName = "toCurrency")
    @Mapping(target = "priority", source = "priority", qualifiedByName = "toPriority")
    ProductPrice toDomain(ProductPriceEntity entity);
}
