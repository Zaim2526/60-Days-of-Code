public class BinarySearch {
	
	public static int binary(int arr[],int size, int key) {
		
		int start = 0;
		int end = size-1;
		int mid= start+ (end-start)/2;
				
		while(start<=end) {
			if(arr[mid] == key) {
				return mid;
			}
			else if(arr[mid]<key) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
			mid = start+ (end-start)/2;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		System.out.println("Enter element of array");
		for(int i=0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter element to be searched");
		int key = sc.nextInt();
		
		int index = binary(arr, a, key);
		
		if(index==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println(key+" is present at "+index+" index.");
		}
	}

}
