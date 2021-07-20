package com.gerbertShildtFullManual.part5;

class IFElse {
    public static void main(String args[]) {
        int month = 4;  //  Апрель
        String season;
        if(month == 12 || month == 1 || month == 2)
            season = "winter";
        else if(month == 3 || month == 4 || month == 5)
            season = "spring";
        else if(month == 6 || month == 7 || month == 8)
            season = "summer";
        else if(month == 6 || month == 7 || month == 8)
            season = "autumn";
        else
            season = "белеберда";
        System.out.println("Апрель относится к " + season + ".");
    }
}
