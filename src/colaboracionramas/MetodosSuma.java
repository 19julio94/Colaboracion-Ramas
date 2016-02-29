
package colaboracionramas;

import javax.swing.JOptionPane;


public class MetodosSuma {
 private int num1,num2;
 
    public void suma(){
      num1=Integer.parseInt(JOptionPane.showInputDialog("introduce o numero"));
      num2=Integer.parseInt(JOptionPane.showInputDialog("introduce o numero"));
      
      System.out.println("O resultado e: "+(num1+num2));
        
        
    }
    
    //añadido metodo de resta
    public void resta(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("introduce o numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("introduce o numero"));
        
        System.out.println("O resultado é: "+(num1 - num2));
    }
      
    //añadido metodo de multiplicacion
    public void multiplicacion(){
       num1 = Integer.parseInt(JOptionPane.showInputDialog("introduce o numero"));
       num2 = Integer.parseInt(JOptionPane.showInputDialog("introduce o numero"));
        
       System.out.println("O resultado é: "+(num1 * num2));
   }
    
    //añadido metodo de division
    public void division(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("introduce o numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("introduce o numero"));
        
        System.out.println("O resultado é: "+(num1 / num2));
    }
   
   
   
   
   }
    

