package main.java.RocioEncinas.practiceInheritancePolymorphism;

/** Queen */
public class Queen extends Figure {
	public Queen(int color) {
		super(color);
	}

	public void whoAmI() {
		super.whoAmI();
		System.out.println("Queen");
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
