package com.team3d;

import java.util.*;

public class Main {
    public Main() {

//          Task task =new Task("task");
//          Map<Integer,Task> taskMap = new HashMap<>();
//          for(int i=0;i<100000;i++){
//              taskMap.put(i,task);
//          }
//          long t1 = System.currentTimeMillis();
//        System.out.println(taskMap.containsKey(60000));
//          long t2 = System.currentTimeMillis();
//        System.out.println("map time is : " + (t2 - t1));
//
//        ArrayList<Task> tasks = new ArrayList<>();
//        for(int i=0;i<1000000;i++){
//            tasks.add(i,task);
//        }
//        long t3 = System.currentTimeMillis();
//        System.out.println(tasks.get(60000));
//        long t4 =System.currentTimeMillis();
//        System.out.println("array time is : " + (t4-t3));
//        Set<Task> set = new HashSet<>();
//        set.add(new Task("A"));
//        set.add(new Task("A"));
//        set.add(new Task("B"));
//        System.out.println(set.size());

//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"Bahram");
//        map.put(2,"Ali");
//        map.put(3,"Ali");
//        map.put(4,"Farhad");
//
//        System.out.println("Size : "+map.size());
//        System.out.println(map.containsKey(3));
//        for (String value:map.values()) {
//            System.out.println("values : "+value);
//
//        }
//        for (Integer keys:map.keySet()) {
//            System.out.println("keys : "+keys);
//        }

    }

    public static void main(String[] args) {
      Trip myTrip = new economic();
      myTrip.calculateTripPrice(2,3,true,false,false);

	 // new Main();
    }
}
