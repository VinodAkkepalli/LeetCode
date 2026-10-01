class StockSpanner {

    Stack<int[]> stack = new Stack<>();

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int tempSpan = 1;
        while(!stack.isEmpty() && stack.peek()[0] <= price) {
            tempSpan += stack.peek()[1];
            stack.pop();
        }

        stack.push(new int[]{price, tempSpan});

        return tempSpan;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */