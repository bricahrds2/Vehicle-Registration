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
import AccountsClasses_and_Exceptions.AccountNotFoundException;
import AccountsClasses_and_Exceptions.Account;
import java.util.*;

public class Accounts{
  private ArrayList<Account> accounts;
  private Account sub;

  public Accounts(){
    accounts = new ArrayList<Account>(15);
  }

  public void add(Account act){
    accounts.add(act);
  }

  public Account getAccount(String credit_card){
    int i = 0;
    if(credit_card.length()!=16){
      throw new InvalidCreditCardException();
    }
    
    while(i<accounts.size()){
      if((accounts.get(i).getCreditCardNum()).equals(credit_card)){
        sub = accounts.get(i);
      }
      i++;
    }
    if(sub==null){
      throw new AccountNotFoundException();
      
    }
    return sub;
  }
  
}
