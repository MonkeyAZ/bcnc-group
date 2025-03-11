package bcnc.group.domain.price.model.exception;

import java.time.LocalDateTime;

public class ProductPriceNotFoundException extends RuntimeException {

    private final String errorMessage;

    public ProductPriceNotFoundException(Long productId, Long brandId, LocalDateTime date) {
        this.errorMessage = new StringBuilder()
                .append("Product price not found for productId: ")
                .append(productId)
                .append(", brandId: ")
                .append(brandId)
                .append(", date: ")
                .append(date)
                .toString();
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
