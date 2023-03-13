package models.accounts;

public class GroupAccount {
  String id;
  String name;
  String description;
  Account[] accounts;

  public GroupAccount(String name, String description){
    this.name = name;
    this.description = description;
  }
}
