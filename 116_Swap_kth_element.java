class Solution {
    public static void swapKth(int n, int k, int[] arr) 
    {
        // code here
        int temp=arr[k-1];
        arr[k-1]=arr[n-k];
        arr[n-k]=temp;
    }
}
        
