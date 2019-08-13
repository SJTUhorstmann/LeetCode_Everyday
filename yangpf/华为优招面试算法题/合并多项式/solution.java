public static String merge(String str) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pre = 0;
        int cur = 0;
        int ZhiShu;
        int XiShu;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || i == str.length() - 1) {
                String s;
                if (i == str.length() - 1) {
                    s = str.substring(pre, i + 1);
                } else {
                    s = str.substring(pre, i);
                }
                pre = i;
                String[] strs = s.split("\\*");
                ZhiShu = Integer.valueOf(strs[1]);
                XiShu = Integer.valueOf(strs[0]);
                if (map.containsKey(ZhiShu)) {
                    map.put(ZhiShu, map.get(ZhiShu) + XiShu);
                } else {
                    map.put(ZhiShu, XiShu);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                sb.append(entry.getValue() + "*" + entry.getKey() + "+");
            }
        }
        return sb.substring(0, sb.length() - 1).toString();
    }