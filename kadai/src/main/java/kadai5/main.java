package kadai5;

/**
 * 課題５クラス 条件分岐、数値計算（剰余算（%））の方法
 */
public class main {

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);

		if (args.length == 1 && num % 5 != 0 && num % 3 != 0 || num == 0) {
			System.out.println(num + "は３，５の倍数ではありません。");

		} else if (args.length == 1 && num % 5 == 0 && num % 3 == 0) {
			System.out.println(num + "は３，５の倍数です。");
		
		} else if (args.length == 1 && num % 3 == 0) {
			System.out.println(num + "は３の倍数です。");

		} else if (args.length == 1 && num % 5 == 0) {
			System.out.println(num + "は５の倍数です。");	

		} else {
			// コマンドライン引数が１つではない場合の処理
			System.out.println("コマンドラインで、整数値を１つ引き渡してください。");

		}
	}
}
