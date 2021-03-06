package no.nav.domain.pensjon.regler.beregning.penobjekter;

import no.nav.domain.pensjon.regler.beregning.Ytelseskomponent;
import no.nav.domain.pensjon.regler.kode.YtelsekomponentTypeCti;

/**
 * Created by N123422 on 07.11.2014.
 */
public class Garantitillegg_Art_27_UT extends Ytelseskomponent {

    private static final long serialVersionUID = -984402904905629227L;

    public Garantitillegg_Art_27_UT() {
        super();
        ytelsekomponentType = new YtelsekomponentTypeCti("UT_GT_NORDISK");
    }

    public Garantitillegg_Art_27_UT(Garantitillegg_Art_27_UT garantitillegg_art_27_ut) {
        super(garantitillegg_art_27_ut);
    }
}
