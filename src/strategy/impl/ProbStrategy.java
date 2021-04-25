package strategy.impl;

import java.util.Random;

import strategy.Hand;
import strategy.Strategy;

public class ProbStrategy implements Strategy {
	private Random random;
	private int prevHandValue = 0;
	private int currentHandValue = 0;
	// 1回前に出した手の値と、その後に出した手の値の2次元配列
	private int[][] history = {
			{1,1,1,},
			{1,1,1,},
			{1,1,1,},
	};

	public ProbStrategy(int seed) {
		random = new Random(seed);
	}

	/**
	 * 現在の手のパターンの後、何の手を出したら勝率が一番高いか調査して返すメソッド
	 */
	@Override
	public Hand nextHand() {
		// 現在の手のパターンの後の勝ちパターンの値をすべて合算した値のうち、ランダムな値を生成してbetとする。
		int bet = random.nextInt(getSum(currentHandValue));
		int handValue = 0;
		if (bet < history[currentHandValue][0]) {
			// グーを出して勝った確率が高いほど、上記の右辺の値が大きくなり、if条件に該当する確率も高くなる。
			handValue = 0;
		} else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
			// betの値はsumのうちのランダム値なので、右辺の値をグーとチョキの合計にしている点に注意。
			handValue = 1;
		} else {
			handValue = 2;
		}
		prevHandValue = currentHandValue;
		currentHandValue = handValue;
		return Hand.getHand(handValue);
	}

	/**
	 * ある手のうち、次出す手のパターンを全て合算して返す。
	 *
	 * @param handValue
	 * @return
	 */
	private int getSum(int handValue) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += history[handValue][i];
		}
		return sum;
	}

	/**
	 * 勝敗を記録する
	 */
	@Override
	public void study(boolean win) {
		if (win) {
			history[prevHandValue][currentHandValue]++;
		} else {
			// グー(currentHandValue)で負けたなら、次はチョキ((currentHandValue + 1) % 3)を出すべき。
			history[prevHandValue][(currentHandValue + 1) % 3]++;
		}
	}
}
