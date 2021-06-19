/* WAP to print "Half Pyramid After 180degree Rotation"
        * 
      * *
    * * *
  * * * *
* * * * *
*/
import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the height of Pyramid:- ");
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
