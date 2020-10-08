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
        
        double deltaLat = toRadians(latitude2) - toRadians(latitude1);
        double deltaLong = toRadians(longitude2) - toRadians(longitude1);
        double a = Math.pow((Math.sin(deltaLat/2.0)),2) + cos(toRadians (latitude1)) * Math.cos(toRadians(latitude2)) * Math.pow((Math.sin(deltaLong/2.0)),2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        
        d = R * c;
        
        
        

		// TODO - SLUTT
        
        return d;
        

	}

	public static double speed(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		double secs = gpspoint2.getTime() - gpspoint1.getTime();
		
		double timer = secs / 3600;
		
		
		
		// deler på 1000 fordi returnerte distance er i meter
		
		double km = (distance(gpspoint1, gpspoint2))/1000;
		
		double speed = km /timer;
		
	    return speed;

	}

	public static String formatTime(int secs) {

		String timestr;
		

		// TODO - START

		int sec = secs % 60;
		int min = secs / 60;
		int hr = min / 60;
		min = min % 60;
		
	    timestr = String.format("  %02d:%02d:%02d" , hr , min , sec);
	    
	    return timestr;
		
		
		
		
		// TODO - SLUTT

	}
	private static int TEXTWIDTH = 10;

	public static String formatDouble(double d) {

		String str;

		// TODO - START
		
		TEXTWIDTH = 10;

		str = String.format ( "%,10.2f", d);

		// TODO - SLUTT
		
		 return str;
		
	}
}
