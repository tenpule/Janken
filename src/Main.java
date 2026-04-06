import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		System.out.println("じゃんけんゲーム開始");
		
		System.out.println("何を出しますか？数字を入力してね！");
		System.out.println("1:グー　2:チョキ　3:パー");
		
		Scanner x = new Scanner(System.in);
		int hand = x.nextInt();
		System.out.println(hand);
		
		Random y = new Random();
		int cpuhand = y.nextInt(3)+1;
		
		if (hand == cpuhand) {
			System.out.println("あいこ");
			} else if (hand == 1 && cpuhand == 2) {
				System.out.println("勝ち");
			} else if (hand == 2 && cpuhand == 3) {
				System.out.println("勝ち");
			} else if (hand == 3 && cpuhand == 1) {
				System.out.println("勝ち");
			} else {
				System.out.println("負け");
			}
		
	}

}
