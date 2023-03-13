import database.MoneyManager;
import services.ShowUpService;

import models.accounts.Account;
import models.accounts.GroupAccount;

import models.categories.expenses.ExpenseCategory;
import models.categories.expenses.ExpenseSubcategory;

import models.categories.incomes.IncomeCategory;
import models.categories.incomes.IncomeSubcategory;

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
    IncomeCategory defaultIncomeCategory = new IncomeCategory("Job");
    IncomeSubcategory firstIncomeSubCategory = new IncomeSubcategory("Google", defaultIncomeCategory.name);
    IncomeSubcategory secondIncomeSubCategory = new IncomeSubcategory("IBM", defaultIncomeCategory.name);
    IncomeSubcategory thirdIncomeSubCategory = new IncomeSubcategory("Microft", defaultIncomeCategory.name);

    defaultIncomeCategory.addSubcategory(firstIncomeSubCategory);
    defaultIncomeCategory.addSubcategory(secondIncomeSubCategory);
    defaultIncomeCategory.addSubcategory(thirdIncomeSubCategory);

    // expenses setting
    ExpenseCategory defaultExpenseCategory = new ExpenseCategory("Job");
    ExpenseSubcategory firstExpenseSubCategory = new ExpenseSubcategory("Google", defaultExpenseCategory.name);
    ExpenseSubcategory secondExpenseSubCategory = new ExpenseSubcategory("IBM", defaultExpenseCategory.name);
    ExpenseSubcategory thirdExpenseSubCategory = new ExpenseSubcategory("Microft", defaultExpenseCategory.name);

    defaultExpenseCategory.addSubcategory(firstExpenseSubCategory);
    defaultExpenseCategory.addSubcategory(secondExpenseSubCategory);
    defaultExpenseCategory.addSubcategory(thirdExpenseSubCategory);

    // save all info into database
    database.groupAccountAdd(defaultGroup);
    database.incomeCategoryAdd(defaultIncomeCategory);
    database.expenseCategoryAdd(defaultExpenseCategory);
  }
}