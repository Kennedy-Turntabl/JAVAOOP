public class Stock extends Product {
    private String ticker;

    private ProductPricingService pricer;

    public Stock(String productId, double value, String kindOfProduct, String exchange) {
        super(productId, value, kindOfProduct, exchange);
    }


    @Override
    public void setValue(double value) {
        pricer.price(this.getExchange(), this.ticker);
        super.setValue(value);
    }
}
