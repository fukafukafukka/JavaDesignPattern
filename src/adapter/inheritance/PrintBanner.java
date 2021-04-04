package adapter.inheritance;

import adapter.Banner;

/**
 * インターフェイスprintと実処理Bannerの仲介(Adapter)の役割を果たすクラス
 *
 * @author fukazawakeisuke
 *
 */
public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeek() {
		// 以下のように、継承クラスに処理を任せている点が継承(inheritance)
		showWithParen();
	}

	@Override
	public void printStrong() {
		// 以下のように、継承クラスに処理を任せている点が継承(inheritance)
		showWithAdapter();
	}
}
