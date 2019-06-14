package main.java.RocioEncinas.practiceInheritancePolymorphism;

/** Castle */
public class Castle extends GeometricFigure {
	/*public Castle(int color) {
    	super(color);
  	}*/

	Castle(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	public void whoAmI() {
		//super.whoAmI();
		System.out.println(label);
	}

	/**
	 * Castle movement We are supposing an empty board
	 */
	public boolean move(Position origin, Position destination) {
		return
    // Valid movement
    ((origin.getRow() == destination.getRow()) || (origin.getColumn() == destination
        .getColumn())) &&
    // origin = destination
        ((origin.getRow() != destination.getRow()) || (origin.getColumn() != destination
            .getColumn())) &&
        // Inside the bounds
        ((origin.getRow() >= 1 && origin.getRow() <= 8)
            && (origin.getColumn() >= 1 && origin.getColumn() <= 8)
            && (destination.getRow() >= 1 && destination.getRow() <= 8) && (destination
            .getColumn() >= 1 && destination.getColumn() <= 8));
	}

	@Override
	public int getColor() {
		// TODO Auto-generated method stub
		return 0;
	}
} // Castle
