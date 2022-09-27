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
public abstract class VehicleRates{
  public double daily_rate;
  public double weekly_rate;
  public double monthly_rates;
  public double mileage_chrg;
  public double daily_insur_rate;


  public VehicleRates(double daily_rate, double weekly, double monthly, double mileage, double insur){
    this.daily_rate = daily_rate;
    weekly_rate = weekly;
    monthly_rates = monthly;
    mileage_chrg = mileage;
    daily_insur_rate = insur;
  }

  public double getDailyRate(){
    return daily_rate;
  }

  public double getWeeklyRate(){
    return weekly_rate;
  }
  public double getMonthlyRate(){
    return monthly_rates;
  }

  public double getMileageChrg(){
    return mileage_chrg;
  }

  public double getDailyInsurRate(){
    return daily_insur_rate;
  }

  public abstract String toString();
}
