import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {
    ArrayList<String> name = new ArrayList<String>();
    name.add("Paul");
    name.add("Sam");
    name.add("Rane");
    
    System.out.println(name.size());
    System.out.println(name.get(0));
    name.set(0,"Rahul");
    
    System.out.println(name);
    name.remove("Sam");
    System.out.println(name);
    
    System.out.println(name.indexOf("Rane"));
    
  }
  
}