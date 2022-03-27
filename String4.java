import java.util.Scanner;

public class String4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
		String s = sc.nextLine();
		String[] words = s.split(" ");
        System.out.print("Cac thu: ");
		for(String word:words) {
			System.out.println(word);
		}
	}
}