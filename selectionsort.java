
//selection sort  
package arrayprograms;

public class selectionsort {

	public static void main(String[] args) {
		int[] arr= {10,6,3,22,55,88,9};
		for(int i=0;i<arr.length;i++) {
			int minid=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minid]) {
					minid=j;
				}
				int temp=arr[i];
				arr[i]=arr[minid];
				arr[minid]=temp;	
			}
			
			}
		System.out.print("sorted data is : ");
		for(int k :arr) {
			System.out.print(k +" ");
			
			
		}

	}

}

//input : 10,6,3,22,55,88,9
//output : sorted data is : 3 6 9 10 22 55 88 
