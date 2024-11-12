import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums3[]=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        int n1=nums1.length;
        int n2=nums2.length;
        int n3=n1+n2;
        double median=0;
        while(i<n1 && j<n2)
        {
            if(nums1[i]>nums2[j])
            {
                nums3[k]=nums2[j];
                j++;
            }
            else
            {
                nums3[k]=nums1[i];
                i++;
            }
            k++;
        }
        while(i<n1)
        {
            nums3[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n2)
        {
            nums3[k]=nums2[j];
            j++;
            k++;
        }
    if(n3%2==0)
    {
        double a=nums3[(n3)/2];
        double b=nums3[(n3/2)-1];
        median=(a+b)/2;
    }
    else
    {
        double a=nums3[(n3-1)/2];
        median=a;
    }
    return median;
    }
    
}