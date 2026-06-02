class StockSpanner {
    Stack<Integer> stack;
    ArrayList<Integer> prices;
    int idx;


    public StockSpanner() {
        stack = new Stack<>();
        prices = new ArrayList<>();
        idx = 0;
    }
    
    public int next(int price) {
        
        prices.add(price);

        while (!stack.isEmpty() &&
               price >= prices.get(stack.peek())) {
            stack.pop();
        }

        int span;

        if (stack.isEmpty()) {
            span = idx + 1;
        } else {
            span = idx - stack.peek();
        }

        stack.push(idx);
        idx++;

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */