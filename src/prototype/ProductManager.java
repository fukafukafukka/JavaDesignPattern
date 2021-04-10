package prototype;

import java.util.HashMap;

public class ProductManager {
	private HashMap<String, Product> showcase = new HashMap<String, Product>();
	public void register(String name, Product p) {
		showcase.put(name, p);
	}
	public Product createClone(String productName) {
		Product product = showcase.get(productName);
		return product.createClone();
	}
}
