import java.util.ArrayList;
public class GroceryList
{
  ArrayList <GroceryItem> list;
  public GroceryList()
  {
    list=new ArrayList<GroceryItem>();
  }
  public void add(GroceryItem item)
  {
    list.add(item);
  }
  public double getTotalCost()
  {
    double answer=0;
    for(int i=0; i<list.size(); i++)
    {
      answer+= list.get(i).getCost();
    }
    return answer;
  }
  
  public String toString()
  {
    String words= "";
    for(int i=0; i<list.size(); i++)
    {
      words+= list.get(i).toString()+"\n";
    }
    return words;
  }
}
