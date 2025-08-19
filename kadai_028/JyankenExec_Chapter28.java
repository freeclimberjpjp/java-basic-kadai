package kadai_028;

import java.util.Scanner;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String myHand = jyanken.getMyChoice(scanner);
			String enemyHand = jyanken.getRandom();
			jyanken.playGame(myHand, enemyHand);
			if (!myHand.equals(enemyHand)) {
				break;
			}
		}
		scanner.close();
	}

}