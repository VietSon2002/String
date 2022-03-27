import java.util.Scanner;

public class String6 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String a = sc.next();
	int t = 0;
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i) == a.charAt(0)) {
			t = t + 1;
            System.out.println("Vi tri: a["+(i+1)+"]");
		}
	}
	System.out.print("So lan xuat hien: "+t);
	}
}
