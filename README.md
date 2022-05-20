# City-Development-Simulator
A new city is being developed on an island and you are hired to help with the city planning! Your computer science skills are needed to develop a program to represent the potential layout of the new city and determine which buildings can be constructed and which locations are valid for those buildings. Use a 2D array to represent the city layout and insert the various Building objects into the corresponding cells of the array where the building is being added, but only if the proposed location is a valid place for it!
The standard rule for placing buildings is that they cannot stretch out of the bounds of the city
and that a building can not overlap with any other building. There are 2 sub-types of buildings,
Marina and Skyscraper, which each have their own placement rules in addition to the standard
building rule. Marinas must be touching the water's edge so you will have to check that at least
one cell of a Marina is along an edge of the city. Skyscrapers have an additional property
(instance variable) for their height. The height of a Skyscraper must be less than 10 units and it
must be greater than or equal to the base area (width * length). For example, a skyscraper
whose base is 2 by 3 can have a height of 6, 7, 8, or 9. Both Marina and Skyscraper must be
child classes of the Building class using inheritance.
