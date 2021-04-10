package factoryMethod;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;
import factoryMethod.idcard.IDCardFactory;
import factoryMethod.idcardWithNumber.IDCardWithNumberFactory;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product davisCard = factory.create("Davis");
		Product kimCard = factory.create("金");
		Product fukasawaCard = factory.create("深澤");
		davisCard.use();
		kimCard.use();
		fukasawaCard.use();

		Factory factoryWithNumber = new IDCardWithNumberFactory();
		Product dCard = factoryWithNumber.create("docomo");
		Product yCard = factoryWithNumber.create("Yahoo! JAPAN");
		Product rCard = factoryWithNumber.create("Rakuten");
		dCard.use();
		yCard.use();
		rCard.use();
	}
}
