package prototype;

/**
 * createCloneメソッドをまとめたProductクラス
 *
 * @author fukazawakeisuke
 *
 */
public abstract class ProductIntegration implements Cloneable {
	public abstract void print(String s);

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

