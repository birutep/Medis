package vtvpmc.emc.lt.bp;

public class Main {

	public static void main(String[] args) {
		
		Medis medis = new Medis();
		Saka saka1 = new Saka();
		Saka saka2 = new Saka();
		Saka saka3 = new Saka();
		medis.saka.sakos.add(saka1);
		medis.saka.sakos.add(saka2);
		medis.saka.sakos.add(saka3);
		
		Saka saka4 = new Saka();
		saka2.sakos.add(saka4);
		
		Saka saka5 = new Saka();
		Saka saka6 = new Saka();
		saka3.sakos.add(saka5);
		saka3.sakos.add(saka6);
		
		Saka saka7 = new Saka();
		saka6.sakos.add(saka7);
		
		Saka saka8 = new Saka();
		Saka saka9 = new Saka();
		saka7.sakos.add(saka8);
		saka7.sakos.add(saka9);
//		
		Saka saka10 = new Saka();
		saka8.sakos.add(saka10);
		
		Saka saka11 = new Saka();
		saka4.sakos.add(saka11);
		
		Saka saka12 = new Saka();
		saka11.sakos.add(saka12);
		
		Saka saka13 = new Saka();
		saka12.sakos.add(saka13);
		
		Saka saka14 = new Saka();
		saka13.sakos.add(saka14);
			
		System.out.println("Medşio aukğtis: " + medis.maxDepth(medis.saka));
	}
}
