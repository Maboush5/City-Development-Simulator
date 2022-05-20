public class City {

	
	private int width; 				// width of city grid
	private int length;				//length of city grid
	private Building [][] layout;	//2D array to build city grid
	
	
	
	public City(int x, int y) { // take in x and y parameters representing length and width of city grid
		
		length = y;
		width = x;
		layout = new Building[length][width]; 
		
	} // end constructor
	
		
	
	public boolean addStructure(int x, int y, Building buildingToAdd) {
			
		
		if (buildingToAdd.isValidPlacement(layout, x, y)) {  // check to see if it meets building requirements
			
		for (int j = y ; j < y + buildingToAdd.getLength(); j++) {  //loop through rows(length of building)
				
			for (int i = x; i < x + buildingToAdd.getWidth(); i++) {   // loop through columns (width of building)
							
					layout[j][i] = buildingToAdd; // point cells to building object
					
				} // end for 
				
			} // end for
			
			return true;
			
		} // end if
		
		else {
			
			return false;
			
		}
		
		
	} // end addStructure method
	
	

	/*
	 * return a string representation of the City grid
	 * 
	 */	
	
	public String toString() {
    	
		String str = "";
		
		for(int j = 0; j < length ; j++) { // loop through the city rows
			
			for(int i = 0; i < width ; i++) { // loop through the city columns
                                         	
            	if (this.layout[j][i] == null){ // if there is no building object, print "."            	
            		
            		str += ".  ";
            		               		
            	} // end if
            	
            	// if there is a building object, print symbol
            	
            	else {
            		
            		String symbol = this.layout[j][i].toString() + "  " ;  // if there is a building object, print buildings symbol
            		str += symbol;
            	}		
            }
					
			if ( j < length-1) {
    		
    		str += "\n";
		
			} // end if
		
		
			} // end For
            
        
		
		return str; 
		
    } // end toString method
    
} // END CITY CLASS   	

	
