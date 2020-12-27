

class sequencePattern{



	static boolean find(String s1,String s2,int l1,int l2){



			int ar[][] = new int[l1+1][l2+1];

			

		for(int i=1;i<=l1;i++){
			for(int j=1;j<=l2;j++){

					if(i==0 || j==0)
						ar[i][j] = 0;
				

				if(s1.charAt(i-1)==s2.charAt(j-1)){
					
					ar[i][j] = 1+ar[i-1][j-1];

				}

				else ar[i][j] = Math.max(ar[i-1][j],ar[i][j-1]);
			}
		}

		return ar[l1][l2]==l1;
	}

	public static void main(String[] args) {
		
		String s1 = "hello";

		String s2 = "heddollogo";

		System.out.println(find(s1,s2,s1.length(),s2.length()));
	}
}