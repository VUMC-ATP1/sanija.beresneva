package homework.classHomework;

public class Trissturis {
	public Trissturis(){
		System.out.println("Mes veidosim trissturi");
	}
	
	public Trissturis (int mala1, int mala2, int mala3) {
		this.mala1 = mala1;
		this.mala2 = mala2;
		this.mala3 = mala3;
		malas = (this.mala1 + this.mala2 + this.mala3) / 2;
        laukums = Math.sqrt(malas * (malas - this.mala1) * (malas - this.mala2) * (malas - this.mala3));
        System.out.format("\nTrisstura laukums = %.2f\n", laukums);
	}
	
   int mala1;
   int mala2;
   int mala3;
   double laukums = 0;
   double malas;
   
   public boolean irVienadsanu() {
	   if ((this.mala1==this.mala2) || (this.mala1==this.mala3) || (this.mala2==this.mala3))   
		   return true;
	   else return false;
   }

   public boolean irVienadmalu() {
	   if (this.mala1==this.mala2 && this.mala1==this.mala3)   
		   return true;
	   else return false;
   }
   
}
