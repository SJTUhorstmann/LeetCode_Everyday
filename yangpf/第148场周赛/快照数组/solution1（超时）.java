// Í¨¹ý 69/71
class SnapshotArray {
    int snapId=0;
    ArrayList<int[]> list=new ArrayList<>();
    int length=0;
    public SnapshotArray(int length) {
        int[] array=new int[length];
        this.length=length;
        list.add(array);
    }
    
    public void set(int index, int val) {
        list.get(snapId)[index]=val;
    }
    
    public int snap() {
        snapId++;
        int[] array=new int[length];
        // for(int i=0;i<length;i++){
        //     array[i]=list.get(snapId-1)[i];
        // }
        array=Arrays.copyOf(list.get(snapId-1),length);
        list.add(array);
        return snapId-1;
    }
    
    public int get(int index, int snap_id) {
        return list.get(snap_id)[index];
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */