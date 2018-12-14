import java.util.ArrayList;

public class QuickSort {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(5);
        arr.add(3);
        arr.add(9);
        arr.add(4);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        arr.add(-4);
        
        System.out.println(arr);
        
        sort(arr);

        System.out.println(arr);
    }
    public static void sort(ArrayList list){
        if (list.size() <= 1){
            return;
        }
        int barrier = (int) list.get(0);
        
        ArrayList left = new ArrayList();
        ArrayList right = new ArrayList();
        ArrayList middle = new ArrayList();
        
        for(int i = 0; i < list.size(); i++){
            if ((int)list.get(i) < barrier){
                left.add(list.get(i));
            } else if ((int)list.get(i) ==  barrier){
                middle.add(list.get(i));
            } else {
                right.add(list.get(i));
            }
        }
        sort(left);
        sort(right);
        
        list.clear();
        list.addAll(left);
        list.addAll(middle);
        list.addAll(right);

    }
}
