package test;

import java.util.*;

/**
 * @Author: hifdong
 * @Date: 16/1/23.
 */
public class Experiment {
    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        //        List<Integer> al = new ArrayList();
//        List<Integer> ll = new LinkedList();
//        al.add(0);
//        ll.add(0);
        List<Integer> ll = Collections.nCopies(2, 0);
        List<Integer> al = Arrays.asList(0, 0, 0);

        ll.set(0, 5);
        System.out.print(ll.get(0));

        al.set(0, 2);
        System.out.print(al.get(0));
    }

    public static void test2() {
        List<Integer> ll = new ArrayList(Collections.nCopies(2, 0));

        ll.set(0, 5);
        System.out.print(ll.get(0));
    }
}
