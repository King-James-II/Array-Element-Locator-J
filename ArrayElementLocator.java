/* Description: This program takes a two-dimensional int array and a two-dimensional double array
and sends them into two overloaded methods based on the array being passed it scans the 
two-dimensional arrays for the largest and smallest element and stores the location of the element 
within the two-dimensional array in a single-dimensional array and returns it back to the main 
method to be displayed.*/

class ArrayElementLocator {
	public static void main(String[] args) {
		// Creating and storing values within our multidimensional int and double arrays.
		int[][] intarray = { 	{0,-1,2,3},
								{3,2,11,0}, 
								{3,5,6,1}, 
								{3,8,3,4} };
		double[][] dblarray = { {0.9,1.8,2.7,3.6},
								{3.5,2.4,1.3,0.2}, 
								{3.1,5.0,16.9,1.8}, 
								{3.7,8.6,3.5,4.4} };
		// Call each overloaded method and return the location of the largest and smallest elements
		// within the multidimensional arrays then print them to the console for viewing.
		int [] largeloc = locateLargest(intarray);
		System.out.println("The largest element in the int array is located at:");
		for (int i = 0; i < largeloc.length; i++) {
			System.out.print(largeloc[i]);
			if (i != largeloc.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("The largest element in the double array is located at:");
		int [] dbllargeloc = locateLargest(dblarray);
		for (int i = 0; i < dbllargeloc.length; i++) {
			System.out.print(dbllargeloc[i]);
			if (i != dbllargeloc.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("The smallest element in the int array is located at:");
		int [] smallloc = locateSmallest(intarray);
		for (int i = 0; i < smallloc.length; i++) {
			System.out.print(smallloc[i]);
			if (i != smallloc.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("The smallest element in the double array is located at:");
		int [] dblsmallloc = locateSmallest(dblarray);
		for (int i = 0; i < dblsmallloc.length; i++) {
			System.out.print(dblsmallloc[i]);
			if (i != dblsmallloc.length-1) {
				System.out.print(", ");
			}
		}
	}
	// Define each overloaded method that will take the multidimensional array and go through all 
	// elements within each of the arrays stored within the array and return the location of the 
	// largest or smallest element.
	public static int [] locateLargest (double [][] array) {
		double largest = Integer.MIN_VALUE;
		int [] location = new int[2];
        for (int i = 0; i < array.length; i++) { 
            for (int j = 0; j < array[i].length; j++) {
            	if (array[i][j] > largest) {
            		largest = array[i][j];
            		location[0] = i;
            		location[1] = j;
            		}
            	}	
            }
        return location;
		
	}
	
	public static int [] locateLargest (int [][] array) {
		int largest = Integer.MIN_VALUE;
		int [] location = new int[2];
        for (int i = 0; i < array.length; i++) { 
            for (int j = 0; j < array[i].length; j++) {
            	if (array[i][j] > largest) {
            		largest = array[i][j];
            		location[0] = i;
            		location[1] = j;
            		}
            	}	
            }
        return location;
                
	}
	
	public static int [] locateSmallest (double [][] array) {
		double smallest = Integer.MAX_VALUE;
		int [] location = new int[2];
        for (int i = 0; i < array.length; i++) { 
            for (int j = 0; j < array[i].length; j++) {
            	if (array[i][j] < smallest) {
            		smallest = array[i][j];
            		location[0] = i;
            		location[1] = j;
            		}
            	}	
            }
        return location;
	}
	
	public static int [] locateSmallest (int [][] array) {
		int smallest = Integer.MAX_VALUE;
		int [] location = new int[2];
        for (int i = 0; i < array.length; i++) { 
            for (int j = 0; j < array[i].length; j++) {
            	if (array[i][j] < smallest) {
            		smallest = array[i][j];
            		location[0] = i;
            		location[1] = j;
            		}
            	}	
            }
        return location;
	}
}
