package com.chris;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WorkingWithSets {
    public static void main(String[] args){
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("green"));
        balls.add(new Ball("red"));

        balls.remove(new Ball("red"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }

    /*static class Ball{
        String color;
        public Ball(String color){
            this.color = color;
        }
    }*/

    record Ball(String color){}
}
