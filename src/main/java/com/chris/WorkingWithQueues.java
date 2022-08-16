package com.chris;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args){

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("alex", 21));
        linkedList.add(new Person("alexa", 21));
        linkedList.addFirst(new Person("ali", 18));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

    }

    private static void queues(){
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("ali", 40));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket);
    }

    static record Person(String name, int age){}
}
