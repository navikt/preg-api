package no.nav.pensjon.regler.domain.kode

class YtelseVedDodCti : TypeCti {
    constructor() : super()
    constructor(kode: String?) : super(kode)
    constructor(typeCti: TypeCti) : super(typeCti)
}