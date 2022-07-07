public class Exponentialfunktion {

    public static double expFunktion(int x){
        double sn = 1+x;
        double an = 1;
        double n = 1;

        for(int i = 2; Math.abs(an/sn) > 1E-16; i++){
            n *= i;
            an = Math.pow(x, i)/n;
            sn += an;
        }
        return sn;
    }

}
