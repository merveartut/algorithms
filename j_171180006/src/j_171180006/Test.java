package j_171180006;

import java.util.Random;

public class Test {

	public static void main(String []args) {
	
	int []array1= new int [20];
	int []array2= new int [20];
	for(int i=0;i<20;i++) {
	Random r = new Random ();
	int x = r.nextInt(20);
	array1[i]= x;
	array2[i]=x;
	}
	Count c = new Count();
	System.out.println("ilk hali:");
	for(int j=0;j<array1.length;j++) {
	System.out.print(array1[j]+" ");
	}
	System.out.println();
	
	long beginTime = 0;
	 long endTime = 0;
	 System.out.println("Counting Sort:");
	  beginTime = System.currentTimeMillis();
	
	c.CountSort(array1);
	endTime = System.currentTimeMillis();
	 System.out.println();
	System.out.println("Çalışma Süresi : " + ((double) (endTime - beginTime)) / 1000);
	 System.out.println("Quick Sort:");
	beginTime = System.currentTimeMillis();
	c.QuickSort(array2, 0, 19);
	endTime = System.currentTimeMillis();
	 System.out.println();
	System.out.println("Çalışma Süresi : " + ((double) (endTime - beginTime)) / 1000);
	
	}





}