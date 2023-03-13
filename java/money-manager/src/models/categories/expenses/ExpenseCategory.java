package models.categories.expenses;

public class ExpenseCategory {
  String id;
  String name;
  ExpenseSubcategory[] subCategories;

  public ExpenseCategory(String name) {
    this.name = name;
  }
}
