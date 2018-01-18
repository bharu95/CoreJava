public class LuckyNumber01 {
    public static void main(String[] args) {
        String date = "15-March-2016";
        System.out.println(getLuckyNumber(date));
    }

    public static int getLuckyNumber(String date) {
    	
    	String[] dateParts = date.split("-");
    	
    	int dd = Integer.parseInt(dateParts[0]);
    	int mm = convertMMMtoMM(dateParts[1]);
    	int yyy = Integer.parseInt(dateParts[2]);
    	
    	int sumOfDigits = getSumOfDigits(dd);
    		sumOfDigits += getSumOfDigits(mm);
    		sumOfDigits += getSumOfDigits(yyy);
    		
    	while(sumOfDigits>10) {
    		sumOfDigits = getSumOfDigits(sumOfDigits);
    	}
    	
        return sumOfDigits;
    }

    public static int convertMMMtoMM(String mon) {
 
    	String month = "JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
    	mon = mon.substring(0,3);
    	mon = mon.toUpperCase();
    	int num = ((month.indexOf(mon)/3)+1);
    	return num;
		
        
    }
    
    public static int getSumOfDigits(int num) {
    	
    	int sum=0;
    	while(num>0) {
    		sum += num%10;
    		num = num/10;
    	}
         return sum;
    }
}