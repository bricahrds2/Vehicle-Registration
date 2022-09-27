
// Program 4 - Vehicle Rental Agency System Stage 1
// Brandon Richards
// COSC 237.003
// Fall 2020
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
public class TruckRates extends VehicleRates{

  public TruckRates(double daily_rate, double weekly, double monthly, double mileage, double insur){
    super(daily_rate, weekly,monthly,mileage,insur);
  }

  public String toString(){
    return "---------Truck Rates---------\n Daily Rate: " + "$"+ daily_rate + " Weekly Rate: " + "$" + weekly_rate + " Monthly Rate: $" + monthly_rates + " Per Mile Chrg: $" + mileage_chrg + " Daily Insur: $" + daily_insur_rate;
  }
}