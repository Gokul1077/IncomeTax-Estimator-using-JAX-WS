/**
 * @author sanjaykrishnan
 */
package com.it;
import java.util.Scanner;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
@WebService(serviceName = "IncomeTax")
public class IT {
    @WebMethod(operationName = "Taxation")
    public String taxation(@WebParam(name = "INCOME")long sal) {
        double tax;
        System.out.print("Enter Your Salary : ");
        
        if(sal<=250000){
            return "No Tax" ;
            
        }else if(sal>250000 && sal<=750000){
            tax = sal * 0.05;
            return "Income Tax :"+tax;
        }else if(sal>750000 && sal<=1000000){
            tax = sal * 0.1;
            return "Income Tax :"+tax;
        }else if(sal>1000000 && sal<=1250000){
            tax = sal * 0.2;
            return "Income Tax :"+tax;
        }else if(sal>1250000 && sal<=1500000){
            tax = sal * 0.25;
            return "Income Tax :"+tax;
        }          
        else{
          tax = sal * 0.30;
            return "Income Tax : "+tax;   
        }
    }
}

