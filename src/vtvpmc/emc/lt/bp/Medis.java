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
		/* Paþiûrëjau, kad interneto binary tree traverse pavyzdþiuose apraðoma 
		 * galimybë ðaka==null, nes sukuriant sakos objektà tuose pavyzdþiuose
		 * jos vaikinës ðakos a priori konstruktoriuje neinicijuojamos. O pas mane medis visada 
		 * turi galimybæ turëti ðakø, o ðaka visada turi galimybæ turëti vaikø, 
		 * t.y. konstruktoriuose sukuriami tuðti objektai.
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
