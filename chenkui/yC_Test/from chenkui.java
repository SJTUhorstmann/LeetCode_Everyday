mport java.math.BigInteger;
import java.util.Scanner;

public class yun1 {
    public static void main(String[] args){

        //方法1：用字符串处理
        Scanner yC1 = new Scanner(System.in);
        String Line1 = yC1.nextLine();
        String Line2 = yC1.nextLine();
        char[] arr1 = Line1.toCharArray();
        char[] arr2 = Line2.toCharArray();
        int len1 = arr1.length - 1;
        int len2 = arr2.length - 1;
        int add = 0;
        StringBuilder result = new StringBuilder();
        while(len1 >= 0 || len2 >= 0 || add!=0){
            if(len1 >= 0){
                int tem1 = arr1[len1--] - '0';
                add = add + tem1;
            }
            if(len2 >= 0){
                int tem2 = arr2[len2--] - '0';
                add = add + tem2;
            }
            result.append(add%10);
            add = add/10;
        }
        String last = result.reverse().toString();
        System.out.println(last);
        
        //方法2：大数据相加
        Scanner s = new Scanner(System.in);
        BigInteger[] a = new BigInteger[1000];
        while(s.hasNext()){
            a[0] = s.nextBigInteger();
            a[1] = s.nextBigInteger();
            System.out.println(a[0].add(a[1]));
        }
    }
}


import java.util.Scanner;

public class yC2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arrays = str.split(",");
        int[] nums = new int[arrays.length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.valueOf(arrays[i]);
        }
        bubbleSort(nums);
        String ret = "";
        for(int i : nums){
            ret = ret + i + ",";
        }
        System.out.println(ret.substring(0,ret.length() - 1));

    }

    public static void bubbleSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for(int e = arr.length - 1; e >0; e--){
            for(int i =0; i < e; i++){
                if(arr[i] > arr[i+1]){
                    int tem = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tem;
                }
            }
        }
    }


}


import java.util.Arrays;
import java.util.Scanner;

public class yC3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arrays = str.split(",");

        int[] nums = new int[arrays.length -1];
        nums[0] = Integer.valueOf(arrays[0].substring(1));
        int length = arrays[arrays.length - 2].length() - 1;
        String temp = arrays[arrays.length - 2].substring(0,length);
        nums[arrays.length - 2] = Integer.valueOf(temp);
        int m = Integer.valueOf(arrays[arrays.length - 1]);
        for(int i=1;i<=nums.length-2;i++){
            nums[i] = Integer.valueOf(arrays[i]);
        }
        int index =  binarySearch(nums,m);
        System.out.println(index);
    }

    public static int binarySearch(int[] nums, int key){
        Arrays.sort(nums);
        int l=0,h=nums.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==key){
                int tem=m;
                while(tem>=0 && nums[tem] == key){
                    tem--;
                }
                return tem+1;
            }
            else if(nums[m] > key){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return -1;
    }

}
