import java.util.Scanner;

public class Josephusring {

    public static void gnadenPosition(){
        //Hier ist der Josephusring simuliert, der die Gnadenposition ausgibt
        //Position ist hier von 1 bis prisoners definiert
        //Jeder Gefangene zählt eins weiter bis einer ausscheidet
        Scanner scanner = new Scanner(System.in);
        int prisoners = scanner.nextInt();
        int fNumber = scanner.nextInt();


        int[] prison = new int[prisoners];
        int j = 1;
        int p = 0;
        int deadpos = 0;


        for(int i=0; i < prisoners; i++, j++){
            prison[i] = j;
        }



        while(prisoners > 1){
            p = deadpos;
            for(int i=1; i <= fNumber; i++, p++){
                if(p > prison.length-1){
                    p = 0;
                }
                if(prison[p] == 0){
                    i--;
                }
                else{
                    if(i == fNumber){
                        prison[p] = 0;
                        deadpos = p+1;
                        prisoners--;
                    }
                }

            }

            p = 0;
        }

        for(int k=0; k<prison.length; k++){
            if(prison[k] != 0)
                System.out.println(prison[k]);
        }


    }
}
