package prototype;

public interface Product extends Cloneable {
	public abstract void print(String s);
	public abstract Product createClone();
}
