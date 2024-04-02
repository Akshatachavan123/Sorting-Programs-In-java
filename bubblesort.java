
//Bubble sort
package arrayprograms;

public class bubblesort {

	public static void main(String[] args) {
		int[] arr= {10,2,5,6,9,0};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("sorted array is : ");
		for(int k:arr) {
			System.out.print(k+" ");
		}

	}

}

//input : 10,2,5,6,9,0
//output : sorted array is : 0 2 5 6 9 10 


