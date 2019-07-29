class Solution {
    public int findLength(int[] A, int[] B) {
        int max=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
	// && ������ж��������Ż���Ľ�������Ӵ��ж������������ʱ
                if(B[j]==A[i] && i<A.length-max){
                    max=Math.max(max,getMax(A,i,B,j));
                }
            }
        }
        return max;
    }
    public int getMax(int[] A,int indexA,int[] B,int indexB){
        int max=0;
        while(indexA<A.length && indexB<B.length && A[indexA]==B[indexB]){
            indexA++;
            indexB++;
            max++;
        }
        return max;
    }
}