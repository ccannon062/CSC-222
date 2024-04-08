import java.util.HashMap;

public class Catalog {
	HashMap<String, Product> map = new HashMap<>();
	
	public void addProduct(Product product) {
		map.put(product.getProductId(), product);
	}
	
	public void removeProduct(String productId) {
		map.remove(productId);
	}
	
	public Product findProduct(String productId) {
		return map.get(productId);
	}
	
	public void displayProducts() {
		for(Product product: map.values()) {
			System.out.println(product);
		}
	}
}
