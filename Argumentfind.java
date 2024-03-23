public class Argumentfind{
	 public static void main(String[] args) {	

	 int length = args.length;
	 	
	 	for(int i=0;i<args.length;i++){

	 		if(args[i].charAt(0)<65 || args[i].charAt(0)>90) 
	 			System.out.println("error : string at index -> " + i + " (" + args[i] + ") " + "does not upercase");
			else {
				System.out.println("correct argument at index -> " + i);
			}

		}
		
	}
}