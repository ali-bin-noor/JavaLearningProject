package practiceJavaPrograms.sortingSearching.bubbleSort;

// By using isSorted or swap variable we can optimize the bubble sort.
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,-2,4,6,3,1,5,7,2,0};
        print(arr);
        for (int i=0;i<arr.length;i++){
            boolean isSorted= true;
            //int swap = 0;
            /*for(int k=0; k<arr.length-1; k++){
                if(arr[k]>arr[k+1]){
                    isSorted=false;
                    break;
                }
            }
            if(isSorted) break;*/
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted=false;
                    //swap++;
                }
            }
            if(isSorted) break;
            //if(swap==0) break;
        }
        print(arr);
    }

    private static void print(int[] arr) {
        for(int element : arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
