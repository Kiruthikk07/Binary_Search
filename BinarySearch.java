import java.util.Scanner;
public class Main{
    public static int binarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid+1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int[]arr = {10,20,30,40,50}; //The array must be sorted to perform binary search
		System.out.println("Enter the element to search");
		int element = sc.nextInt();
		int pos = binarySearch(arr, element);
		if(pos != -1){
		    System.out.println(("The element is found at position " + pos));
		}
		else{
		    System.out.println("The element is not found");
		}
	}
}
