package no.nav.service.pensjon.regler.to;

import java.util.Vector;

import no.nav.domain.pensjon.regler.Pakkseddel;
import no.nav.domain.pensjon.regler.beregning2011.Regelendring;

/**
 * Responseobjekt for BEF2001 Identifiser regelendringer.
 * 
 * @author and2812
 *
 */
public class IdentifiserRegelendringerResponse extends ServiceResponse {

	/**
	 * Generated serial version UID.
	 */
	private static final long serialVersionUID = -8134915768917369169L;
	
	/**
	 * Listen av regel- og satsendringer som tjenesten fant for tidsrommet og input den ble kalt med.
	 * Listen er ikke sortert p� dato, men hver dato i listen er unik. 
	 */
	private Vector<Regelendring> regelendringListe = new Vector<Regelendring>();
	/**
	 * Pakkseddel som indikerer om det oppstod feil ved tjenestekallet.
	 */
	private Pakkseddel pakkseddel;
	
	
	/**
	 * Default constructor.
	 *
	 */
	public IdentifiserRegelendringerResponse(){
		super();
	}
	
	/**
	 * Copy-constructor
	 * 
	 * @param identifiserRegelendringerResponse
	 */
	public IdentifiserRegelendringerResponse(IdentifiserRegelendringerResponse identifiserRegelendringerResponse){
		super();
		if (identifiserRegelendringerResponse.getRegelendringListe() != null) {
			for (Regelendring regelendring : identifiserRegelendringerResponse.getRegelendringListe()) {
				this.regelendringListe.add(new Regelendring(regelendring));
			}
		}
		if (identifiserRegelendringerResponse.getPakkseddel() != null) {
			this.pakkseddel = new Pakkseddel(pakkseddel);
		}
	}
	
	/**
	 * Constructor
	 * 
	 * @param regelendringListe
	 * @param pakkseddel
	 */
	public IdentifiserRegelendringerResponse(Vector<Regelendring> regelendringListe, Pakkseddel pakkseddel) {
		super();
		this.regelendringListe = regelendringListe;
		this.pakkseddel = pakkseddel;
	}

	public Pakkseddel getPakkseddel() {
		return pakkseddel;
	}

	public void setPakkseddel(Pakkseddel pakkseddel) {
		this.pakkseddel = pakkseddel;
	}

	public Vector<Regelendring> getRegelendringListe() {
		return regelendringListe;
	}

	/**
	 * Read only property for regelendringListe as array
	 * @return array of Regelendring
	 */
	public Regelendring[] getRegelendringListeAsArray() {
		return (regelendringListe != null ? this.regelendringListe.toArray(new Regelendring[this.regelendringListe.size()]) : new Regelendring[0]);
	}
	
	public void setRegelendringListe(Vector<Regelendring> regelendringListe) {
		this.regelendringListe = regelendringListe;
	}
	
	
}
