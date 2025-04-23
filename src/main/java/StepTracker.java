import java.util.ArrayList;
public class StepTracker
{
 private ArrayList <Integer> steps; //idk why this is causing errors
 private int minSteps;
 // private int steps;
 // private int activeDays;
 // private int days;
 
 
 public StepTracker(int a){
  steps = new ArrayList <Integer>();
  minSteps = a;
  // steps = 0;
  // activeDays = 0;
  // days = 0;
 }
 public void addDailySteps(int step){
  steps.add(step);
  // steps += step;
  // days++;
  // if(step >= minSteps){
  //  activeDays++;
  // }
  
 }
 public double averageSteps(){
  double b = 0;
  for(int i : steps){
   b += i;
  }
  if(b == 0){
   return b;
  }
  return (double)b/steps.size();
  // return (double)steps/days;
 }
 public int activeDays(){
  int c = 0;
  for(int i : steps){
   if(i >= minSteps){
    c++;
   }
  }
  return c;
  // return activeDays;
 }
} 
