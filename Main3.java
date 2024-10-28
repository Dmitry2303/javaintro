import java.util.Scanner;


public class Main3 {
    public static int is(int a, int b, int c){
        return (b*b - 4*a*c);
    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int D;
        double x1, x2;
        System.out.println("Поочередно введите a, b, c");
        System.out.println("Введите a");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        System.out.println("Введите c");
        int c = in.nextInt();
        D = is(a ,b , c);
        System.out.println("D = "+D);{
            if (D<0) {
                System.out.println("Нет вещественных корней");
            }
            else if (D == 0) {
                x1 = -b/(2*a);
                System.out.println("1 Корень = " +x1);

            }
            else {
                x1 = (int) ((-b+Math.sqrt(D))/(2*a));
                System.out.println("1 Корень = " +x1);
                x2 = (int) ((-b-Math.sqrt(D))/(2*a));
                System.out.println("2 Корень = " +x2);
            }
        }




    }
}
