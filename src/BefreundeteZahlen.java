public class BefreundeteZahlen {

    public static void amicableNumbers(){
        int n = 2;

        while(true){
            int s1 = 0;
            int s2 = 0;
            for(int i = 1; i<n; i++){
                if(n%i == 0){
                    s1 += i;
                }
            }
            for(int j = 1; j<s1; j++){
                if(s1%j == 0){
                    s2 += j;
                }
            }
            if(s2 == n){
                System.out.println(n + "  " + s1);
            }
            n++;
        }
    }

}
