package adapter.transfer;

import adapter.Banner;

/**
 * 抽象クラスprintと実処理Bannerの仲介(Adapter)の役割を果たすクラス
 *
 * @author fukazawakeisuke
 *
 */
public class PrintBanner extends Print {
	private Banner banner;
	public PrintBanner(String string) {
		// PrintとBanner2つ継承することはできないため、Bannerだけインスタンス化
		this.banner = new Banner(string);
	}

	@Override
	public void printWeek() {
		// 以下のように、自分とは別のクラスに処理を任せている点が委譲(transfer)
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		// 以下のように、自分とは別のクラスに処理を任せている点が委譲(transfer)
		banner.showWithAdapter();
	}
}
