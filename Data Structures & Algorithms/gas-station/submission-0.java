class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int a=0,b=0;
        for(int i=0;i<gas.length;i++){
            a+=gas[i];
            b+=cost[i];
        }
        if(b>a) return -1;
        int idx=0;
        int bal=0;
        for(int i=0;i<gas.length;i++){
        bal+=(gas[i]-cost[i]);
        if(bal<0){
            idx=i+1;
            bal=0;
        }
        }
        return idx;
    }
}
