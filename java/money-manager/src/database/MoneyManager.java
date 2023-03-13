package database;

import models.accounts.GroupAccount;
import models.categories.expenses.ExpenseCategory;
import models.categories.incomes.IncomeCategory;
import models.transactions.Transaction;

public class MoneyManager {
  String id;
  String databaseName;

  Transaction[] transactions;
  GroupAccount[] groupAccounts;
  IncomeCategory[] incomeCategories;
  ExpenseCategory[] expenseCategories;

  public MoneyManager(String databaseName) {
    this.databaseName = databaseName;
  }

  public void transactionAdd() {

  }

  public void transactionRemove(){

  }

  public void groupAccountAdd() {

  }

  public void groupAccountRemove() {

  }

  public void incomeCategoriesAdd() {

  }

  public void incomeCategoriesRemove() {

  }

  public void expenseCategoriesAdd() {

  }

  public void expenseCategoriesRemove() {
    
  }
}
