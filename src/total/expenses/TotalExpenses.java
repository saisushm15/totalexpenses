/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package total.expenses;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class TotalExpenses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        double result;
        while(t-->0)
        {
            double quantity = input.nextDouble();
            double price = input.nextDouble();
            if(quantity>1000)
            quantity=quantity/10*9;
            result=quantity*price;
            System.out.format("%.6f",result);
        }
        t--;
    }
    
}
