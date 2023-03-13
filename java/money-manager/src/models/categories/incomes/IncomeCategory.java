package models.categories.incomes;

public class IncomeCategory {
  String id;
  String name;
  IncomeSubcategory[] subcategories;

  public IncomeCategory(String name){
    this.name = name;
  }
}
