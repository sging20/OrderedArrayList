public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

    public OrderedArrayList(){
        super();
      }

      public OrderedArrayList(int initialCapacity){
        super(initialCapacity);
    }
  private int sort(T element){
    if(this.size()== 0) return 0;
    int index= 0;
        for(int i=0; i< this.size(); i++){
          int getter= get(i).compareTo(element);
            if(getter < 0){
              index++;
              }
              else{
                return index;
              }
          }
            return index;
  }


  public void add(int index, T element){
    if(element == null){
        throw new IllegalArgumentException("Illegal Argument" + element);
    }
      super.add(sort(element), element);
  }

  public boolean add(T element){
    if(element == null){
      throw new IllegalArgumentException("Illegal Argument" + element);
    }
      super.add(sort(element), element);
      return true;
    }
    public T set(int index, T element){
      if(element == null){
        throw new IllegalArgumentException("Illegal Argument" + element);
      }
      T ret= get(index);
      remove(index);
      add(sort(element), element);
      return ret;
    }
}
