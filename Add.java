import java.io.*;

public class Add {

	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the target");
		int target = Integer.parseInt(input.readLine());
		int[] array = new int[]{5,6,7,90,14,67};
		int sum=0;
		int flag=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				sum = array[i]+array[j];
				if(target==sum) {
					flag=flag+1;
					System.out.println("indices are: "+i+","+j);
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println("Indices not found");
		}

	}

}
