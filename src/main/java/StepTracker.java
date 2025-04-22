import java.util.ArrayList;
public class StepTracker
{
 private ArrayList <Integer> steps;
 private int minSteps;
 public StepTracker(int a){
  steps = new ArrayList <Integer>();
  minSteps = a;
 }
 public void addDailySteps(int step){
  steps.add(step);
 }
 public double averageSteps(){
  int b = 0;
  for(int i : steps){
   b += i;
  }
  return (double)b/steps.size();
 }
 public int activeDays(){
  int c = 0;
  for(int i : steps){
   if(i >= minSteps){
    c++;
   }
  }
  return c;
 }
} 
