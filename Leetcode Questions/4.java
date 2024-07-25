class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int n = nums1.length;
      int m = nums2.length;
      int b = n + m;

      if(n == 1 || m == 1){
        return nums1;
      }

    //   int nums3[] = new int[b];
    //   System.arraycopy(nums1, 0, nums3, 0, n);
    //   System.arraycopy(nums2, 0, nums3, n, m);
        
           
    //  if(b%2 == 0)
    //     return (float)(nums3[b/2-1] + nums3[b/2])/2;
    //  else   
         return (double)(b+1)/2;   

    }
}
