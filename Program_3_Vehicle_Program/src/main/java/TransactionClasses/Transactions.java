package TransactionClasses;


import TransactionClasses.Transaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */
public class Transactions {
  private Transaction[] transactions;
  int current;

  public Transactions() {
    transactions = new Transaction[15];
  }

  public void add(Transaction tran) {
    for(int i = 0; i<transactions.length; i++){
      if(transactions[i]==null){
        transactions[i] = tran;
        break;
      }
      current=i;
    }
  }

  public void getTransaction(){
    System.out.println(transactions[0]);
  }

  public boolean hasNext(){
    return transactions[current+1]!=null;
  }

  public Transaction getNext(){
    return transactions[current];
  }

  public void reset(){
    current=0;
  }
}
