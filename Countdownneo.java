package sumple;

public class Countdownneo implements Runnable {

	private int time;

	Countdownneo(int time){
		this.time =time;
	}


	@Override
	public void run() {
		//Scanner scan = new Scanner(System.in);
		//System.out.print("秒数うってね；");
		//time = scan.nextInt();

		for (int i = 0; i < time; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.print("*");
			if ((i + 1) % 10 == 0 && i != 0) {
				System.out.println("\n" + (i + 1) + "秒経過");
			}

		}
		System.out.println("\nおしまい");


	}



	/*
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("秒数うってね；");
			int time = scan.nextInt();

			for (int i = 0; i < time; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				System.out.print("*");
				if ((i + 1) % 10 == 0 && i != 0) {
					System.out.println("\n" + (i + 1) + "秒経過");
				}

			}
			System.out.println("\nおしまい");

		}*/

}
