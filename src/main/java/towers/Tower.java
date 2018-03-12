package main.java.towers;

import java.util.Arrays;
import java.util.Stack;

public class Tower extends Stack<Integer> {

    public long id = System.currentTimeMillis() % 100;

    public Tower(int startingHeight){
        for(int i = startingHeight; i > 0 ; i --){
            push(i);
        }
    }

    public Integer getTop(){
        return ((Tower)this.clone()).pop();
    }

    @Override
    public String toString(){
            return Arrays.toString(this.toArray());
    }

    @Override
    public Integer pop(){
        return (size() > 0) ? super.pop() : Integer.MAX_VALUE;
    }

}
