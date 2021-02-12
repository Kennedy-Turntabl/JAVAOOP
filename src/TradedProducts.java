
import java.util.HashMap;
import java.util.Map;

public class TradedProducts implements MontrealTradedProducts {
    Map<Product, Integer> daysProducts = new HashMap<>();

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        int DEFAULT_QTY = 0;

        for (Map.Entry<Product, Integer> entry : daysProducts.entrySet()) {
            if(entry.getKey().getProductId().equals(product.getProductId())){
                throw new ProductAlreadyRegisteredException("This product already exists");
            }
        }
        daysProducts.put(product, DEFAULT_QTY);

    }

    @Override
    public void trade(Product product, int quantity) {
        for (Map.Entry<Product, Integer> entry : daysProducts.entrySet()) {
            if(!(entry.getKey().getProductId().equals(product.getProductId()))){
                daysProducts.put(product, quantity);
            }
        }
    }

    @Override
    public int totalTradeQuantityForDay() {
        int total_quantity = 0;
        for (Map.Entry<Product, Integer> entry : daysProducts.entrySet()) {
            total_quantity += entry.getValue();
        }

        return total_quantity;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        double total_value = 0.0;
        for (Map.Entry<Product, Integer> entry : daysProducts.entrySet()) {
            total_value += (entry.getKey().getValue()) * entry.getValue();
        }
        return total_value;
    }
}
