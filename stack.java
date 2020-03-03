package com.company;
import java.util.Scanner;
public class Stack {
    /*
     * Implement push ✓
     * Implement pop ✓
     * Implement peek ✓
     * Implement count
     * Implement sort
     * Implement random fill ✓
     * Implement show ✓
     * Implement sizeOf ✓
     * Implement userInput
     * Implement isEmpty ✓
     * Remember that LIFO
     * */
    static int top = 0;
    static int[] stack = new int[10];
    public void fillArray(int stack[],int n){
        for (int i = 0; i <10 ; i++) {
            stack[i] = (int)(Math.random()*100);
        }
    }
    public void push(int data) {
        stack[top] = data;
        top++;
    }
    public int pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }
    public int peek(){
        int data;
        data = stack[top-1];
        //no delete the element
        return data;
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        if(top<=0) return false;
        else return true;
    }

    public void show(){
        for (int n : stack) {


            System.out.print(n+" ");
        }
        }




}
