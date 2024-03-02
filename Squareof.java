class Squareof {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            pq.add(i*i);
        }
        int arr[]=new int[nums.length];
        int i=0;
        while(!pq.isEmpty()){
              arr[i++]=pq.poll();
        }
        return arr;
    }
}
