import java.util.*;

public class ArrayList implements List {
    private int size;
    private Object[] arr;
    private int curr;

    public ArrayList(){
        arr = new Object[10];
        size = 10;
        curr = 0;
    }

    @Override
    public void add(Object obj) {
        if(curr >= size){
            Object[] temp = new Object[size*2];
            for(int i = 0; i < curr; i++){
                temp[i] = arr[i];
            }
            arr = temp;
            size *= 2;
        }
        arr[curr++] = obj;
    }

    @Override
    public void add(int pos, Object obj) {
        if(curr >= size){
            Object[] temp = new Object[size*2];
            for(int i = 0; i < curr; i++){
                temp[i] = arr[i];
            }
            arr = temp;
            size *= 2;
        }

        for(int i = curr; i > pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = obj;
        curr++;
    }

    @Override
    public Object get(int pos) {
        if(pos < 0 || pos >= curr){
            return 0;
        }
        return arr[pos];
    }

    @Override
    public Object remove(int pos) {
        if(pos < 0 || pos >= curr){
            System.out.println("The index does not exist in the ArrayList.");
            return 0;
        }

        for(int i = pos + 1; i < curr; i++){
            arr[i-1] = arr[i];
        }
        curr--;
        return arr[pos];
    }

    @Override
    public int size() {
        return curr;
    }


}
