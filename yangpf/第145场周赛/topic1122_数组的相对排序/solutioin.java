class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        int[] res=new int[arr1.length];
        for(int i=0;i<arr2.length;i++){
            int num=0;
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==arr2[i])    num++;
            }
            map.put(arr2[i],num);
        }
        int index=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int value=entry.getValue();
            while(value-->0){
                res[index++]=entry.getKey();
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i])){
                res[index++]=arr1[i];
            }
        }
        return res;
    }
}