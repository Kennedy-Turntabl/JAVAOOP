
public abstract class Product {
    private String productId;
    private double value;
    private String kindOfProduct;
    private String exchange;

    public Product(String productId, double value, String kindOfProduct, String exchange){
        this.productId = productId;
        this.value = value;
        this.kindOfProduct = kindOfProduct;
        this.exchange = exchange;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getExchange() {
        return exchange;
    }

    public String getKindOfProduct() {
        return kindOfProduct;
    }
}
