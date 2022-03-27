import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String s = sc.nextLine();
        s = s.replace(" ", "");
        System.out.print("Chuoi moi: "+s);
    }
}
