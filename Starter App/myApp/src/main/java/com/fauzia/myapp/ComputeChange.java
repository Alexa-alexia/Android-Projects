
package com.fauzia.myapp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ComputeChange {
    public static void main(String args[]){

        //do{
        System.out.println("===========================================\n");
        System.out.println("Welcome to Musa buddy shop - Kisii\n");
        System.out.println("============================================\n");
         
        Scanner itm = new Scanner(System.in);
        
        System.out.println("Please enter the number of items bought by customer:");
        
        int i = itm.nextInt();
        
       
      
        
        //Item 1
        
        System.out.println("********************Item One*******************\n");
         
       // String des;
       
        
         Scanner itmd1 = new Scanner(System.in);
         
        System.out.println("Enter description of Item 1:");
            String itmD1 = itmd1.nextLine();
         
        Scanner itmq1 = new Scanner(System.in);
        System.out.println("Enter quantity of Item 1:");
        int itemQ1 = itmq1.nextInt();
        
         Scanner itmc1 = new Scanner(System.in);
        System.out.println("Enter unit cost of Item 1:");
        int itemC1 = itmc1.nextInt();
      
      
        
        //Item 2
         System.out.println("********************Item two*******************\n");
        
            Scanner itmd2 = new Scanner(System.in);
         
        System.out.println("Enter description of Item 2:");
            String itmD2 = itmd2.nextLine();
         
        Scanner itmq2 = new Scanner(System.in);
        System.out.println("Enter quantity of Item 2:");
        int itemQ2 = itmq2.nextInt();
        
         Scanner itmc2 = new Scanner(System.in);
        System.out.println("Enter unit cost of Item 2:");
        int itemC2 = itmc2.nextInt();
      
      
           //Item 3
            System.out.println("********************Item three*******************\n");
                 Scanner itmd3 = new Scanner(System.in);
         
        System.out.println("Enter description of Item 3:");
            String itmD3 = itmd3.nextLine();
         
        Scanner itmq3 = new Scanner(System.in);
        System.out.println("Enter quantity of Item 3:");
        int itemQ3 = itmq3.nextInt();
        
         Scanner itmc3 = new Scanner(System.in);
        System.out.println("Enter unit cost of Item 3:");
        int itemC3 = itmc3.nextInt();
            
        System.out.println("*****************************************************");
      
        // COST
        System.out.println("--------------------------------------");
        System.out.println("Summary of items bought");
        System.out.println("--------------------------------------");
        System.out.println("Quantity Description UnitCost SubTotal");
        System.out.println("--------------------------------------");
        
        int subTotal1;
        int subTotal2;
        int subTotal3;
        
        
        subTotal1 = itemQ1 * itemC1;
        subTotal2 = itemQ2 * itemC2;
        subTotal3 = itemQ3 * itemC3;
        
        System.out.println(itemQ1+ " "+ itmD1+ " "+ itemC1+ " "+ +subTotal1);
        System.out.println(itemQ2+ " "+ itmD2+ " "+ itemC2+ " "+ +subTotal2);
        System.out.println(itemQ3+" "+ itmD3+" "+ itemC3+" "+ +subTotal3);
        System.out.println("--------------------------------------");
        
        int totalCost = subTotal1 + subTotal2 + subTotal3;
        System.out.println("The total Cost of items is:" +totalCost);
        
        Scanner cusA = new Scanner(System.in);
        System.out.println("Please enter the amount tendered by customer:");
        int customer = cusA.nextInt();
        
        int balance = customer - totalCost;
        System.out.println("The change due to customer is:"  +balance);
        
        System.out.println("Printing Customer receipt!!!!!!!!!!");
        System.out.println("==================================================");
        System.out.println("=================Musa buddy shop-Kikuubo==========");
        System.out.println("==================================================");
        System.out.println("Date:" +LocalDate.now() + " " + "Time: " + LocalTime.now());
        System.out.println("Quantity Description UnitCost SubTotal");
        
        System.out.println("----------------------------------------");
        System.out.println(itemQ1+ " "+ itmD1+ " "+ itemC1+ " "+ +subTotal1);
        System.out.println(itemQ2+ " "+ itmD2+ " "+ itemC2+ " "+ +subTotal2);
        System.out.println(itemQ3+" "+ itmD3+" "+ itemC3+" "+ +subTotal3);
        System.out.println("----------------------------------------");
        System.out.println("Total cost of goods" + " " +totalCost + "+" );
        System.out.println("Balance to customer" + " " +balance + "-");
        System.out.println("Amount tendered by customer" + " " +customer);
        System.out.println("-----------------------------------------");
        
        System.out.println("Thank you ! Come again");
        System.out.println("Goods once sold are not returnable");
       
       // i++;
      // }
       //while(i<=20);
      
    }
}
