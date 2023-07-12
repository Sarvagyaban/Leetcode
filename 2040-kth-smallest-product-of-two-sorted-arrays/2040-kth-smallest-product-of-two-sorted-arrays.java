class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long l = (long)-1e11;
        long r = (long)1e11;
        long res = 0;
        while ( l<=r ) {
            long mid = (l+r)/2;
            if ( check(mid, nums1, nums2, k) ) {
                r = mid - 1;
                res = mid;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
    public boolean check (long mid, int[] nums1, int[] nums2, long k ) {
        long cnt = 0;
        for ( int i=0; i<nums1.length; i++ ) {
            long val = (long) nums1[i];
            if ( val==0 && mid>=0 ) {
                cnt += nums2.length;
            } else if ( val<0 ) {
                cnt += findMinIndex(val, mid, nums2);
            } else if ( val>0 ) {
                cnt += findMaxIndex(val, mid, nums2);
            }
        }
        return cnt>=k;
    }
    public long findMaxIndex( long val, long mid, int[] nums2 ) {
        int l = 0;
        int r = nums2.length - 1; 
        long res = -1;
        while ( l<=r ) {
            int m = (l+r)/2;
            if ( val*nums2[m]<=mid ) { 
                res = (long)m;
                l = m + 1; 
            } else {
                r = m - 1;
            }
        } 
        return res+1;
    }
    public long findMinIndex( long val, long mid, int[] nums2 ) {
        int l = 0;
        int r = nums2.length - 1; 
        long res = r + 1;
        while ( l<=r ) {
            int m = (l+r)/2;
            if ( val*nums2[m]<=mid ) {
                r = m - 1;
                res = (long)m;
            } else {
                l = m + 1;
            }
        }
        return nums2.length - res;
    }
}