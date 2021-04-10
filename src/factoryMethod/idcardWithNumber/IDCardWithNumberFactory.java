package factoryMethod.idcardWithNumber;

import java.util.HashMap;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;

public class IDCardWithNumberFactory extends Factory {
	private HashMap<Integer, String> database = new HashMap<Integer, String>();
	private int number;

	@Override
	protected Product createProduct(String owner) {
		return new IDCardWithNumber(owner, number++);
	}

	@Override
	protected void registerProduct(Product product) {
		IDCardWithNumber card = (IDCardWithNumber)product;
		database.put(card.getNumber(), card.getOwner());
	}

	public HashMap<Integer, String> getDatabase() {
		return database;
	}
}
