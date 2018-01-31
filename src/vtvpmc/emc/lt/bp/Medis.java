package vtvpmc.emc.lt.bp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Medis {

	Saka saka;
	
	public Medis() {
		saka = new Saka();
	}
	
	public int maxDepth(Saka saka) {
		/* Pa�i�r�jau, kad interneto binary tree traverse pavyzd�iuose apra�oma 
		 * galimyb� �aka==null, nes sukuriant sakos objekt� tuose pavyzd�iuose
		 * jos vaikin�s �akos a priori konstruktoriuje neinicijuojamos. O pas mane medis visada 
		 * turi galimyb� tur�ti �ak�, o �aka visada turi galimyb� tur�ti vaik�, 
		 * t.y. konstruktoriuose sukuriami tu�ti objektai.
		 */
		if(saka.getSakosSize()==0) {
			return 1;
		}
		else {
			List<Integer> gyliai = new ArrayList<Integer>();
			
			for (int i = 0; i < saka.getSakosSize(); i++) {
					int depthSaka = maxDepth(saka.sakos.get(i));
					gyliai.add(depthSaka+1);
			}
			return Collections.max(gyliai);
		}
	}
	
	
}
