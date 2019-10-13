class Node{
    int key;
    int val;
    Node prev;
    Node next;
    Node(int key,int val){
        this.key=key;
        this.val=val;
    }
}
class DoubleList{
    Node head;
    Node tail;
    int size;
    DoubleList(){
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
        size=0;
    }
    //在头部添加节点
    public void addFirst(Node node){
        node.next=head.next;
        node.prev=head;
        head.next=node;
        node.next.prev=node;
        size++;
    }
    public void delete(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        size--;
    }
    public Node getLast(){
        Node node=tail.prev;
        return node;
    }
    public int getSize(){
        return size;
    }
}

class LRUCache {
    DoubleList cache;
    int capacity;
    HashMap<Integer,Node> map;
    public LRUCache(int capacity) {
        cache=new DoubleList();
        map=new HashMap<>();
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            cache.delete(node);
            cache.addFirst(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            cache.delete(node);
            Node newNode=new Node(key,value);
            cache.addFirst(newNode);
            map.put(key,newNode);
        }else{
            if(cache.getSize()==capacity){
                Node last=cache.getLast();
                int k=last.key;
                cache.delete(last);
                map.remove(k);
            }
            Node node=new Node(key,value);
            map.put(key,node);
            cache.addFirst(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */