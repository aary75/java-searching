public class Comparison
{
	public static void main(String[] args) {
	   
		String str1 = "Hello";
		
		StringBuilder stringBuilder = new StringBuilder("");
		StringBuffer stringBuffer = new StringBuffer("");
		
		long start_nanoTime = System.nanoTime();
		
		for(int i = 0;i <= 100000; i++){
		    stringBuffer.append(str1);
		}
		
		long nanoTime_end = System.nanoTime();
		
		long stringBuffer_timeTaken = nanoTime_end - start_nanoTime;
		
		for(int i = 0; i<= 100000; i++){
		    stringBuilder.append(str1);
		}
		
		long nanoTime_finalEnd = System.nanoTime();
		
		long stringBuilder_timeTaken = nanoTime_finalEnd - stringBuffer_timeTaken;
		
		if(stringBuilder_timeTaken < stringBuffer_timeTaken){
		    System.out.print("StringBuilder is faster than stringbuffer");
		}
		else{
		    System.out.print("StringBuffer is faster than stringBuilder");
		}
	}
}


// Output:
// StringBuffer is fater than stringBuilder
