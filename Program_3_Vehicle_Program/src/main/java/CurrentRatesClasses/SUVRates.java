package CurrentRatesClasses;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */
public class SUVRates extends VehicleRates{
  
  public SUVRates(double daily_rate, double weekly, double monthly, double mileage, double insur){
    super(daily_rate, weekly, monthly, mileage, insur);
  }
  public String toString(){
  return "----------SUVRates-----------\n Daily Rate: " + "$"+ daily_rate + " Weekly Rate: " + "$" + weekly_rate + " Monthly Rate: $" + monthly_rates + " Per Mile Chrg: $" + mileage_chrg + " Daily Insur: $" + daily_insur_rate;
  }
}
