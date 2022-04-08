import java.io.*;
import java.util.*;

public class Main {
	
	private static FastReader in;
	
	public static void main(String[] args) {
		in = new FastReader();
		int tc = 1;
		tc = in.nextInt();
		for(int t = 0; t < tc; t++) {
			new Solver();
		}
	}
	
	static class Solver { 
		Solver() {
			int n = in.nextInt();
			int sum = 0;
			for(int i = 0; i < n; i++) {
				int x = in.nextInt();
				sum += x; // calculate the total sum of the sequence
			}
			// for every calculated total sum, find the numbers from 1 to let's say x
			// which would add up to a sum that is less than or equal to x
			int k = 0;
			while(k * (k + 1) <= 2 * sum) {
				k++;
			}
			// note: don't forget to subtract 1, because the in while-loop,
			// an extra iteration was produced before the condition went false
			System.out.println(k - 1);
		}
	}
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
