package builder;

public class Director {
	private Builder builder;
	public Director(Builder builder) {
		this.builder = builder;
	}
	public void construct() {
		builder.makeTitle("Builderパターン");
		builder.makePTag("String文字列1");
		builder.makeUlLiTag(new String[] {
			"item1",
			"item2"
		});
		builder.makePTag("String文字列2");
        builder.makeUlLiTag(new String[]{
            "item1",
            "item2",
            "item3",
        });
        builder.close();
	}
}
