package kadai3;

/**
 * 課題３クラス 配列の宣言と初期化、.lengthの使い方、forループと拡張forループの違い
 */
public class main {

	public static void main(String[] args) {
		// 設問３

		// 配列の宣言と初期化
		int num[] = { 7, 70, 700 };
		int sum = 0;

		// 通常ループでの合計値
		for (int i = 0; i < num.length; i++) {
			// 合計にどんどん足していく式 +=
			sum += num[i];

		}

		// 変数は直前で宣言する
		int sum2 = 0;
		// 拡張ループでの合計値
		for (int j : num) {
			sum2 += j;

		}

		System.out.println("配列の要素数：" + num.length);

		System.out.println("通常ループでの合計値：" + sum);

		System.out.println("拡張ループでの合計値：" + sum2);

	}

}
