import java.util.concurrent.ThreadLocalRandom;

public class Reset {
	public static void reset() {
		Konst.BirdY = Konst.WIDTH/2;
		 Konst.run = true;
		 Konst.a = 0.35;
		 Konst.v = 0;
		 Konst.press = false;
		
		 Konst.pAb = 750; //Der Abstand der Pipes
		 Konst.x1 = 700;
		 Konst.x2 = 1000;
		 Konst.x3 = 1300;
		 Konst.rnd1 = -450;
		 Konst.rnd2 =-50;
		 Konst.rnd3 = 600;
		 Konst.rnd4 = 700;
		 Konst.y1 = ThreadLocalRandom.current().nextInt(Konst.rnd1, Konst.rnd2);
		 Konst.y2 = Konst.y1+Konst.pAb;
		 Konst.y3 = ThreadLocalRandom.current().nextInt(Konst.rnd1, Konst.rnd2);
		 Konst.y4 = Konst.y3+Konst.pAb;
		 Konst.y5 = ThreadLocalRandom.current().nextInt(Konst.rnd1, Konst.rnd2);
		 Konst.y6 = Konst.y5+Konst.pAb;
		
		//Score
		 Konst.score = 0;
	}
}
