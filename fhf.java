package practice;

public class fhf {
	 public static void main(String[] args) {
	        String s="";
	        String str="abc123xyz";
	    int sum=0;
	  for(int i=0;i<str.length();i++){
	   
	    while(Character.isDigit(str.charAt(i))){
	     s=s+str.charAt(i);
	     i++;
	    }
	    int a=Integer.parseInt(s);
	    sum=sum+a;
	    s=null;
	  }
	System.out.println(sum);
	}


}
