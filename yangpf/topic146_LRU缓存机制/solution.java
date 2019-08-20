class LRUCache {
    HashMap<Integer,Integer> map=new HashMap<>();
    LinkedList<Integer> list=new LinkedList<>();
    int capacity;
    int size=0;
    public LRUCache(int capacity) {
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            while(list.remove((Integer)key)){}
            list.offer(key);
            return map.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(!map.containsKey(key)){
            size++;
        }
        map.put(key,value);
        while(list.remove((Integer)key)){}
        list.offer(key);
        if(size>capacity){
            map.remove((Integer)list.poll());
            size--;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */