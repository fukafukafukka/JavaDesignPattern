package prototype.concreateProduct;

import prototype.Product;

public class UnderlinePen implements Product {
	private char ulchar;
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	@Override
	public void print(String s) {
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		System.out.print(" ");
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		Product clone = null;
		try {
			clone = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
