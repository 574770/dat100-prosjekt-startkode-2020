package no.hvl.dat100ptc.oppgave3;

import static java.lang.Math.*;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSUtils {

	public static double findMax(double[] da) {

		double max; 
		
		max = da[0];
		
		for (double d : da) {
			if (d > max) {
				max = d;
			}
		}
		
		return max;
	}

	public static double findMin(double[] da) {

		double min;

		// TODO - START
		
		min = da [0];
		
		for (double d : da) {
			if (d < min) {
				min = d;
			}
		}

		return min;

	}

	public static double[] getLatitudes(GPSPoint[] gpspoints) {

		// TODO - START
		
		double [] latitudes = new double [gpspoints.length];
		
		for (int i = 0; i < gpspoints.length; i++) {
			latitudes[i] = gpspoints [i].getLatitude();
		}
		
		// TODO - SLUTT
		
		return latitudes;
	}

	public static double[] getLongitudes(GPSPoint[] gpspoints) {

		// TODO - START

		double [] longitudes = new double [gpspoints.length];
		
		for (int i = 0; i < gpspoints.length; i++) {
			longitudes[i] = gpspoints [i].getLongitude();
		}
		
		// TODO - SLUTT
		
		return longitudes;

	}

	private static int R = 6371000; // jordens radius

	public static double distance(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		double d;
		double latitude1, longitude1, latitude2, longitude2;

		// TODO - START

		latitude1 = gpspoint1.getLatitude();
        latitude2 = gpspoint2.getLatitude();
        longitude1 = gpspoint1.getLongitude();
        longitude2 = gpspoint2.getLongitude();
        
        
        

		// TODO - SLUTT
        
        

	}

	public static double speed(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		double secs = gpspoint2.getTime() - gpspoint1.getTime();
		
		double timer = secs / 3600;
		
		
		
		// deler p� 1000 fordi returnerte distance er i meter
		
		double km = (distance(gpspoint1, gpspoint2))/1000;
		
		double speed = km /timer;
		
	    return speed;

	}

	public static String formatTime(int secs) {

		String timestr;
		String TIMESEP = ":";

		// TODO - START

		throw new UnsupportedOperationException(TODO.method());
		
		// TODO - SLUTT

	}
	private static int TEXTWIDTH = 10;

	public static String formatDouble(double d) {

		String str;

		// TODO - START

		throw new UnsupportedOperationException(TODO.method());

		// TODO - SLUTT
		
	}
}
