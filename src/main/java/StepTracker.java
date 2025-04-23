import java.util.ArrayList;
public class StepTracker
{
 // private ArrayList <Integer> steps; //idk why this is causing errors
 private int minSteps;
 private int steps;
 private int activeDays;
 private int days;
 
 
 public StepTracker(int a){
  // steps = new ArrayList <Integer>();
  minSteps = a;
  steps = 0;
  activeDays = 0;
  days = 0;
 }
 public void addDailySteps(int step){
  // steps.add(step);
  steps += step;
  days++;
  if(step >= minSteps){
   activeDays++;
  }
  
 }
 public double averageSteps(){
  // int b = 0;
  // for(int i : steps){
  //  b += i;
  // }
  // return (double)b/steps.size();
  return steps(double)/days;
 }
 public int activeDays(){
  // int c = 0;
  // for(int i : steps){
  //  if(i >= minSteps){
  //   c++;
  //  }
  // }
  // return c;
  return activeDays;
 }
} 
