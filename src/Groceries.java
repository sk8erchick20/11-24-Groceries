// main program to run the GroceryList
public class Groceries
{
  public static void main(String[]args)
  {
    GroceryList list=new GroceryList();
    GroceryItem one=new GroceryItem ("Oreos", 3, 2.5);
    GroceryItem two=new GroceryItem ("Goldfish Crackers", 2, 1.75);
    GroceryItem three=new GroceryItem ("Apple", 8, .23);
    GroceryItem four=new GroceryItem ("Fruit Loops", 2, 4.32);
    GroceryItem five=new GroceryItem ("Pop Tarts", 4, 3.67);
    list.add(one);
    list.add(two);
    list.add(three);
    list.add(four);
    list.add(five);
    System.out.println("Grocery List");
    System.out.println(list.toString());
    System.out.println(list.getTotalCost());
  }
}
