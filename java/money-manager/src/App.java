import database.MoneyManager;
import services.ShowUpService;

import models.accounts.Account;
import models.accounts.GroupAccount;

public class App {
  MoneyManager database;

  public static void main(String[] args) {
    ShowUpService.showMenu();
  } 
  
  public App(){
    this.database = new MoneyManager("money-manager");
    
    // accounts setting
    GroupAccount defaultGroup = new GroupAccount("my accounts", null);
    Account firstAccount = new Account("Home", 0, null, defaultGroup.name);
    Account secondAccount = new Account("Services", 0, null, defaultGroup.name);
    Account thirdAccount = new Account("Grocery", 0, null, defaultGroup.name);
    
    defaultGroup.addAccount(firstAccount);
    defaultGroup.addAccount(secondAccount);
    defaultGroup.addAccount(thirdAccount);

    // incomes setting


    // expenses setting

    // save all info into database
    database.transactionAdd();
    database.groupAccountAdd(defaultGroup);
    database.incomeCategoryAdd();
    database.expenseCategoryAdd();
  }
}