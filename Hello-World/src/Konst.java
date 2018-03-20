import java.util.concurrent.ThreadLocalRandom;

public class Konst {
	//peter
	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;
	public static final String TITLE = "flappy";
	public static final int BirdX = Konst.HEIGHT/2; 
	public static int BirdY = Konst.WIDTH/2;
	public static boolean run = true;
	//physiks
	public static double a = 0.35;
	public static double v = 0;
	public static boolean press = false;
	
	//Leon
	public static String bird = "/bg.png";
	public static String pipeO = "/tube1.png";
	public static String pipeU = "/tube2.png";
	//peter
	public static String BirdUp ="/Frame-1.png";
	public static String BirdDown ="/frame-4.png";
	//leon

	//Bird
	public static int pAb = 750; //Der Abstand der Pipes
	public static int x1 = 700;
	public static int x2 = 1000;
	public static int x3 = 1300;
	public static int rnd1 = -450;
	public static int rnd2 =-50;
	public static int rnd3 = 600;
	public static int rnd4 = 700;
	public static int y1 = ThreadLocalRandom.current().nextInt(rnd1, rnd2);
	public static int y2 = y1+pAb;
	public static int y3 = ThreadLocalRandom.current().nextInt(rnd1, rnd2);
	public static int y4 = y3+pAb;
	public static int y5 = ThreadLocalRandom.current().nextInt(rnd1, rnd2);
	public static int y6 = y5+pAb;
	
	//Score
	public static int score = 0;

}
