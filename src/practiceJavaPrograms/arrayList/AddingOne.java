package practiceJavaPrograms.arrayList;

import java.util.Collections;
import java.util.Vector;

public class AddingOne {
    public static void main(String[] args) {

    }

    private static Vector<Integer> addOne(int[] arr) {
        // [9,9,9,9]
        //[5, 6, 7, 8]
        Vector<Integer> ans = new Vector<>();
        int carry = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] + carry <= 9) {
                ans.add(arr[i] + carry);
                carry = 0;
            } else {
                ans.add(0);
                carry = 1;
            }
        }
        if (carry == 1) {
            ans.add(1);
        }
        Collections.reverse(ans);
        return ans;
    }
}
