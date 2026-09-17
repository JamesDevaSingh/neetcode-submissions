class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pi=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
            pi.add(i);
        }
        int val=1;
        while(val<k){
            pi.poll();
            val++;
        }
        return pi.poll();
    }
}
