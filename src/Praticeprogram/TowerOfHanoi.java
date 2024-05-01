package Praticeprogram;



public class TowerOfHanoi {
	static void towerOfHanoi(int n,String s,String d,String h) {
		if(n<=0) {
			return;
		}
		else {
			towerOfHanoi(n-1,s,h,d);
			System.out.println("Disk "+n+" moved from "+s+ " to "+ d);
			towerOfHanoi(n-1, h, d, s);
		}
	}
public static void main(String[] args) {
	TowerOfHanoi t=new TowerOfHanoi();
	t.towerOfHanoi(2, "source", "helper", "destination");
}
}
