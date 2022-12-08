package no.nav.service.pensjon.regler.to;

import java.util.Date;

import no.nav.domain.pensjon.regler.beregning2011.AfpLivsvarig;
import no.nav.domain.pensjon.regler.beregning2011.SisteAldersberegning2011;
import no.nav.domain.pensjon.regler.grunnlag.DelingstallUtvalg;
import no.nav.domain.pensjon.regler.grunnlag.ForholdstallUtvalg;
import no.nav.domain.pensjon.regler.krav.Kravhode;

public class VilkarsprovAlderpensjonOvergangskullRequest extends ServiceRequest {
	private Kravhode kravhode;
	private Date virkFom;
	private ForholdstallUtvalg forholdstallUtvalg;
	private DelingstallUtvalg delingstallUtvalg;
	private AfpLivsvarig afpLivsvarig;
	private Date afpVirkFom;
	private SisteAldersberegning2011 sisteBeregning;
	private boolean utforVilkarsberegning;


}
