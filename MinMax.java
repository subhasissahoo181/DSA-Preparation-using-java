//Maximum and minimum of  an array using Linear Search

class MinMax{
	int min;
	int max;
	int low =0;
	int high = n-1;
	
	MinMax.getMinMax(int[] arr; int low;int high){
		MinMax minmax = new MinMax();
		MinMax left = new MinMax();
		MinMax right = new MinMax();
		
		if(low == high){
			MinMax.max = arr[low];
			MinMax.min = arr[high];
			return MinMax;
		}
		if(high == low +1){
			if(arr[high] > arr[low]){
				MinMax.max = arr[high];
				MinMax.min = arr[low];
				
			}
			else if(arr[low] > arr[high]){
				MinMax.max = arr[low];
				MinMax.min = arr[high];
			}
			return MinMax;
		}
		//Logic using mergesort
		int mid = (low + high)/2;
		int left = getMinMax(int[] arr; int low; int mid);
		int right = getMinMax(int[] arr; int mid+1; int high);
		
		if(left.min < right.min){
			MinMax.min = left.min;
		}
		else{
			MinMax.min = right.min;
		}
		
		if(left.max > right.max){
			MinMax.max = left.max;
			
		}
		else{
			MinMax.max = right.max;
		}
	}
	
	
}