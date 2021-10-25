package com.revature;

import java.util.Arrays;

public class SubArraySum {

    private int[] arr;
    private int startIndex = -1;
    private int endIndex = -1;
    private boolean targetFound = false;

    SubArraySum(int[] arr){
        this.arr = arr;
        this.startIndex = 0;
        this.endIndex = 0;
    }

    SubArraySum(int[] arr, int target){
        this.arr = arr;
        this.startIndex = 0;
        this.endIndex = 0;
        findSum(target);
    }

    public void findSum(int target){
        int start = 0;
        int end = start;
        int sum = -1;
        int[] subArr;
        for(;end < arr.length; end++){
            subArr = Arrays.copyOfRange(arr, start, end +1);
            sum = Arrays.stream(subArr).sum();
            if(sum == target){
                this.startIndex = start;
                this.endIndex = end;
                this.targetFound = true;
                return;
            }
            if(sum > target){
                break;
            }
        }
        findSum(target, ++start);
    }

    public void findSum(int target, int start){
        int end = start;
        int sum = -1;
        int[] subArr;
        for(;end < arr.length; end++){
            subArr = Arrays.copyOfRange(arr, start, end+1);
            sum = Arrays.stream(subArr).sum();
            if(sum == target){
                this.startIndex = start;
                this.endIndex = end;
                this.targetFound = true;
                return;
            }
            if(sum > target){
                break;
            }
        }
        if(start > arr.length -1){
            return;
        }
        findSum(target, ++start);
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public int getEndIndex() {
        return this.endIndex;
    }

    public boolean isTargetFound(){
        return targetFound;
    }

    public String getOutput(){
        //Elements are 12, 17 and 15
        StringBuilder secondLine = new StringBuilder("Element(s) is/are ");
        for (int i = this.startIndex; i <= this.endIndex; i++) {
            Integer num = arr[i];
            if(i > this.startIndex & i != this.endIndex){
                secondLine.append(", ");
            }
            else if(i == endIndex & this.startIndex != this.endIndex){
                secondLine.append(", and ");
            }
            secondLine.append(num);

        }
        secondLine.append(".");
        if(this.startIndex == -1 & this.endIndex == -1){
            return "To get results first run the findSum method";
        }
        if(targetFound == false){
            return "Target not found";
        }
        else {
            if (this.startIndex == this.endIndex){
                return "Sum found at index " + this.startIndex + ".\n" + secondLine;
            }
            return "Sum found between index " + this.startIndex + " and "
                    + this.endIndex + ".\n" + secondLine;
        }
    }


}
