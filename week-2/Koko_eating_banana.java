class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int start=0;
        int max=0;
        for(int i=0;i<piles.length;i++)
        {
            if(max<piles[i])
            {
                max=piles[i];
            }
        }
         
        int end=max;
        int ans=0,sp=0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            ans=time(piles,mid);
            if(ans<=h)
            {   sp=mid;
                 end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return sp;
    }
    public static int time(int a[],int k)
    {   
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
          sum+=(double)Math.ceil (a[i]*1.0/(double)k);
        }
        return sum;
    }
}