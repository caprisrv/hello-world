class BubbleSortAscending{
	public static void main(String args[]){
		int temp;
		int arr[]={23,1,45,5,67,7,78,21,44,0};
		
		for(int i=0;i<arr.length;i++){

			for(int j=1;j<arr.length-i;j++){

				if(arr[j-1]>arr[j]){

					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}

				
		}
			for(int n=0;n<arr.length;n++){
				System.out.print(arr[n]+" ");
			}
			System.out.println();
			
	}
}