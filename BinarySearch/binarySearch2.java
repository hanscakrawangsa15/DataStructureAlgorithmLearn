package BinarySearch;


public class binarySearch2{
    public static void main(String[] args) {

    }
    static int binarySearch(int x, int[]a){
        int low = 0;
        int high = a.length -1;

        while (low<=high){
            int mid = low + (low + high) / 2;
            if (x == a[mid]){
                return mid;
            } else if (x < a[mid]) {
                high = mid -1;
            }else {
                low = mid + 1;
            }
        } return -1;
    }
}




