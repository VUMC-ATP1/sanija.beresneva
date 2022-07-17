package homework.classHomework;

public class Main {
	public static void main(String[] args) {
		Trissturis trissturis = new Trissturis();
		trissturis.mala1 = 5;
		trissturis.mala2 = 4;
		trissturis.mala3 = 5;
		
		System.out.println("Trissturis ir vienadsanu: " + trissturis.irVienadsanu());
		System.out.println("Trissturis ir vienadmalu: " + trissturis.irVienadmalu());
		
		Trissturis trissturis2 = new Trissturis(3, 4, 3);
		System.out.println("Trissturis ir vienadsanu: " + trissturis2.irVienadsanu());
		System.out.println("Trissturis ir vienadmalu: " + trissturis2.irVienadmalu());
	}
}
