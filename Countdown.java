package sumple;
import java.util.Scanner;

public class Countdown {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("秒数うってね；");
		int aaa= scan.nextInt();

		for(int i =0;i<=aaa;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i+"秒経過しました。残り["+(aaa-i)+"]");
		}

	}

}
