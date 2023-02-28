class Solution {
    public String countAndSay(int n) {
        if (n == 0) return "";
       
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        String result = "";

        for(int i = 1; i < n; i++) {
            int lastIndex = queue.peek();
            int count = 0;
            int size = queue.size();
            while(size != 0) {
                int curt = queue.poll();
                if(curt == lastIndex) count++;
                else {
                    queue.offer(count);
                    count = 1;
                    queue.offer(lastIndex);
                    lastIndex = curt;
                }
                size--;
            }

            queue.offer(count);
            queue.offer(lastIndex);

        }
        while(!queue.isEmpty()) result += queue.poll();
        return result;
    }
}