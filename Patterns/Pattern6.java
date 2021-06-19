/*
1     
2 2   
3 3 3 
4 4 4 4
5 5 5 5 5
*/
import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the no:- ");
        int n=scn.nextInt();
        for(int i=1;i<=5;i++){
            for(int j=i;j>=1;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
