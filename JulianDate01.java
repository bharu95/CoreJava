public class JulianDate01 {
    public static void main(String[] args) {
        String date = "23-Feb-2016";
        System.out.println(dateFormat(date));
    }
   
    public static String dateFormat(String date) {
    	
    	String[] dateParts = date.split("-");
    	
    	int dd = Integer.parseInt(dateParts[0]);
    	int mm = convertMMMtoMM(dateParts[1]);
    	String jDay=julianDate(dd, mm);
    	
    	return dateParts[2]+jDay;
    		
    	
    }
   
   public static String julianDate(int dd, int mm) {
	   
	   int months[] = {0,31,59,90,120,151,181,212,243,274,304,334,365};
	   
	   int jDay = months[mm-1]+dd;
	   String jd = "";
	   if(jDay<10)
		   jd="00"+jDay;
	   else if(jDay<100)
		   jd="0"+jDay;
	   else
		   jd=jDay+"";
	   return jd;
   }
   
   public static int convertMMMtoMM(String mon) {
      //ADD YOUR CODE HERE
	   
	   String month = "JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
   		mon = mon.substring(0,3);
   		mon = mon.toUpperCase();
   		int num = ((month.indexOf(mon)/3)+1);
   		return num;
   }
}