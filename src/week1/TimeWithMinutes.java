package org.example;

import java.util.Scanner;

public class TimeWithMinutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startHour = sc.nextInt(), startMinute  = sc.nextInt();
        int finishHour = sc.nextInt(), finishMinute = sc.nextInt();

        int timeStayH = (finishHour- startHour)*60*60;
        int timeStayM = (finishMinute- startMinute)*60;
        if(timeStayH == 0){
            timeStayH = 24*60*60;
        }
        int sumSec = timeStayH+timeStayM;
        System.out.println(hourAndMinute(sumSec));
    }
    public static String hourAndMinute(int sec){
        int hour = sec/3600;
        int mins = (sec%3600)/60;
        return String.format("%d часов %02d минут", hour, mins);
    }

}
