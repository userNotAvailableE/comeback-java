package com.javadatastructures;

import java.util.*;

public class Datastructures {
    public static void main(String[] args) {
//        // arrays
//        String [] colors = new String[5];
//        colors[0] = " hai";
//        System.out.println(Arrays.toString(colors));
//        System.out.println(colors); // address
//
//        String [] hai = {"hall", " bye"};
//        System.out.println(Arrays.toString(hai));
//        System.out.println(colors.length);
//        // Arrays.stream(colors).forEach(System.out::print);
//
//        int[][] array2d;
//        // int[][] array2d = new int[2][2];
//        array2d = new int[][]{
//                new int[]{1,3},
//                new int[]{3,5}
//        };
//
//        System.out.println(Arrays.deepToString(array2d));
//
//        // list
//        List al = new ArrayList();
//        al.add("blue");
//        al.add(2);
//        al.add("hai");
//
//        System.out.println(al);
//        al.remove(2);
//        System.out.println(al);
//        System.out.println(al.get(0));

        /// Stack
//        Stack<Integer> s = new Stack<>();
//        s.push(3);
//        System.out.println(s.peek());
//        s.push(4);
//        System.out.println(s.peek());
//        System.out.println(s.size());
//        s.add(3);
//        System.out.println(s.peek());

        // Queue

//        Queue<Persons> q = new LinkedList<>();
//        q.add(new Persons(3, "guru"));
//        q.add(new Persons(4,"mani"));
//        System.out.println(q.peek());
//        System.out.println(q.poll()); // removes
//        System.out.println(q.peek());


//        LinkedList ll = new LinkedList<>();
//        ll.add(3);
//        ll.add("55j");
//        System.out.println(ll);
//        // using iterator
//        ListIterator llitr = ll.listIterator();
//        while (llitr.hasNext()){
//            System.out.println(llitr.next());
//        }
//        System.out.println("dffgfg");
//        while (llitr.hasPrevious())
//            System.out.println(llitr.previous());

        // no duplicates in set
        /// treeset prevents order
        // hashset -hashmap  no order use iterator
//        Set<String> s = new HashSet<>();
//        s.add("ha");
//        s.add("dsdfd33");
//        s.add("dd");
//        s.add("22");
//        s.forEach(System.out::println);
//        /// if u use classes override equal and hashcode and toString(not neccesary) methods
//        s.remove("dd");
//        System.out.println("new");
//        s.forEach(System.out::println);





        // map -> hashtable,hashmap, sortedmap
        // key value pair

        // hashtable nulls not allowed stycronized

        // hashmap nulls are allowed not syncronized
        // hashmap -> linkedHashMap
        // hashmap doubly likedlist implemantation so slow

        // sortedmap -> navigableMap -> treeMap
        // TreeMap sorted nulls not allowed

        // map cant contain duplicates
//        Map<Integer,String> student = new HashMap<>();
//        student.put(1,"hai");
//        student.put(2,"Alex");
//        student.put(3,"ROse");
//        System.out.println(student);
//        // student.forEach(System.out::println); -- error
//        System.out.println(student.size());
//        System.out.println(student.get(2));
//        System.out.println(student.keySet());
//        System.out.println(student.entrySet());
//        student.entrySet().forEach(System.out::println);
//
//        System.out.println("woow new looping in map");
//
//        student.entrySet().forEach(x -> System.out.println(x.getKey()+ " "+x.getValue()));
//
//        System.out.println("another looping");
//        student.values().forEach(System.out::println);
//
//        System.out.println("another again");
//
//
//        /// removing
//        student.remove(2);
//        System.out.println(student.get(2)); // returns null
//        System.out.println(student);
//        student.replace(1,"hkk");
//        System.out.println(student);

// hash  

    }

    static record Persons(int age, String name){};
}
