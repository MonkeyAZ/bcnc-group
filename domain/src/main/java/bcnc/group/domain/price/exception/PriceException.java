package bcnc.group.domain.price.exception;

public class PriceException extends RuntimeException {

  private final String errorMessage;

  public PriceException(PriceExceptionEnum message) {
    this.errorMessage = message.getMessage();
  }

  public String getErrorMessage() {
    return errorMessage;
  }
}
