

	import java.io.*;
	class M{
	 void method() throws Exception{
	  throw new IOException("device error");
	 }
	}

	public class dummy {
	   public static void main(String args[]) {
	    
	          M m=new M();
	          try {
				m.method();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("in main method");
			}



	    System.out.println("normal flow...");
	  }
	}



