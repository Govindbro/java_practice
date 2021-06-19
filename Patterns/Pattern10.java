/*
5 5 5 5 5 
4 4 4 4   
3 3 3     
2 2
1 
*/
import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the no:- ");
        int n=scn.nextInt();
        for(int i=5;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
