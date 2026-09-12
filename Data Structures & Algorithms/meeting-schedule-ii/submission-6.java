/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.isEmpty()) return 0;
        int[] start=new int[intervals.size()];
        int[] end=new int[intervals.size()];
        for(int i=0;i<intervals.size();i++){
            Interval interval=intervals.get(i);
            start[i]=interval.start;
            end[i]=interval.end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int s=0;
        int e=0;
        int count=0;
        int res=0;
        while(s<start.length){
            if(start[s]<end[e]){
                count++;
                s++;
            }else{
                e++;
                count--;
            }
            res=Math.max(res,count);
        }
        return res;
    }
}
