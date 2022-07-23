package arrays;

/*
Mystery of the array
Given the following code:

int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
int n = 6;
n = arr[arr[n]];
Enter the value of n.
 */
public class MysteryOfAnArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = 6;
        n = arr[arr[n]]; //n = arr[7]; on. 6. index is the 7, which will become the new index => arr[7]
        System.out.println(n);
    }
}
