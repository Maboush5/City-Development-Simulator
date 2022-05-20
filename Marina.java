
public class Marina extends Building {

		
	// Marina constructor
	public Marina(String symbol, int width, int length) {
			
		super(symbol, width ,length); // super constructor
	}
	
	
	
	/* Boolean method to check if at least 
	 * one Marina cell touches the edge of the city
	 */
	public boolean isValidPlacement(Building[][] CityMap, int mX, int mY) { 
		
		// check for original building requirements by calling super method
		if (!super.isValidPlacement(CityMap, mX, mY)) {  
				
			return false;
				
				} // end if
		
		// check to see if marina touches the edge of the city
		if (mX == 0 || mY == 0 || mY + this.getLength() == CityMap.length || ( mX + this.getWidth() == CityMap[0].length)){
							
			return true;
								
				} // end if
					
		return false;	
				
	} // end isValidPlacement method
	
					
	
} // END MARINA CLASS
