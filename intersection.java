import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mpp = new HashMap<>();
        List<Integer> arrl = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            mpp.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(mpp.containsKey(nums2[i]) && mpp.get(nums2[i]) == 1)
            {
                arrl.add(nums2[i]);
                mpp.put(nums2[i],0);

            }
        }
        int[] arr = new int[arrl.size()];
        for(int i=0;i<arrl.size();i++)
        {
            arr[i] = arrl.get(i);
        }
        return arr;
    }
}