package practiceJavaPrograms.sorting.selectionSort;


import java.util.ArrayList;
import java.util.Arrays;

/*
*
* Given two integer arrays a[] and b[], return an array containing all elements common to both arrays in sorted order.

If an element appears multiple times in both arrays, it should appear in the output as many times as it is common to both arrays.

Example:

Input: a[] = [3, 4, 2, 2, 4] , b[] = [3, 2, 2, 7]
Output: [2, 2, 3]
Explanation: The common elements in sorted order are 2, 2, 3.
Input: a[] = [3, 6, 1, 7, 9, 8, 2, 2] , b[] = [9, 7, 3, 4, 9]
Output: [3, 7, 9]
Explanation: The common elements in sorted order are 3, 7, 9.
*
* */
public class CommonElements {

    public static void main(String[] args) {
        int a[] = {3, 4, 2, 2, 4} , b[] = {3, 2, 2, 7};
        ArrayList<Integer> integers = commonElements(a, b);
        System.out.println(integers);
    }

    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        Arrays.sort(a);//mlogm
        Arrays.sort(b);//nlogn
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) { //m+n
            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i] > b[j])
                j++;
            else {
                i++;
            }
        }
        return ans;
    }
}
