package menjacnica;

import java.util.GregorianCalendar;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{



	public void dodajKurs(Kurs kurs, Valuta valuta) {
		int brojac = valuta.getKursevi().size();
				boolean postoji=false;
		for (int i = 0; i < brojac; i++) {
			if(valuta.getKursevi().get(i).getDatum().equals(kurs.getDatum()))
				postoji=true;
		}
		if(postoji==true)
			System.out.println("Ovaj datum vec postoji ");
		else
			valuta.getKursevi().add(kurs);
	}

	
	public void izbrisiKurs(GregorianCalendar datum, Valuta valuta) {
		boolean postoji=false;
		for (int i = 0; i < valuta.getKursevi().size(); i++) {
			if(valuta.getKursevi().get(i).getDatum().equals(datum)){
				postoji=true;
				valuta.getKursevi().remove(valuta.getKursevi().get(i));
			}
		}
		if(!postoji)
			System.out.println("Kurs za ovaj datum ne postoji! ");
		
	}

	public Kurs vratiKurs(GregorianCalendar datum, Valuta valuta) {
		for (int i = 0; i < valuta.getKursevi().size(); i++) {
			if(valuta.getKursevi().get(i).getDatum().equals(datum))
				return valuta.getKursevi().get(i);
		}
		System.out.println("Kurs za ovaj datum ne postoji! ");
		return null;
	}

}
