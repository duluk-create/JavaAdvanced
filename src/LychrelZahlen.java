public class LychrelZahlen {
    public static void lychrelNumber(long n){


        while(n > 0) {
            long y = 0;
            long m = n;
            while (m != y && m > 0) {
                m = m + y;
                y = 0;
                long t = m;
                while (t > 0) {
                    y *= 10;
                    y += t % 10;
                    t /= 10;
                }
            }

            if (m != y) {
                System.out.println(n);
            }
            n--;
        }
    }
}
