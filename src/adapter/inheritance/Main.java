package adapter.inheritance;

public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("inheritance adapter pattern");
		p.printWeek();
		p.printStrong();
	}
}
