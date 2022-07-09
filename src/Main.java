import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

public static void perfectNumbers(){
    int n = 2;
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

    public static void main(String[] args) {

        perfectNumbers();
    }
}