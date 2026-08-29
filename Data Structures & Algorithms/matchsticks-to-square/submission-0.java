class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum=0;
        for(int i:matchsticks)sum+=i;
        if(sum%4!=0) return false;
         int[] sides = new int[4];
     return   f(matchsticks,sides,sum/4,0);

    }
  boolean f(int[] ma,int []side,int tar, int i){
        if(i==ma.length){
              return side[0] == tar &&
                   side[1] == tar &&
                   side[2] == tar &&
                   side[3] == tar;
        }

          for (int j = 0; j < 4; j++) {

            if (side[j] + ma[i] > tar)
                continue;

            side[j] += ma[i];

            if (f(ma, side, tar, i + 1))
                return true;

            side[j] -= ma[i]; // backtrack
        }

        return false;

    }
}