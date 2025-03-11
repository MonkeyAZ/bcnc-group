package bcnc.group.infrastructure.price.adapters.in.rest.mapper;

import org.mapstruct.Mapper;

import bcnc.group.domain.price.model.dto.ProductPriceDto;
import bcnc.group.openapi.model.Price;

@Mapper(componentModel = "spring")
public interface PriceMapper {
    Price toApiDto(ProductPriceDto price);
}
