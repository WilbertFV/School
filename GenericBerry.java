public class GenericBerry<T, K> {
  private T price;
  private K expirationDate;

  public GenericBerry(T price, K expirationDate) {
      this.price = price;
      this.expirationDate = expirationDate;
  }

  public T getPrice() {
      return price;
  }

  public void setPrice(T price) {
      this.price = price;
  }

  public K getExpirationDate() {
      return expirationDate;
  }

  public void setExpirationDate(K expirationDate) {
      this.expirationDate = expirationDate;
  }

  @Override
  public String toString() {
      return "GenericBerry{" +
              "price=" + price +
              ", expirationDate=" + expirationDate +
              '}';
  }
}
