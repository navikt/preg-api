package no.nav.pensjon.regler.to

import no.nav.pensjon.regler.domain.Pakkseddel
import no.nav.pensjon.regler.domain.vedtak.VilkarsVedtak
import java.io.Serializable

class VilkarsprovForsorgingstilleggResponse : Serializable {
    var vedtaksliste: List<VilkarsVedtak> = ArrayList()
    var pakkseddel = Pakkseddel()

}