public class NewtonAlgorithmus {
    public static void newtonWurzel(double n, double q){
        if(Math.abs(n-(q*q)) < n*0.000000001){
            System.out.println(q);
        }
        else{
            if(q*q < n || q*q > n){
                q = (q + (n/q))/2;
                newtonWurzel(n, q);
            }
        }

    }
}
