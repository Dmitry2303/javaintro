public class Main4 {
    public static void main(String[] args){

        Double step = Math.pow(10, 6);
        Double d_sum = 0.0;
        int i = 0;


        while (i < step){

            Double d;
            d = 1/(Math.sqrt(i)+i-2);
            d_sum = d + d_sum;
            System.out.println(d_sum);
            i = i+2;
            if (d_sum>step){
                break;
            }
        }
    }
}
