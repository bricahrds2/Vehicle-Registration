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
public class CurrentRates{
  private VehicleRates[] rates = new VehicleRates[3];

  public CurrentRates(VehicleRates CarRates, VehicleRates SUVRates, VehicleRates TruckRates){
    rates[0]=CarRates;
    rates[1]=SUVRates;
    rates[2]=TruckRates;
    
  }
  
  public VehicleRates getCarRates(){
    return rates[0];
  }
  public VehicleRates getSUVRates(){
    return rates[1];
  }
  public VehicleRates getTruckRates(){
    return rates[2];
  }

  public void updateCarRates(VehicleRates r){
    rates[0]=r;
  }
  public void updateSUVRates(VehicleRates r){
    rates[1]=r;
  }
  public void updateTruckRates(VehicleRates r){
    rates[2]=r;
  }
}
