package AccountsClasses_and_Exceptions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */
public class Account{
  private String creditcard_num;
  private String company_name;
  private boolean prime_customer;


  public Account(String c, String com, boolean p){
    creditcard_num = c;
    company_name = com;
    prime_customer = p;

  }

  // return credit Card Number
  public String getCreditCardNum(){
    return creditcard_num;
  }
  public boolean prime_customer(){
    return prime_customer;
  }

  public String toString(){
    return "The credit card number: " + creditcard_num + " Company Name: " + company_name + " Prime Customer: " + prime_customer; 
  }

}
