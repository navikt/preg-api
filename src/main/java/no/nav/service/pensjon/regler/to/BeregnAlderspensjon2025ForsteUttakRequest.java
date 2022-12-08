package no.nav.service.pensjon.regler.to;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import no.nav.domain.pensjon.regler.beregning2011.AfpLivsvarig;
import no.nav.domain.pensjon.regler.grunnlag.DelingstallUtvalg;
import no.nav.domain.pensjon.regler.grunnlag.ForholdstallUtvalg;
import no.nav.domain.pensjon.regler.grunnlag.GarantitilleggsbeholdningGrunnlag;
import no.nav.domain.pensjon.regler.grunnlag.InfoPavirkendeYtelse;
import no.nav.domain.pensjon.regler.krav.Kravhode;
import no.nav.domain.pensjon.regler.vedtak.VilkarsVedtak;

public class BeregnAlderspensjon2025ForsteUttakRequest extends ServiceRequest {

	private Date virkFom;
	private Kravhode kravhode;
	private List<VilkarsVedtak> vilkarsvedtakListe;
	private InfoPavirkendeYtelse infoPavirkendeYtelse;
	private ForholdstallUtvalg forholdstallUtvalg;
	private DelingstallUtvalg delingstallUtvalg;
	private boolean epsMottarPensjon;
	private AfpLivsvarig afpLivsvarig;

	/**
	 * Grunnlag for beregning av garantitilleggsbeholdning.
	 * (Ref. BER3156)
	 */
	private GarantitilleggsbeholdningGrunnlag garantitilleggsbeholdningGrunnlag; 
	

}
