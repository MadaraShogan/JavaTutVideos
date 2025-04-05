package JAVA_VIDEOS.java_video92_93_LinkedList_ArrayDeque;

import java.util.LinkedList;

public class LearningLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> a1=new LinkedList<>();
        LinkedList<Integer> a2=new LinkedList<>();
        //ArrayDeque<Integer> a3=new ArrayDeque<>();                 VIDEO93
        a1.add(5);
        a1.add(10);
        a2.add(30);
        a2.add(40);
        a2.add(5);
////        System.out.println(a1.get(0));
////        System.out.println(a1.size());
//        a2.addAll(a1);                 //will start adding from last
//        System.out.println(a2);
//        a2.addAll(0,a1);
//        System.out.println(a2);
////        a1.clear();
////        System.out.println(a1);
//        System.out.println(a1.contains(100));
//        System.out.println(a1);
////        a1.remove(1);
////        System.out.println(a1);
        System.out.println(a2.getFirst());
        System.out.println(a2.getLast());
        a2.addFirst(69);
        a2.addLast(69);
        System.out.println(a2);

    }
}
