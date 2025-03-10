package bcnc.group.domain.price.model.exception;

public enum ProductPriceExceptionEnum {
  PRICE_ID_MUST_BE_A_POSITIVE_NUMBER("PriceId must be a positive number"),
  PRODUCT_ID_MUST_BE_A_POSITIVE_NUMBER("ProductId must be a positive number"),
  BRAND_ID_MUST_BE_A_POSITIVE_NUMBER("BrandId must be a positive number"),
  START_DATE_MUST_BE_A_VALID_DATE("StartDate must be a valid date"),
  END_DATE_MUST_BE_A_VALID_DATE("EndDate must be a valid date"),
  PRICE_LIST_MUST_BE_A_POSITIVE_NUMBER("PriceList must be a positive number"),
  PRIORITY_MUST_BE_A_POSITIVE_NUMBER("Priority must be a positive number"),
  PRICE_MUST_BE_A_POSITIVE_NUMBER("Price must be a positive number"),
  CURRENCY_MUST_BE_A_VALID_CURRENCY("Currency must be a valid currency"),
  ;

  private final String message;

  ProductPriceExceptionEnum(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
