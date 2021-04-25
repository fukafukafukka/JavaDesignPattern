package strategy;

public class Hand {
	private int handValue;
	public static final int HANDVALUE_GUU = 0;  // グーを表す値
    public static final int HANDVALUE_CHO = 1;  // チョキを表す値
    public static final int HANDVALUE_PAA = 2;  // パーを表す値
    public static final Hand[] hand = {new Hand(HANDVALUE_GUU),new Hand(HANDVALUE_CHO),new Hand(HANDVALUE_PAA),};
    private static final String[] name = {"グー", "チョキ", "パー",};

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
    	return hand[handValue];
    }

    public boolean isStrongerThan(Hand h) {
    	return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
    	return fight(h) == -1;
    }

    private int fight(Hand h) {
    	// boolean値でなく、intの値を返すことで、isStrangerThanにもisWeakerThanにも適用できるようにしている。
    	if (this == h) {
    		return 0;
    	} else if ((this.handValue + 1) % 3 == h.handValue) {
    		return 1;
    	} else {
    		return -1;
    	}
    }

    public String toString() {
    	return name[handValue];
    }
}
