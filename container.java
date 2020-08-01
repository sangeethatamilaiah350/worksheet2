/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author SANGEETHA
 */
class box
{
    double length;
    double breadth;
    double width;
}
public class container {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        box objt=new box();
        System.out.println("enter length breadth width");
        objt.length=obj.nextInt();
        objt.breadth=obj.nextInt();
        objt.width=obj.nextInt();
        System.out.println("the volume is : "+(objt.length*objt.breadth*objt.width));

    }
    
}
