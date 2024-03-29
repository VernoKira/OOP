package Problem5;
import java.util.*;

public class Time implements Comparable<Time>{
  int hour;
  int minute;
  int second;
  public Time() {
    
  }
  public Time (int hour,int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public String toString() {
    return hour + ":" + minute + ":" + second;
  }
  public int compareTo(Time t) {
    if(this.hour != t.hour) {
      if(this.hour > t.hour) {
        return 1;        
      }
      if(this.hour < t.hour) {
        return -1;
      }
    }
    else if(this.minute != t.minute){
      if(this.minute > t.minute) {
        return 1; 
      }
      if(this.minute < t.minute) {
        return -1; 
      }
    }
    else {
      if(this.second > t.second) {
        return 1;
      }
      if(this.second < t.second) {
        return -1;
      }
    }
    return 0;
  }
}