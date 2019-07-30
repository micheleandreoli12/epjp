package b07;

public class S75 {
    public void f() {
        try {
        	int[] array= new int[0];
        	first(array);
            g();
        } catch (Exception ex) {
        	if(ex instanceof PaperinoException) {
        		System.out.println("Paperino exception");
        	} else {
            System.out.println("Exception caught");
        	}
        } finally {
            cleanup();
        }
    }
    
    int first(int[] values) throws PaperinoException{
    	if(values == null|| values.length ==0) {
//    		throw new IllegalArgumentException("values should be neither null nor zero");
    		throw new PaperinoException("values should be neither null nor empty");
    	}
    	return values[0];
    }
    
   

    public void g() throws Exception {
        // ...
        if (somethingUnexpected()) {
            throw new Exception();
        }
    }

    private void cleanup() {
        System.out.println("performing cleanup");
    }

    private boolean somethingUnexpected() {
        return true;
    }

    public static void main(String[] args) {
        S75 exceptional = new S75();
        exceptional.f();
    }
}

class PaperinoException extends Exception {
	   private static final long serialVersionUID =1L;
	   
	   public PaperinoException(String message) {
 	super(message);
	   }
 }
