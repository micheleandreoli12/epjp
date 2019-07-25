package ex;

public class S53 {
    /**
     * Average speed
     * 
     * @param distance in meters
     * @param time     in seconds
     * @return speed in meters per second
     */
    public static double speed(double distance, double time) {
        // TODO
    		return distance/time;
    }

    /**
     * Distance between (x0, y0) and (x1, y1)
     * 
     * @param x0 first point x
     * @param y0 first point y
     * @param x1 second point x
     * @param y1 second point y
     * @return distance
     */
    public static double distance(int x0, int y0, int x1, int y1) {
        return Math.sqrt(Math.pow(x1-x0,2)+Math.pow(y1-y0,2));
    }

    /**
     * Engine capacity
     * 
     * @param bore mm
     * @param stroke mm
     * @param nr     number of cylinders
     * @return the engine capacity cm^3
     */
    public static double engineCapacity(double bore, double stroke, int nr) {
        // TODO
        return Math.PI*Math.pow(bore/2, 2)*Math.abs(stroke)*Math.abs(nr);
    }

    // somma delle cifre in un numero
    /**
     * Add up all the digits in an integer
     * 
     * @param value
     * @return sum of digits
     */
    public static int digitSum(int value) {
        // TODO
    	
    	int v=value;
    	int k=0;
    	int sum=0;
    	while(v>1) {
    		v=v/10;
    		k=k+1;
    		if(k==10000000) {
    			break;
    		}
    	}
    	int v1=value;
    	for(int i=0; i<=k; i++) {
    		sum=sum+v1%10;
    		v1=v1/10;
    		
    	}
        return sum;
    }
}
