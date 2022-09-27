
import CurrentRatesClasses.VehicleRates;
import CurrentRatesClasses.TruckRates;
import CurrentRatesClasses.SUVRates;
import CurrentRatesClasses.CurrentRates;
import CurrentRatesClasses.CarRates;
import TransactionClasses.Transactions;
import TransactionClasses.Transaction;
import AccountsClasses_and_Exceptions.Accounts;
import AccountsClasses_and_Exceptions.Account;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */

public class Main_Test_Driver {
    
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Accounts perAccounts = new Accounts();
        Transactions tranAccounts = new Transactions();

        VehicleRates carRate = new CarRates(22.95, 159.95, 514.95, 0.15, 14.95);
        VehicleRates suvRate = new SUVRates(29.95, 189.95, 679.95, 0.15, 14.95);
        VehicleRates truckRate = new TruckRates(35.95, 224.95, 787.95, 0.26, 21.95);



        // Account(String c, String com, boolean p)

        perAccounts.add(new Account("BIF2323489208391","JPmorgan", false));
        perAccounts.add(new Account("B842234875030873","CDPorject",true));
        System.out.println(perAccounts.getAccount("B842234875030873"));


        tranAccounts.add(new Transaction("QUAYR2395", "Strak Industries", "SUV", "5 Days", "40"));
        tranAccounts.add(new Transaction("IQYE43891", "INTEL", "Hatchback", "2 Weeks", "$53"));
        tranAccounts.getTransaction();

        CurrentRates rates = new CurrentRates(carRate,suvRate,truckRate);

        System.out.println(rates.getCarRates());
        System.out.println(rates.getSUVRates());
        System.out.println(rates.getTruckRates());
    }
}
