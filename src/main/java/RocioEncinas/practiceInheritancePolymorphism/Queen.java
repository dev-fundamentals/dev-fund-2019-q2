package main.java.RocioEncinas.practiceInheritancePolymorphism;

/** Queen */
public class Queen extends GeometricFigure {
	/*public Queen(int color) {
		super(color);
	}*/

	Queen(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	public void whoAmI() {
		//super.whoAmI();
		System.out.println(label);
	}

	
	@Override
	public int getColor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean move(Position origin, Position destination) {
		// TODO Auto-generated method stub
		return false;
	}
} // Queen
