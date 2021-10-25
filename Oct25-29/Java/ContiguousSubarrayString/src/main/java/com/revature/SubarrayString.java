package com.revature;

import java.util.Arrays;

public class SubarrayString {
    private String[] arr;
    private String found = null;
    private boolean targetFound = false;

    SubarrayString(String[] arr){
        this.arr = arr;
        findSharedPrefix();
    }


    public void findSharedPrefix(){
        int start = 0;
        int end = start;
        int check = 0;
        String pre = arr[0].substring(start, end+1);

        for(String str: arr){
            if(str.contains(pre)){
                check++;

            }
        }

        if(check == arr.length){
            this.found = pre;
            findSharedPrefix(++end);
        }

    }
    public void findSharedPrefix(int end){
        int check = 0;
        String pre = arr[0].substring(0, end);

        for(String str: arr){
            if(str.contains(pre)){
                check++;

            }
        }

        if(check == arr.length){
            this.found = pre;
            findSharedPrefix(++end);
        }

    }

    public String[] getArr() {
        return arr;
    }


    public String getFound() {
        return found;
    }

    public boolean isTargetFound() {
        return targetFound;
    }





}
