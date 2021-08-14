package Misc;

public class whileloop {

	 public static void main(String args[]){
	      int num =0;
	      while(num<=6)
	      {
	    	  num++;
	          if (num==5)
	          {
	             break;
	          }
	          System.out.println("Value of variable is: "+num);
	      }
	      System.out.println("Out of while-loop");
	  }
	}