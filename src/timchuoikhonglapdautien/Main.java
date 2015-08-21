package timchuoikhonglapdautien;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String:");
		String line = input.nextLine();
		String since= "";
		since +=line.charAt(0);
		String since1="";
		for(int count = 0; count <line.length()-1; count++){
			
			if(line.charAt(count+1)!=line.charAt(count)){
				since+=line.charAt(count+1);
				System.out.println(since);
				if(count==line.length()-2&&since.length()>=2){
					System.out.println("The String not same key in the first of String is:"+since);
				}
				
			}else {
				if(since.length()>since1.length()){
					since1=since;
					since ="";
					if(since1.length()>=2){
						since1 = since1.substring(0,since1.length()-1);
						System.out.println("The String not same key in the first of String is:"+since1);
						break;
					}
				}else{
					since="";
				}
			}
		}	
	}
}
