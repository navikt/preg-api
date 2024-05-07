package no.nav.pensjon.regler.domain.beregning2011

import no.nav.pensjon.regler.domain.beregning.Ytelseskomponent
import no.nav.pensjon.regler.domain.kode.YtelsekomponentTypeCti

class AfpKronetillegg : Ytelseskomponent() {
    override var ytelsekomponentType: YtelsekomponentTypeCti = YtelsekomponentTypeCti("AFP_KRONETILLEGG")
}