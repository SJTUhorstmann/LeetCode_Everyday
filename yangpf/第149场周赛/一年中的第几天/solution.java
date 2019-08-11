class Solution {
    public int ordinalOfDate(String date) {
        int days=0;
        String[] str=date.split("-");
        //true为闰年；
        boolean flag=false;
        int year=Integer.valueOf(str[0]);
        if((year%4==0&&year%100!=0)||(year%100==0&&year%400==0))    flag=true;
        days+=getDays(Integer.valueOf(str[1]))+Integer.valueOf(str[2]);
        if(flag && Integer.valueOf(str[1])>=3)    days+=1;
        return days;
    }
    //非闰年
    public int getDays(int month){
        switch(month){
            case 1:
                return 0;
            case 2:
                return 31;
            case 3:
                return 59;
            case 4:
                return 90;
            case 5:
                return 120;
            case 6:
                return 151;
            case 7:
                return 181;
            case 8:
                return 212;
            case 9:
                return 243;
            case 10:
                return 273;
            case 11:
                return 304;
            case 12:
                return 334;
        }
        return 0;
    }
}