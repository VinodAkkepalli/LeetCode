class SmallestInfiniteSet {

    int counter;
    TreeSet<Integer> ts;

    public SmallestInfiniteSet() {
        counter = 1;
        ts = new TreeSet<>();
    }
    
    public int popSmallest() {
        if(!ts.isEmpty()) {
            return ts.pollFirst();
        } 
        return counter++;
    }
    
    public void addBack(int num) {
        if(num < counter) {
            ts.add(num);
        }
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */