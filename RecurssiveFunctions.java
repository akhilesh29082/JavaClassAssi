public class RecurssiveFunctions {

    public static int fac(int a){
        if(a==0){
            return 1;
        }
        System.out.println(a);
        return a*fac(a-1);
    }
    public static void main(String[] args) {
        int x=5;
        int result= fac(x);
        System.out.println(result);
    }
}
