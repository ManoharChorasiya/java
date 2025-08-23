class Time{
    private int hour;
    private int minute;
    private int second;
    public Time(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
      public Time()
      {
        hour = minute = second =0;
      }
   public Time add(Time t){
        Time temp = new Time();
        temp.hour = this.hour +t.hour;
        temp.minute = this.minute  + t.minute;
        temp.second = this.second + t.second;

    
    if(temp.minute>=60){
        temp.hour++;
        temp.minute = temp.minute % 10;
    }
    if(temp.second>=60){
        temp.minute++;
        temp.second = temp.second % 60;
    }
    
    return temp;
    }
    public int gethour(){
        return hour;
    }
    public int getminute(){
        return minute;
    }
    public int getsecond(){
        return second;
    }
    
}
class TestMain{
    public static void main(String args[]){
        Time t1 = new Time(5,6,30);
        Time t2 = new Time(5,6,30);
        Time result = t1.add(t2);
        System.out.println(result.gethour() + ":"+ result.getminute() +":"+ result.getsecond());

    }
}
