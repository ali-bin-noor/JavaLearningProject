package practiceJavaPrograms.arrayList;

import java.util.ArrayList;

public class arrayListBasicJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(23);
        arr.add(12);
        arr.add(18);
        arr.add(43);

        System.out.println(arr.get(3));
        System.out.println("ArrayList size is : "+arr.size());

        arr.set(2,22);
        System.out.println(arr);
        for (int element : arr){
            System.out.print(element+" ");
        }
        System.out.println();

        //reverese a array without using Collections.reverse(arr)
        int i=0,  j= arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}
