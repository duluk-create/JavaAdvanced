public class PerfectNumbers {

    public static void perfectNumbers(){
        int n = 0;
        int sum = 0;
        while(n > 0){
            for(int i=1; i<n; i++){
                if(n%i == 0){
                    sum += i;
                }
            }
            if(sum == n){
                System.out.println(n);
            }
            n++;
            sum = 0;
        }
    }
}
