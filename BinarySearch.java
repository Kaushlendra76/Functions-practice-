public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={3,5,7,21,34,45,67};
        int target = 67;
        int ans = find(arr, target);
        System.out.println(ans);
    }
    public static int find(int[] array, int search) {
        int first = 0;
        int last = array.length -1;
         
        while (first <= last) {
            int middle = last + (first -last)/2;
            if (array[middle] > search) {
                last = middle - 1;
            } else if(array[middle] < search ) {
                first = middle + 1;  
            }  else
            return middle;
        }
        return -1;
        
    }
}
