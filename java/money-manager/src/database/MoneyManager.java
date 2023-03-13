package database;

import java.util.ArrayList;

import models.accounts.GroupAccount;
import models.categories.expenses.ExpenseCategory;
import models.categories.incomes.IncomeCategory;
import models.transactions.Transaction;

public class MoneyManager {
  String id;
  String databaseName;

  ArrayList<Transaction> transactions;
  ArrayList<GroupAccount> groupAccounts;
  ArrayList<IncomeCategory> incomeCategories;
  ArrayList<ExpenseCategory> expenseCategories;

  public MoneyManager(String databaseName) {
    this.databaseName = databaseName;
  }

  public void transactionAdd() {

  }

  public void transactionRemove(){

  }

  public void groupAccountAdd(GroupAccount newGroupAccount) {
    this.groupAccounts.add(newGroupAccount);
  }

  public void groupAccountRemove() {

  }

  public void incomeCategoryAdd(IncomeCategory newIncomeCategory) {
    this.incomeCategories.add(newIncomeCategory);
  }

  public void incomeCategoryRemove() {

  }

  public void expenseCategoryAdd(ExpenseCategory newExpenseCategory) {
    this.expenseCategories.add(newExpenseCategory);
  }

  public void expenseCategoryRemove() {
    
  }
}
