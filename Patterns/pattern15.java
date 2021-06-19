/*WAP to print the "Inverted Half Pyramid"
* * * * * 
* * * *
* * *
* *
*
*/

import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the height of Pyramid:- ");
        int n=scn.nextInt();
        for (int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
