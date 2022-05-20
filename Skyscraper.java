
public class Skyscraper extends Building {

	private int height; // additional instance variable for skyscrapers height
	
	public Skyscraper(String symbol, int width, int length, int height) {
		
		super(symbol, width, length); // super constructor 
		
		this.height = height;
				
	}
	
	/*
	 *   Checks to see if height of building is less than 10 
	 * 	 and greater than building base area
	 */
	public boolean isValidPlacement(Building[][] cityMap, int x, int y) {
		
		if (!super.isValidPlacement(cityMap, x, y)) {  	// super method to check original building requirements
			
			return false;
								
			} // end if
		
		if ((height < 10) && height >= (super.getLength()*super.getWidth())) {  // new skyscraper requirements
						
			return true;	
		
			} // end if
			
		return false;	
		
				
		} // end isValidPlacement method
	
	
	/*
	 * @Override
	 * @return string representation of height
	 */
	public String toString() {					
		String str  = String.valueOf(height); 
		
		return str; // return height as string
	
	
	} // end toString method
	

} // END CLASS
