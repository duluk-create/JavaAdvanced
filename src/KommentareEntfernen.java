import java.util.Scanner;

public class KommentareEntfernen {

    public static void commentX(){
        Scanner scanner= new Scanner(System.in);
        String comment = scanner.nextLine();
        String output = "";

        for(int i = 0; i < comment.length()-1; i++){
            if(comment.substring(i, i+1).equals("/") && comment.substring(i+1, i+2).equals("*")){
                for(int j=i-1; !(comment.substring(j, j+1).equals("*") && comment.substring(j+1, j+2).equals("/")); j++, i++){
                    output = output + " ";
                }
            }
            else{
                output = output + comment.substring(i, i+1);
            }
        }
        System.out.println(output);
    }

}
