import java.util.Scanner;

public class Binominalkoeffizient {

    public static long fak(long x){
        long f =1;
        for(int i=1;i<=x;i++){
            f = f *i;
        }
        return f;
    }


    public static void binom(){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long k = scanner.nextInt();

        long result = fak(n)/(fak(n-k)*fak(k));
        System.out.println(result);
    }
}
