package kadai4;

/**
 * 課題４クラス コマンドライン引数の使い方、配列の長さの確認方法、条件分岐（if-else文）の使い方
 */
public class main2 {

	public static void main(String[] args) {
		// 今回はScannerを使わない方法、argsを使う方法で書く必要がある
		if (args.length == 1) {

			// numがargsを数値に変換したよ
			int num = Integer.parseInt(args[0]);

			// 円の面積
			double area = num * num * Math.PI;

			System.out.println("半径" + num + "の円の面積は" + area + "です。");

		} else if (args.length == 2) {

			int height = Integer.parseInt(args[0]); // 縦

			int width = Integer.parseInt(args[1]); // 横

			int S = height * width; // 面積

			System.out.println("縦" + height + "横" + width + "の四角形の面積は" + S + "です。");

		} else {

			System.out.println("コマンドラインで、整数値を１～２つ引き渡してください。");

		}

	}
}
