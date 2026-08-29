class CountSquares {
HashMap<List<Integer>,Integer> cnt;
List<List<Integer>> pt;
    public CountSquares() {
        cnt = new HashMap<>();
        pt = new ArrayList<>();
        
    }
    
    public void add(int[] point) {
           List<Integer> p = Arrays.asList(point[0], point[1]);
        cnt.put(p, cnt.getOrDefault(p,0)+1);
        pt.add(p);
    }
    
    public int count(int[] point) {
        int res=0;
        int px= point[0];
        int py= point[1];
        for(List<Integer>p:pt){
            int x=p.get(0);
            int y=p.get(1);
            if(Math.abs(py-y)!=Math.abs(px-x)|| x==px || y==py) continue;
res+=cnt.getOrDefault(Arrays.asList(x,py),0)*cnt.getOrDefault(Arrays.asList(px,y),0);
        }
return res;
    }
}
