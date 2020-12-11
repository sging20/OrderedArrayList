  import java.util.*
  public class NoNullArrayList<T> extends ArrayList<T>{
  private T value;
  public NoNullArrayList{

  }
  public void setValue(T newValue, int index){
      if(newValue == null){
        throw new IllegalArgumentException("Illegal Argument" + newValue);
      }
      if(newValue != null){
        Super.set(index, newValue);
      }
  }
  public void add(T newValue){
    if(newValue == null){
      throw new IllegalArgumentException("Illegal Argument" + newValue);
    }
      else{
      Super.add(T newValue);
      }
  }

}
