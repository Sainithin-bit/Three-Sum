package system.practise;
import java.io.BufferedInputStream;
import java.util.*;
import java.util.regex.Pattern;


public class Threesum {

	
	private long start;
	public static int count(int [] a)
	{
		int i,j,k;
		int count=0;
		for(i=0;i<a.length;i++)
			for(j=i+1;j<a.length;j++)
				for(k=j+1;k<a.length;k++)
					if(a[i]+a[j]+a[k]==0)
						count++;
		
		return count;
		
	}
	 public double elapsedTime() {
	        long now = System.currentTimeMillis();
	        return (now - start) / 1000.0;
	    }
	 
	 public void Stopwatch() {
	        start = System.currentTimeMillis();
	    } 
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  In in = new In(args[0]);
	        int[] a = in.readAllInts();

	        Stopwatch timer = new Stopwatch();
	        int count = count(a);
	        System.out.println("elapsed time = " + timer.elapsedTime());
	        System.out.println(count);
		
	}
	
	
}
