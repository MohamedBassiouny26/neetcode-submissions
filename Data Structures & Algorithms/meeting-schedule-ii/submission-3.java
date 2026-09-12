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
        Collections.sort(intervals,(a,b)->{
            if(a.start==b.start)
                return a.end-b.end;
            return a.start-b.start;
        });
        Map<Integer,Interval> calender=new HashMap<>();
        int start=intervals.get(0).start;
        int end=intervals.get(0).end;
        int days=1;
        calender.put(days,new Interval(start,end));
        for(int i=1;i<intervals.size();i++){
            Interval interval=intervals.get(i);
            if(!addMeetingToExistingDay(calender,interval)){
                calender.put(++days,new Interval(interval.start,interval.end));
            }
        }
        System.out.println(calender);
        return days;
    }
    private boolean addMeetingToExistingDay(Map<Integer,Interval> calender,Interval interval){
        for(Integer key:calender.keySet()){
            Interval dayInterval=calender.get(key);
            if(interval.start>=dayInterval.end){
                dayInterval.end=interval.end;
                return true;
            }
        }
        return false;
    }
}
