@SuppressWarnings("unchecked")
public class DynamicArr <T> implements Iterabale <T>{
    private T[] arr;
    private int len = 0;
    private int capacity = 0;

    public DynamicArr(){this(16);}

    public DynamicArr(int capacity){
        if(capacity<0){
            throw new IllegalArgumentException("Illegal Capacity");
        }
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size(){return len;}
    public boolean isEmpty(){return size()==0;}
    public T get(int index){return arr[index];};
    public void set(int index,T element){ arr[index]=element;}
    public void clear(){
        for(int i=0;i<capacity;i++){
            arr[i]=null;
            len=0;
        }
    }
    public void add(T elem){
        if(len+1>=capacity){
            capacity*=2;
            T[] new_arr = (T[]) new Object[capacity];
            for(int i=0;i<len;i++){
                new_arr[i]=arr[i];
            }
            arr=new_arr;
        }
        arr[len++]=elem;
    }
}