package no.nav.service.pensjon.regler.to;

import java.util.Vector;

import no.nav.domain.pensjon.regler.afpoppgjor.AFPEtteroppgjorgrunnlag;

public class KategoriserAfpEtteroppgjorRequest  extends ServiceRequest {

	private static final long serialVersionUID = 9103601403764176093L;
	
	private Vector<AFPEtteroppgjorgrunnlag> afpEtteroppgjorgrunnlagListe = new Vector<AFPEtteroppgjorgrunnlag>();

	public KategoriserAfpEtteroppgjorRequest(Vector<AFPEtteroppgjorgrunnlag> afpEtteroppgjorgrunnlagListe) {
		super();
		this.afpEtteroppgjorgrunnlagListe = afpEtteroppgjorgrunnlagListe;
	}
	public KategoriserAfpEtteroppgjorRequest() {
		super();
	}
	public Vector<AFPEtteroppgjorgrunnlag> getAfpEtteroppgjorgrunnlagListe() {
		return afpEtteroppgjorgrunnlagListe;
	}

	public AFPEtteroppgjorgrunnlag[] getAfpEtteroppgjorgrunnlagListeAsArray() {
		return (afpEtteroppgjorgrunnlagListe != null ? this.afpEtteroppgjorgrunnlagListe.toArray(new AFPEtteroppgjorgrunnlag[this.afpEtteroppgjorgrunnlagListe.size()]) : new AFPEtteroppgjorgrunnlag[0]);
	}
	
	public void setAfpEtteroppgjorgrunnlagListe(
			Vector<AFPEtteroppgjorgrunnlag> afpEtteroppgjorgrunnlagListe) {
		this.afpEtteroppgjorgrunnlagListe = afpEtteroppgjorgrunnlagListe;
	}

}
