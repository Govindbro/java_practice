/*
1 1 1 1 1 
2 2 2 2
3 3 3
4 4
5
*/
import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the no:- ");
        int n=scn.nextInt();
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
