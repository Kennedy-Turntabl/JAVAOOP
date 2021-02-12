public class Future extends Product {
    private String contractCode;
    private int contractMonth;
    private int contractYear;

    public Future(String productId, double value, String kindOfProduct, String exchange) {
        super(productId, value, kindOfProduct, exchange);
    }
}
