// Last updated: 1/2/2026, 9:09:57 am
1class RideSharingSystem {
2    Queue<Integer> rid; 
3    Queue<Integer> dri;
4    public RideSharingSystem() {
5        rid = new LinkedList<>();
6        dri= new LinkedList<>();
7    }
8    
9    public void addRider(int riderId) {
10        rid.add(riderId);
11    }
12    
13    public void addDriver(int driverId) {
14        dri.add(driverId);
15    }
16    
17    public int[] matchDriverWithRider() {
18        if( dri.size()==0 || rid.size()==0 ){
19            return new int[]{-1,-1};
20        }
21
22        int dId = dri.poll();
23        int rId= rid.poll();
24        return new int[]{dId,rId};
25    }
26    
27    public void cancelRider(int riderId) {
28        rid.remove(riderId);
29    }
30}
31
32/**
33 * Your RideSharingSystem object will be instantiated and called as such:
34 * RideSharingSystem obj = new RideSharingSystem();
35 * obj.addRider(riderId);
36 * obj.addDriver(driverId);
37 * int[] param_3 = obj.matchDriverWithRider();
38 * obj.cancelRider(riderId);
39 */