package no.nav.pensjon.regler.domain.beregning

import no.nav.pensjon.regler.domain.kode.YtelsekomponentTypeCti

/**
 * Ventetillegg. netto=brutto=venteTillegg_GP+venteTillegg_TP
 */
class Ventetillegg : Ytelseskomponent() {
    /**
     * Ventetillegget for GP
     */
    var venteTillegg_GP = 0

    /**
     * Ventetillegget for tillegspensjon
     */
    var venteTillegg_TP = 0

    /**
     * Prosenten
     */
    var venteTilleggProsent = 0.0

    override var ytelsekomponentType: YtelsekomponentTypeCti = YtelsekomponentTypeCti("VT")
}