package prototype.concreateProduct;

import prototype.Product;

public class MessageBox implements Product {
	private char decochar;
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void print(String s) {
		int length = s.getBytes().length;

		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.print(decochar + " "  + s + " " + decochar);
		System.out.println("");
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
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
