package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSData {

	private GPSPoint[] gpspoints;
	protected int antall = 0;

	public GPSData(int n) {

		// TODO - START
		
		gpspoints = new GPSPoint [n];
		antall = 0;
		

	}

	public GPSPoint[] getGPSPoints() {
		
		return this.gpspoints;
	}
	
	protected boolean insertGPS(GPSPoint gpspoint) {

		boolean inserted = false;

		// TODO -  START
		
		if ( antall < gpspoints.length) {
			gpspoints [antall] = gpspoint;
			
			if (gpspoints[antall] != null) {
				antall++;
				inserted = true;
			}
		}
		
		    return inserted;
		

		
	}

	public boolean insert(String time, String latitude, String longitude, String elevation) {

		GPSPoint gpspoint;

		// TODO - START
		
		gpspoint = new GPSPoint (GPSDataConverter.toSeconds(time), Double.parseDouble(latitude), Double.parseDouble(longitude), Double.parseDouble(elevation));
		
		
	

		// TODO - SLUTT
		
		
		return insertGPS(gpspoint); 
		
	}

	public void print() {

		System.out.println("====== Konvertert GPS Data - START ======");

		// TODO - START
		
		for (int i= 0; i<gpspoints.length; i++) {
			System.out.println(gpspoints [i]);
			
			
		}

	
		// TODO - SLUTT
		
		System.out.println("====== Konvertert GPS Data - SLUTT ======");
		
		
	

	}
}
