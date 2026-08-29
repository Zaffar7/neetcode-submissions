class Solution {
    public String predictPartyVictory(String senate) {
       Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
       // StringBuilder sb = new StringBuilder(senate);
         int n = senate.length();
        for(int i=0;i<senate.length();i++){
           if(senate.charAt(i)=='R')r.add(i);
           else d.add(i);
        }
        while(r.size()>0 && d.size()>0){
       int Rturn =r.poll();
       int Dturn= d.poll();
       if(Rturn < Dturn) r.add(Rturn +n);
       else d.add(Dturn +n);
        
        }
        return r.size()==0? "Dire":"Radiant";

    }
}