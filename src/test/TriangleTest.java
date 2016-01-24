package test;

import main.Triangle;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: hifdong
 * @Date: 16/1/23.
 */
public class TriangleTest {
    public static int testMinTotal() {
        Triangle triangle = new Triangle();
        List<Integer> row0 = Arrays.asList(2);
        List<Integer> row1 = Arrays.asList(3, 4);
        List<Integer> row2 = Arrays.asList(6, 5, 7);
        List<Integer> row3 = Arrays.asList(4, 1, 8, 3);
        List<List<Integer>> t = Arrays.asList(row0, row1, row2, row3);

        int ret = 0;
        try {
            ret =  triangle.minTotal(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(t);
        return ret;
    }

    public static void main(String[] args) {

        System.out.println(testMinTotal());
    }

}
