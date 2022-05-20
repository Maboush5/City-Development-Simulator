public class Building {

	
	private String symbol; // symbol to represent building on grid
	private int width;		// width of building
	private int length;		// length of building
	
	
		// Constructor
	
		public Building(String symbol, int width, int length) {
		
			this.symbol = symbol;
			this.width = width;
			this.length = length;
		
		} // end constructor
	
	
		
		public int getWidth() { // returns width of building
			
			return width;
		}


		public int getLength() {   // returns length of building
			
			return length;
		}
	
		public boolean isValidPlacement(Building [][] cityMap, int x, int y) {
					
			if (x + width > cityMap[0].length || x < 0) { // If width of building is greater than city width return false		
				
				return false;
				
				}
			
			
			if (y + length > cityMap.length || y < 0) {  // if length of building is greater than city length return false		
				
				return false;
				}
				
			// check if other building overlaps this position
			
			for (int j = y; j < y + length; j++) { // loop through the rows of the grid (city map)
			
				for(int i = x; i < x + width; i++) {   // loop through the columns of the grid (city map)
				
				
							
					if( cityMap[j][i]  != null) { // if the cell is not null (meaning there is a building in position), return false
						
						return false;
						
						} //end if
									
					
					} // end for			
				
				} // end for
		
			
		return true;
			
						
		} // end isValidPath method
		
		
		@Override		
		public String toString() {
			
			return symbol;		//return symbol representing building
		}
	
	
			

} // END BUILDING CLASS


