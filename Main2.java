public class Main2 {
    public static int rev(String str){
        StringBuilder rev = new StringBuilder();
        rev.append(str);
        rev.reverse();
        System.out.println(rev);
        return 0;
    }
    public static void main(String[] str) {
        String string = "make install";

        System.out.println(string);
        rev(string);
    }
}
