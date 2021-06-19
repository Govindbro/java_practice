/* WAP to print " Butterfly Pattern"
let n=4
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
*/
import java.util.Scanner;
public class Pattern19 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the hight of buttefly wings:- ");
        int n=scn.nextInt();
        //for upper part
        for(int i=1;i<=n;i++){
            //left stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces between
            int space= ((2*n)-(2*i));
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //for right stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }   
        //for lower part
        for(int i=n;i>=1;i--){
            //left stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces between
            int space= (2*n)-(2*i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //for right stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }   
    }   
}
