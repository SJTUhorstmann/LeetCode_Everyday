 public int myAtoi(String str) {
        if (str == null) return 0;
        str = str.trim();//trim()函数是去掉String字符串的首尾空格
        if (str.isEmpty()) return 0;

        int sign = 1, n = str.length();
        int index = 0;
        //正负号只判断一次，不能使用循环
        if (index < n && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        // 计算整数
        int total = 0;
        while (index < n) {
            int num = str.charAt(index) - '0';
            if (num < 0 || num > 9) break;
            //避免越界
            if (total > Integer.MAX_VALUE / 10 ||
                    (total == Integer.MAX_VALUE / 10 && num > Integer.MAX_VALUE % 10))
            {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = total * 10 + num;
            index++;
        }
    return total*sign;

    }