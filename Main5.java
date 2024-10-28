import java.util.Scanner;

public class Main5 {
    public static int fuc(String str, String rts ){
        if (str.equals(rts))
        {
            return 0;

        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string1 = in.nextLine();
        StringBuilder reverse = new StringBuilder();
        reverse.append(string1);
        reverse.reverse();
        String sssrt = reverse.toString();
        System.out.println(string1);
        System.out.println(reverse);
        if (fuc(string1, sssrt) == 0){
            System.out.println(string1 + " является палиндромом");
        }
        else {
            System.out.println(string1 + " не является палиндромом");
        };


    }
}
