
public class Collision {
	public static int zaehler=0;
	//Leon
	public static void collision() {
		zaehler();
	//	System.out.println(Konst.BirdY + Konst.y1);
		if(zaehler ==1) {
		if (Konst.BirdY < Konst.y1+500 && Konst.x1<450 && Konst.x1>350){
			Konst.run=false;
			}
		if(Konst.BirdY > Konst.y2-50 && Konst.x1<450 && Konst.x1>350) {
			Konst.run=false;
		}
		}
		if(zaehler ==2) {
			if (Konst.BirdY < Konst.y3+500 && Konst.x2<450 && Konst.x2>350){
				
				Konst.run=false;
				}
			else if(Konst.BirdY > Konst.y4-50 && Konst.x2<450 && Konst.x2>350) {
				Konst.run=false;
			}
			}
		if(zaehler ==3) {
			if (Konst.BirdY < Konst.y5+500 && Konst.x3<450 && Konst.x3>350){
				
				Konst.run=false;
				}
			else if(Konst.BirdY > Konst.y6-50 && Konst.x3<450 && Konst.x3>350) {
				Konst.run=false;
				}
			}
	}
	public static void zaehler(){
		if(Konst.x1>350 && Konst.x1<500) {
			//System.out.println("zdxdddddddddddd1");
			zaehler=1;
		}
		if(Konst.x2>350 && Konst.x2<500) {
			//System.out.println("zdxdddddddddddd1");
			zaehler=2;
		}
		if(Konst.x3>350 && Konst.x3<500) {
			//System.out.println("zdxdddddddddddd1");
			zaehler=2;
		}
	}
}
