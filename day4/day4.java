package day4;

public class day4 {
    

 @SuppressWarnings("unused")
 boolean squirrelPlay(int temp, boolean isSummer) {
    int upperLimit = 90;
    int lowerLimit = 60;
    if(isSummer){
      upperLimit = 100;
    }
    
    if(temp>=lowerLimit && temp<=upperLimit){
      return true;
    }
    return false;
  }

  public String alarmClock(int day, boolean vacation) {
    String alarm = "7:00";
    if(vacation){
      alarm = "10:00";
      if(day==0 || day ==6){
        alarm = "off";
      }
    }
    else if(day==0 || day ==6){
      alarm = "10:00"; 
    }  
    return alarm;
  }


  public String fizzString(String str) {
    
    int strlength = str.length();
    char no1 = str.charAt(0);
    char charx = str.charAt(strlength-1);
    if(no1 == 'f' && charx=='b'){
      return "FizzBuzz";
    }
    else if(no1=='f'){
      return "Fizz";
    }
    else if(charx=='b'){
      return "Buzz";
    }
  return str;
}
  

}