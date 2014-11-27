// class to represent a grocery item
import java.util.*;
public class GroceryItem
{
  String item;
  int amount;
  double rate;
  public GroceryItem(String name, int quantity, double pricePerUnit)
  {
    item=name;
    amount=quantity;
    rate=pricePerUnit;
  }
  public double getCost()
  {
    return (rate*amount);
  }
  public void setQuantity(int quantity)
  {
    amount=quantity;
  }
  public String toString()
  {
    return amount+" "+item.toString()+" @ "+rate+" = "+getCost();
  }
}
