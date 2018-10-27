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

}
