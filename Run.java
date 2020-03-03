package com.company;

public class Run {
    public static void  main(String[] args){
        //create an object
        Stack nums = new Stack();
        nums.push(15);
        nums.push(8);
        nums.push(10);
        nums.push(100);
        System.out.println(nums.pop());
        System.out.print("Peek : ");
        System.out.println(nums.peek());
        nums.show();
        System.out.print("size : " + nums.size());
    }

}
