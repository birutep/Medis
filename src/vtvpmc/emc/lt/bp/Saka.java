package vtvpmc.emc.lt.bp;

import java.util.ArrayList;
import java.util.List;

public class Saka {

	List<Saka> sakos;
	
	public Saka() {
		sakos = new ArrayList<Saka>();
	}
	
	int getSakosSize(){
		return sakos.size();
	}
}
