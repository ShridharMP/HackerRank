package countingValleys;

import java.util.Scanner;

public class CountingValley {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Steps");
		int n = sc.nextInt();
		System.out.println("Enter Path Pattern");
		String s = sc.next();
		int v = 0; // # of valleys
		int lvl = 0; // current level
		for (char c : s.toCharArray()) {
			if (c == 'U')
				++lvl;
			if (c == 'D')
				--lvl;

			// if we just came UP to sea level
			if (lvl == 0 && c == 'U')
				++v;
		}
		System.out.print(v);
	}
}
