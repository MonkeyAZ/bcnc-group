package bcnc.group.domain.price.model.exception;

public class ProductPriceException extends RuntimeException {

  private final String errorMessage;

  public ProductPriceException(ProductPriceExceptionEnum message) {
    this.errorMessage = message.getMessage();
  }

  public String getErrorMessage() {
    return errorMessage;
  }
}
