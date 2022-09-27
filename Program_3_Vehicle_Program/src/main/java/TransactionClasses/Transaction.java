package TransactionClasses;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */
public class Transaction{
  private String creditcard_num;
  private String company_name;
  private String vehicle_type;
  private String rental_period;
  private String rental_cost;

  public Transaction(String creditcard_num, String company_name, String vehicle_type, String rental_period, String rental_cost){
    this.creditcard_num = creditcard_num;
    this.company_name = company_name;
    this.vehicle_type = vehicle_type;
    this.rental_period = rental_period;
    this.rental_cost = rental_cost;
  }

  public String toString(){
    return "Transaction-- CreditCard Number: "+ creditcard_num + " Company Name: " + company_name
    + " Vehicle Type: " + vehicle_type + " Rental Period: " + rental_period + " Rental Cost: "
    + rental_cost;
  }
}
