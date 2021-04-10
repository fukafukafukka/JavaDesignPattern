package factoryMethod.idcardWithNumber;

import factoryMethod.framework.Product;

public class IDCardWithNumber extends Product {
	private String owner;
	private int number;
	protected IDCardWithNumber(String owner, int number) {
		System.out.println(owner + "(" + number + ")" + "のカードを作ります。");
		this.owner = owner;
		this.number = number;
	}

	@Override
	public void use() {
		System.out.println(owner + "のカードを使います。");
	}

	public String getOwner() {
		return owner;
	}

	public int getNumber() {
		return number;
	}
}
