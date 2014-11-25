// class to represent a grocery item
// class to represent a grocery item
import java.util.*;
public class GroceryItem
{
  String item;
  int amount;
  int rate;
  public GroceryItem(String name, int quantity, double pticePerUnit)
  {
    item=name;
    amount=quantity;
    rate=pricePerUnit;
  }
  public double getCost()
  {
    return (rate*amount)
  }
  public void setQuantity(int quantity)
  {
    amount=quantity;
  }
