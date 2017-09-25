package com.hr.timeconversion;

import java.util.Scanner;

/**
 * Created by golagem on 9/25/17.
 */
public class TimeConversion {

    //Input ==> 08:15:45AM
    //Output ==> 19:05:45PM

    static String timeConversion(String s) {
        // Complete this function
        String[] time =s.split(":");
        int hh=Integer.parseInt(time[0]);
        String mm=time[2];
        if(mm.endsWith("PM")){
            hh=hh+12;
            time[0]=hh+"";
            time[2]=mm.replace("PM","");
        }else{
            time[2]=mm.replace("AM","");
        }
        return String.join(":",time);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }

}
