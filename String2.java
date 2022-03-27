import java.util.Scanner;
public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();
        boolean f = true;
        for (int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if (f) {
                    charArray[i]=Character.toUpperCase(charArray[i]);
                    f =false;
                }
            }
            else {
                f = true;
            }
        }
        s = String.valueOf(charArray);
        System.out.print("Chuoi moi: "+s);
    }
}
