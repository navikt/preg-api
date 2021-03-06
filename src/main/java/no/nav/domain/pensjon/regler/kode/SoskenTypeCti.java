package no.nav.domain.pensjon.regler.kode;

/**
 * Angir s�sken type. Se arkfane K_SOSKEN_T
 * pr sept 2007 s� tabellen slik ut
 * HEL Hels�sken
 * HALV Halvs�sken
 */
public class SoskenTypeCti extends TypeCti {

    private static final long serialVersionUID = -2942632929367735837L;

    public SoskenTypeCti() {
        super();
    }

    public SoskenTypeCti(String kode) {
        super(kode);
    }

    public SoskenTypeCti(SoskenTypeCti soskenTypeCti) {
        super(soskenTypeCti);
    }
}
