public class disorderSearchBin {
	
	 public static int quickSortOneTime(int[] array, int low, int high){ //一趟快速排序   
	int key = array[low];  
            while(low < high){  
        	while(key < array[high] && low < high)  high--;
            array[low] = array[high];  
            while(key > array[low] && low < high)   low++;  
            array[high] = array[low];
         }  
	    array[high] = key;  
	    return high;
	    }  
	 
	 public static int Select_k(int[] array, int low, int high, int k) {
		 int index;
		 if(low == high) return array[low];
		 int partition = quickSortOneTime(array, low, high);
		 index = high - partition + 1;  //找到的是第几个大值
		 if(index == k) {
			 return array[partition];
		 }else if(index < k) {//此时向左查找
			 return Select_k(array, low, partition-1, k-index);  //查找的是相对位置的值，k在左段中的下标为k-index
		 }else {
			 return Select_k(array, partition+1, high, k);
		 }
	 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = new int[] {92, 5, 88, 13, 80};   
	     int index = Select_k(array, 0, array.length-1, 2);
	     System.out.print(index);
	}
 
}
