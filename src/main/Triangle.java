package main;

import java.util.List;

/**
 *
 * Given a triangle, find the minimum path sum from top to bottom.
 * Each step you may move to adjacent numbers on the row below.
 For example, given the following triangle

 [
 [2],
 [3,4],
 [6,5,7],
 [4,1,8,3]
 ]

 The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

 * @Author: hifdong
 * @Date: 16/1/23.
 */
public class Triangle{
    public int minTotal(List<List<Integer>> triangle ) {
        if (triangle == null ) {
            return 0;
        }
        if (triangle.size() == 1) {
            return triangle.get(0) == null ? 0 : triangle.get(0).get(0);
        }

        int[][] resArray = new int[triangle.size()][triangle.size()];
        int row = triangle.size();
        resArray[0][0] = triangle.get(0).get(0);

        for ( int i = 1; i < row; i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int res = 0;
                if (j - 1 >= 0) {
                    if (j < i) {
                        res = triangle.get(i).get(j) + Math.min(resArray[i - 1][j - 1], resArray[i - 1][j]);
                    } else {
                        res = triangle.get(i).get(j) + resArray[i - 1][j - 1];
                    }
                } else {
                    res = triangle.get(i).get(j) + resArray[i - 1][j];
                }
                resArray[i][j] =  res;
            }
        }

        int ret = Integer.MAX_VALUE;
        for (int i = 0; i < resArray[row - 1].length; i++) {
            if (resArray[row - 1][i] < ret) {
                ret = resArray[row - 1][i];
            }
        }
        return ret;

    }
}
