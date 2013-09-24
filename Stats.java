import java.util.Arrays;

public class stats {
	
	public static void main(String[] args) {
		int[] mainArray;
		mainArray = new int[10];
		for (int i =0; i<10; i++) {
			mainArray[i] = (int)(Math.random()* 10);
			System.out.println(Arrays.toString(mainArray));
		};

		System.out.println(quartile3(mainArray));

	}

	public static int max(int[] a) {
		int x=0;
		for (int i = 0; i<a.length; i++) {
			if (a[i] > x) {
				x=a[i];
				// System.out.print("Max of array: " + x);
			}
		}
		System.out.println();
		return x;
	}

	public static int min(int[] a) {
		int x=0;
		for (int i = 0; i<a.length; i++) {
			if (a[i] < x) {
				x=a[i];
				// System.out.print("Min of array: " + x);
			}
		}
		System.out.println();
		return x;
	}

	public static double mean(int[] a) {
		double x=0;
		for (int i = 0; i<a.length; i++) {
			x+=a[i];
		}
		x/=a.length;
		System.out.println();
		return x;
	}

	public static double median(int[] a) {
		Arrays.sort(a);
		double x=0;
		for (int i = 0; i<a.length; i++) {
			x=a[i];
			if (a.length%2==0) {
				x=a.length/2;
				// System.out.print("Median of array: " + (a.length/2));
			} else {
				x=(x/2);
				// System.out.print("Median of array: " + x);
			}
			System.out.println();
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
		System.out.println();
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
		System.out.println();
		return x;
	}


	public static int mode(int[] a) {
		int x=0, y=0, z=0;
		for (int i = 0; i < a.length; i++) {
			x=0;
			for (int c = 0; c < a.length; c++) {
				if (a[c]==a[i]) {
					x++;
				}
			}
			if (x>z) {
				z=x;
				y=a[i];
			}
		}
		System.out.println(x);
		System.out.println();
		return x;
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
		System.out.println("Standard Deviation of array: " + x);
		return x;
	}

}
