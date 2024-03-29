package no.nav.pensjon.regler.domain

import java.io.Serializable

class Merknad : Serializable {
    /**
     * Identifiserer merknaden. Navnekonvensjonen er:
     * Regelsettnavn.regelnavn.index, der ".index" er en opsjon.
     */
    var kode: String? = null

    /**
     * Beskrivende
     */
    var argumentListe: List<String> = mutableListOf()

    constructor()
    constructor(merknad: Merknad) {
        kode = merknad.kode
        argumentListe = ArrayList(merknad.argumentListe)
    }

}