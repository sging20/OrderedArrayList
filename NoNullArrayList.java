  import java.util.ArrayList;
  public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
    public NoNullArrayList(int initialCapacity){
      super(initialCapacity);
    }
  public boolean add(T newValue){
    if(newValue == null){
      throw new IllegalArgumentException("Illegal Argument" + newValue);
    }
    return super.add(newValue);
  }
  public void add(int index, T newValue){
   if(newValue == null){
     throw new IllegalArgumentException("Illegal Argument" + newValue);
   }
      super.add(index, newValue);
 }


}
