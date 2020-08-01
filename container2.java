
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SANGEETHA
 */
class box2
        {
    double l;
    double b;
    double h;
void getvalue()
    {
        System.out.println("enter the length breadth height");
        Scanner obj=new Scanner(System.in);
        l=obj.nextDouble();
        b=obj.nextDouble();
        h=obj.nextDouble();
    }
    void calcu()
    {
        System.out.println("the volume is:"+" "+l*h*b);
        
    }
}
public class container2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        box2 obj=new box2();
        
        obj.getvalue();
        obj.calcu();
    }
    
}
