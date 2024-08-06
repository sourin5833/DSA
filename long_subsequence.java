class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        Set<Integer> set = new HashSet<>();
        int longest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }

        for(int it : set)
        {
            if(!set.contains(it-1))
            {
                int count = 1;
                int x = it;
                while(set.contains(x+1))
                {
                    count++;
                    x++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}