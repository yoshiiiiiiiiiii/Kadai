package kadai6;

/**
 * 課題６クラス 条件分岐（swich-case文）の使い方
 */
public class main {

	public static void main(String[] args) {

		if (args.length == 1) {
			
			String week = args[0];
		
			switch (week) {

			case "日":
				System.out.println("Sunday");
				break;

			case "月":
				System.out.println("Monday");
				break;

			case "火":
				System.out.println("Tuesday");
				break;

			case "水":
				System.out.println("Wednesday");
				break;

			case "木":
				System.out.println("Thursday");
				break;

			case "金":
				System.out.println("Friday");
				break;

			case "土":
				System.out.println("Saturday");
				break;
		
			default:
				System.out.println("そのような曜日は存在しません。");
			}
				
		} else {
			System.out.println("コマンドラインで、曜日を１つ引き渡してください。");
	
		} 
		}
	}