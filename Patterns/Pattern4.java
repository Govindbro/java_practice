/*
5     
4 4   
3 3 3 
2 2 2 2
1 1 1 1 1
*/
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the no:- ");
        int n=scn.nextInt();
        for (int i=n;i>=1;i--){
            for (int j=5;j>=i;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
