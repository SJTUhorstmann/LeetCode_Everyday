class Solution {
    public int[] constructArray(int n, int k) {
        int[] arr = new int[n];
        arr[0] = 1;
        for (int i = 1, interval = k; i <= k; i++, interval--) {
            arr[i] = i % 2 == 1 ? arr[i - 1] + interval : arr[i - 1] - interval;
        }
        for (int i = k + 1; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}