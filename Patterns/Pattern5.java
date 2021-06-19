/*
5     
5 4   
5 4 3 
5 4 3 2
5 4 3 2 1
*/
import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the no:= ");
        int n=scn.nextInt();
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();

    }    }
}

