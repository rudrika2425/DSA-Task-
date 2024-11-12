class Solution {
    public int search(int[] a, int target) {
        int start=0;
    int end=a.length-1;
    while(start<=end)
    {
     int mid= start+(end-start)/2;
     if(a[mid]>target)
        {
          end=mid-1;
        }
        else if(a[mid]<target)
        {
            start=mid+1;
        }
        else
        {
            return mid;
        }
       
    }
     return -1;
    
        
    }
}