import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		System.out.println("じゃんけんゲーム開始");
		
		Scanner x = new Scanner(System.in);
		int hand;
		
		Random y = new Random();
		int cpuhand;
		
		int play = 1;
		
		while (play == 1) {
			System.out.println("何を出しますか？数字を入力してね！");
			System.out.println("1:グー　2:チョキ　3:パー");
		
		
		do {
			hand = x.nextInt();
			cpuhand = y.nextInt(3)+1;
			
			String playerHand = "";
			if (hand == 1) {
				playerHand = "グー";
			} else if (hand == 2) {
				playerHand = "チョキ";
			} else if (hand == 3) {
				playerHand = "パー";
			}
			
			String cpuHand = "";
			if (cpuhand == 1) {
				cpuHand = "グー";
			} else if (cpuhand == 2) {
				cpuHand = "チョキ";
			} else if (cpuhand == 3) {
				cpuHand = "パー";
			}
			
			System.out.println("あなた：" + playerHand);
			System.out.println("CPU：" + cpuHand);
			
		if (hand == cpuhand) {
			System.out.println("あいこで・・・");
			System.out.println("1:グー　2:チョキ　3:パー");
			
			} else if (hand == 1 && cpuhand == 2) {
				System.out.println("勝ち");
			} else if (hand == 2 && cpuhand == 3) {
				System.out.println("勝ち");
			} else if (hand == 3 && cpuhand == 1) {
				System.out.println("勝ち");
			} else {
				System.out.println("負け");
			}
			} while (hand == cpuhand);
		
		System.out.println("もう１回やる？　1:はい　0:いいえ");
		play = x.nextInt();
		
		}
		
		
	}

}


