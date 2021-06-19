/* WAP to print "Rhombus Pattern"
     * * * * * * 
    * * * * * *  
   * * * * * *   
  * * * * * *
 * * * * * *
* * * * * *
*/
import java.util.Scanner;
public class pattern18 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the height of Rhombus pattern:- ");
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            //to add space
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
