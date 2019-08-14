package example1;

public class AddArgs {
	
	public static void main(String args[])
	{
		int sum=0;
		for(String arg:args)
		{
			try {
				System.out.println(args[1]);
			sum+=Integer.parseInt(arg);
			
			
	    } 
			
			catch(NumberFormatException nfe) {
				System.err.println("Number format exception occured");
				System.err.println(nfe.getCause().toString());
				nfe.printStackTrace();
				//System.exit(0);
				
			
			}
			catch(ArrayIndexOutOfBoundsException ae){
				System.err.println("array index out of bound exception occured");
			}
            catch(Exception e) {
				System.err.println("exception occured");
			}
			finally {
				System.out.println("Finally block called");
			}
		
		System.out.print(sum);
		
		}
//only try and finally,no catch block		
    try { 
    	
    }
       
    finally {
    	
    }

}
}