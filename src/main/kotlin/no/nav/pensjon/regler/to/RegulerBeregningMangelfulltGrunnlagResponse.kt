package no.nav.pensjon.regler.to


import no.nav.pensjon.regler.domain.beregning.Beregning
import no.nav.pensjon.regler.domain.beregning2011.AbstraktBeregningsResultat

@Deprecated("Avvikles. Bruk FaktorOmregnResponse.", ReplaceWith("no.nav.pensjon.regler.to.FaktorOmregnResponse"))
class RegulerBeregningMangelfulltGrunnlagResponse : ServiceResponse() {
    var beregning1967: Beregning? = null
    var beregningsResultat2011: AbstraktBeregningsResultat? = null
}