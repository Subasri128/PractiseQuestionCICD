package InterviewQuestions;

public class duplicateStringinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "Path to woodland";
		int count;
		//Converts String to char array
		char[] B = A.toCharArray();
		
		//count each character present in string
		for(int i=0;i<B.length;i++) {
			count =1;
			for(int j=i+1;j<B.length;j++) {
				if(B[i]==B[j] && B[i]!= ' ') {
					count++;
					//set B[j] to 0 to avoid printing visiting character
					B[j] = '0';
					
				}
			}
			//A character is considered as duplicate if count is greater than 1
			if(count > 1 && B[i] != '0') {
				System.out.println(B[i]);
			}
		}

	}

}
