import java.util.ArrayList;
import java.util.Arrays;

public class GoldbachscheVermutung {

    public static void goldbachVermutung(int n){
        ArrayList primes = new ArrayList(Arrays.asList());
        primes.add(2);
        int x = 3;
        boolean prime = true;
        while(x < n){
            if(x % 2 == 0)
                prime = false;
            int xroot = (int) Math.sqrt(x);
            for(int i = 3; i < xroot; i++){
                if(xroot%3 == 0)
                    prime = false;
            }
            if(prime == true)
                primes.add(x);

            prime = true;
            x++;
        }

        //gerade Zahl kann aus Summe zweier Primzahlen dargestellt werden?
        boolean goldbach = true;
        int last = 2;

        for(int i = 4; i < n; i += 2){
            goldbach = last == i - 2;

            for(int j = 0; j < primes.toArray().length; j++){
                if(Integer.parseInt(primes.get(j).toString())*2 == i){
                    System.out.println(i);
                    last = i;
                }

            }
            for(int k = 0; k < primes.toArray().length-1; k++){
                if(Integer.parseInt(primes.get(k).toString()) + Integer.parseInt(primes.get(k+1).toString()) == i)
                    System.out.println(i);
                last = i;
            }
        }
        System.out.println(goldbach);
    }
}
