package prototype;

import prototype.concreateProduct.MessageBox;
import prototype.concreateProduct.UnderlinePen;

public class Main {
	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		UnderlinePen uPen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');

		// managerクラスにインスタンスを名前をつけて保存
		productManager.register("strong message", uPen);
		productManager.register("warning box", mbox);
		productManager.register("slash box", sbox);

		// managerクラスから名前でインスタンス(clone)を取得
		Product p1 = productManager.createClone("strong message");
		Product p2 = productManager.createClone("warning box");
		Product p3 = productManager.createClone("slash box");

		// cloneを使う
		p1.print("Hello World");
		p2.print("Hello World");
		p3.print("Hello World");
	}
}
