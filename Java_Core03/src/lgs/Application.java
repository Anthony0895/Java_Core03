package lgs;

public class Application {

	public static void main(String[] args) {
		
		System.out.println ("Rectangle");

		Rectangle a1 = new Rectangle ();
		Rectangle a2 = new Rectangle (3, 1);
		
		System.out.println ("Прямокутник 1 = " + a1);
		System.out.println ("Прямокутник 2 = " + a2);

		System.out.println ();
		
		System.out.println ("Площа прямокутника 1 = " + a1.area (a1.getLength(),a1.getWidth()));
		System.out.println ("Площа прямокутника 2 = " + a2.area (a2.getLength(),a2.getWidth()));
		
		System.out.println ();

		System.out.println ("Периметр прямокутника 1 = " + a1.perimeter (a1.getLength(),a1.getWidth()));
		System.out.println ("Периметр прямокутника 2 = " + a2.perimeter (a2.getLength(), a2.getWidth()));

		System.out.println ();
		
		System.out.println ("Circle");

		Circle a = new Circle (3,6);

		System.out.println ( a );
		
		System.out.println ("Площа кола = " + a.area(a.getDiameter()));
		System.out.println ("Довжина кола = " + a.length((a.getRadius())));

	}
}
