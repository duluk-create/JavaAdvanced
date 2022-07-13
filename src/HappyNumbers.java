public class HappyNumbers {
    public static void happyNumbers(int n){
        long x = 1;
        while(x < n){
            long p = x;
            long r = 0;
            while(r != 1 && r != 4){
                r = 0;
                while(p > 0){
                    r += Math.pow(p%10, 2);
                    p /=10;
                }
                p = r;
            }
            if(r == 1)
                System.out.println(x);
            x++;
        }
    }
}
