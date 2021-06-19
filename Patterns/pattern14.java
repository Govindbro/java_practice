/*
*****
*   *
*   *
*   *
*****
*/
import java.util.Scanner;
public class pattern14 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the no. of Rows:- ");
        int r=scn.nextInt();
        System.out.print("\nEnter the no. of Columns:- ");
        int c=scn.nextInt();
        for (int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if((i>1&&i<r)&&(j>1&&j<c))
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
