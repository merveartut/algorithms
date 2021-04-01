package j_171180006;



public class Count {

	

	   public  void CountSort(int[] arr) {
	        int length = arr.length;
	        
	        int max = arr[0];
	      	int min = arr[0];
	        for (int i = 0; i < length; i++) {
	            if (arr[i] > max)
	                max = arr[i];
	            if (arr[i] < min)
	                min = arr[i];
	        }
	        int r =( max- min+ 1);

	        int[] c = new int[r];
	       
	        for (int i = 0; i < length; i++)
	            c[arr[i] - min]++;
	       
	        for (int i = 1; i < r; i++)
	            c[i] += c[i - 1];
	       
	        int j = 0;
	        for (int i = 0; i < r; i++) {
	            while (j < c[i])
	                arr[j++] = i + min;
	       for(int m=0;m<20;m++) {
	            System.out.print(arr[m]+" ");
	      
	       }
	       
	       System.out.println();
	        }
	     
	   
	   }

	   public  int QuickPart (int[]ar,int min,int max) {
			
			int pivot=ar[max];
			int i= min-1;
			
			for(int j=min;j<max;j++) {
				if(ar[j]<pivot) {
					i++;
					int temp =ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			int temp = ar[i+1];
			ar[i+1]=ar[max];
			ar[max]=temp;
			

			
			return i+1;
		}
			public void QuickSort(int array[], int low, int high) 
		    { 
		        if (low < high) 
		        { 
		            
		            int x = QuickPart(array, low, high); 
		  
		            for(int k=0;k<array.length;k++) {
			            System.out.print(array[k]+" ");
			            }
			        System.out.println();
		            QuickSort(array, low, x-1); 
		         
		          
		            QuickSort(array, x+1, high); 
		         
		            
		        } 
		        
		    } 
}

	   

