package templateMethod.templates;

public abstract class AbstractDisplay {
	// protectedにすることでMainクラスから直接呼べなくさせる。
	protected abstract void open();
	protected abstract void print();
	protected abstract void close();
	// 以下のようにロジックだけ抽象クラスで定義して、メソッド内容は具象クラスに委ねる。
	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
