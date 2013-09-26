import java.util.Arrays;

public class Stats {
	
	public static void main(String[] args) {
		int[] mainArray;
		mainArray = new int[10];
		for (int i =0; i<10; i++) {
			mainArray[i] = (int)(Math.random()* 10);
			System.out.println(Arrays.toString(mainArray));
		};
		System.out.println(median(mainArray));

	}

	public static int max(int[] a) {
		int x=0;
		for (int i = 0; i<a.length; i++) {
			if (a[i] > x) {
				x=a[i];
				// System.out.print("Max of array: " + x);
			}
		}
		// System.out.println();
		return x;
	}

	public static int min(int[] a) {
		int x = a[0];
		for (int i = 0; i<a.length; i++) {
			if (a[i] < x) {
				x=a[i];
				// System.out.print("Min of array: " + x);
			}
		}
		// System.out.println();
		return x;
	}

	public static double mean(int[] a) {
		double x=0;
		for (int i = 0; i<a.length; i++) {
			x+=a[i];
		}
		x/=a.length;
		// System.out.println();
		return x;
	}

	public static double median(int[] a) {
		Arrays.sort(a);
		double x = 0;
		for (int i = 0; i<a.length; i++) {
			x=a[i];
			if (a.length%2==0) {
				double term1=(a[a.length/2 - 1]);
				double term2=(a[a.length/2 + 1]);
				x = (term2 + term1) / 2;
				// System.out.print("Median of array: " + (a.length/2));
			} else {
				x = a[a.length/2];
				// System.out.print("Median of array: " + x);
			}
			// System.out.println();
		}
		return x;
	}

	public static double quartile1(int[] a) {
		Arrays.sort(a);
		double x=0;
		for (int i = 0; i<a.length; i++) {
			if (a.length%3==0) {
				x=a[a.length/3-1];
			} else {
				x = (a[a.length/4] + a[a.length/4 + 1]);
				x = x / 2;
			}
		}
		// System.out.println();
		return x;
	}

	public static double quartile3(int[] a) {
		Arrays.sort(a);
		double x = 0;
		for (int i = 0; i<a.length; i++) {
			if (a.length%3==0) {
				x = a[a.length*2/3];
			} else {
				x =(a[a.length*2/3] + a[a.length*2/3 + 1]);
				x = x / 2;
			}
		}
		// System.out.println();
		return x;
	}


	public static int mode(int a[]) { //fix
	    int maxValue=0, maxCount=0;

	    for (int i = 0; i < a.length; i++) {
	        int count = 0;
	        for (int j = 0; j < a.length; j++) {
	            if (a[j] == a[i]) {
	            	count++;
	            }
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            maxValue = a[i];
	        }
	    }

	    return maxValue;
	}

	public static double standDev(int[] a) {
		double x = 0;
		double arrayMean = mean(a);
		for (int i = 0; i<a.length; i++) {
			x = a[i]-arrayMean;
			x = x * x;
			x += a[i];
			x /= a.length;
			x = Math.sqrt(x);
		}
		// System.out.println("Standard Deviation of array: " + x);
		return x;
	}

}
