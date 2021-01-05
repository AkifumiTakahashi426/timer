package sumple;

import java.util.Scanner;

public class CountdownneoKidou {

	public static void main(String[] args) {

		//数字を入力する
		Scanner scan = new Scanner(System.in);
		System.out.print("秒数うってね；");
		int time = scan.nextInt();

		//うった数字をコンストラクタ起動ついでにカウントダウンネオに渡す
		Countdownneo t = new Countdownneo(time);
		Thread thread = new Thread(t);

		//うった数字でカウントダウン起動
		thread.start();



	}

}
