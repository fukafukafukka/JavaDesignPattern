package builder;

public abstract class Builder {
	public abstract void makeTitle(String title);
	public abstract void makePTag(String str);
	public abstract void makeUlLiTag(String[] items);
	public abstract void close();
}
