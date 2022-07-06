import java.util.ArrayList;
import java.util.Scanner;

public class Messwerte {

    public static void messWerte(){
        ArrayList output = new ArrayList();

        int counter = 0; //-1 Zähler

        Scanner scanner = new Scanner(System.in);

        while(counter < 3){
            int n = scanner.nextInt();

            if(n > 0){
                output.add(n);
                counter = 0;
            }
            if(output.size() == 0 && n == 0){
                output.add(0);
            }
            if((n == 0 && Integer.parseInt(output.get(output.size()-1).toString()) != 0) ){
                output.add(0);
                counter = 0;
            }
            if(n == -1){
                counter++;
            }

        }

        for(int i = 0; i<output.size(); i++){
            System.out.print(output.get(i));
        }
    }
}
