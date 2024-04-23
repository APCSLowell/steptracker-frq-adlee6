import java.util.ArrayList;
public class StepTracker
{
 private int min;
 private int days;
 private int steps;
 private int active;
 
 public StepTracker(int stepsMin) {
  min = stepsMin;
  days = 0;
  steps = 0;
  active = 0;
 }

 public addDailySteps(int num) {
  steps += num;
  days++;
  if(num >= min)
    active++;
 }

 public int activeDays(){
  return active;
 }

 public double averageSteps() {
  if(days == 0)
    return 0;
  else
    return (double)steps/days;
 }
} 
