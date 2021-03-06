package no.nav.domain.pensjon.regler.beregning2011;

import no.nav.domain.pensjon.regler.GuiPrompt;
import no.nav.domain.pensjon.regler.Trygdetid;
import no.nav.domain.pensjon.regler.beregning.Ektefelletillegg;
import no.nav.domain.pensjon.regler.beregning.UforeEkstra;
import no.nav.domain.pensjon.regler.kode.MinstepensjonTypeCti;
import no.nav.domain.pensjon.regler.kode.ResultatKildeCti;
import no.nav.domain.pensjon.regler.trygdetid.AnvendtTrygdetid;

/**
 * @auhtor Magnus Bakken (Accenture) PK-9158
 * @author Aasmund Nordstoga (Accenture) PK-5549
 * @author Swiddy de Louw (Capgemini) PK-7113
 *
 */
public class SisteUforepensjonBeregning extends SisteBeregning {

    private static final long serialVersionUID = 7328363937502718087L;

    @GuiPrompt(prompt = "Ektefelletillegg")
    private Ektefelletillegg et;

    @GuiPrompt(prompt = "Trygdetid")
    private Trygdetid tt;

    @GuiPrompt(prompt = "Uføre ekstra")
    private UforeEkstra uforeEkstra;

    /**
     * Konverteringsgrunnlaget for brukers rettigheter
     */
    @GuiPrompt(prompt = "Konverteringsgrunnlag for brukers rettigheter")
    private Konverteringsgrunnlag konverteringsgrunnlagOrdinert;

    /**
     * Betinget, Konverteringsgrunnlag hvis gjenlevenderetten vant
     */
    @GuiPrompt(prompt = "Konverteringsgrunnlag hvis gjenlevenderetten vant")
    private Konverteringsgrunnlag konverteringsgrunnlagGJT;

    /**
     * Betinget: Hvis uføregraden > 0, yrkesskadegrad < uføregrad.
     */
    @GuiPrompt(prompt = "Konverteringsgrunnlag uføredel")
    private Konverteringsgrunnlag konverteringsgrunnlagUforedel;

    /**
     * Betinget: Hvis uføregraden > 0, yrkesskadegrad < uføregrad.
     */
    @GuiPrompt(prompt = "Konverteringsgrunnlag yrkesskade")
    private Konverteringsgrunnlag konverteringsgrunnlagYrkesskade;

    /**
     * Betinget: Hvis det fantes en folketrygdberegning(ikke nødvendigvis vinnende) i UP
     */
    @GuiPrompt(prompt = "Anvendt trygdetid for folketrygdberegning")
    private AnvendtTrygdetid anvendtTrygdetidFolketrygd;

    /**
     * Hvorvidt utbetalt uførepensjonen per 31.12.2014 ble definert som minstepensjon.
     */
    @GuiPrompt(prompt = " Hvorvidt utbetalt uførepensjonen per 31.12.2014 ble definert som minstepensjon")
    private MinstepensjonTypeCti minstepensjonType;


    /**
     * Hvorvidt utbetalt uførepensjonen per 31.12.2014 ble manuelt overstyrt eller ikke.
     */
    @GuiPrompt(prompt = "Hvorvidt utbetalt uførepensjonen per 31.12.2014 ble manuelt overstyrt eller ikke")
    private ResultatKildeCti resultatKilde;

    /**
     * Netto særtillegg i utbetalt uførepensjonen per 31.12.2014.
     */
    @GuiPrompt(prompt = " Netto særtillegg i utbetalt uførepensjonen per 31.12.2014")
    private int sertilleggNetto;

    public SisteUforepensjonBeregning() {
        super();
    }

    public SisteUforepensjonBeregning(SisteUforepensjonBeregning sb) {
        super(sb);
        if (sb.et != null) {
            et = new Ektefelletillegg(sb.et);
        }
        if (sb.tt != null) {
            tt = new Trygdetid(sb.tt);
        }
        if (sb.uforeEkstra != null) {
            uforeEkstra = new UforeEkstra(sb.uforeEkstra);
        }
        if (sb.konverteringsgrunnlagOrdinert != null) {
            konverteringsgrunnlagOrdinert = new Konverteringsgrunnlag(sb.konverteringsgrunnlagOrdinert);
        }
        if (sb.konverteringsgrunnlagGJT != null) {
            konverteringsgrunnlagGJT = new Konverteringsgrunnlag(sb.konverteringsgrunnlagGJT);
        }
        if (sb.konverteringsgrunnlagUforedel != null) {
            konverteringsgrunnlagUforedel = new Konverteringsgrunnlag(sb.konverteringsgrunnlagUforedel);
        }
        if (sb.konverteringsgrunnlagYrkesskade != null) {
            konverteringsgrunnlagYrkesskade = new Konverteringsgrunnlag(sb.konverteringsgrunnlagYrkesskade);
        }
        if(sb.anvendtTrygdetidFolketrygd != null) {
            anvendtTrygdetidFolketrygd = new AnvendtTrygdetid(sb.anvendtTrygdetidFolketrygd);
        }

        if(sb.minstepensjonType != null) {
            minstepensjonType = new MinstepensjonTypeCti(sb.minstepensjonType);
        }

       if(sb.resultatKilde != null) {
                   resultatKilde = new ResultatKildeCti(sb.resultatKilde);
       }
    }

    public Ektefelletillegg getEt() {
        return et;
    }

    public void setEt(Ektefelletillegg et) {
        this.et = et;
    }

    public Trygdetid getTt() {
        return tt;
    }

    public void setTt(Trygdetid tt) {
        this.tt = tt;
    }

    public UforeEkstra getUforeEkstra() {
        return uforeEkstra;
    }

    public void setUforeEkstra(UforeEkstra uforeEkstra) {
        this.uforeEkstra = uforeEkstra;
    }

    /**
     * @return the konverteringsgrunnlagOrdinert
     */
    public Konverteringsgrunnlag getKonverteringsgrunnlagOrdinert() {
        return konverteringsgrunnlagOrdinert;
    }

    /**
     * @param konverteringsgrunnlagOrdinert the konverteringsgrunnlagOrdinert to set
     */
    public void setKonverteringsgrunnlagOrdinert(Konverteringsgrunnlag konverteringsgrunnlagOrdinert) {
        this.konverteringsgrunnlagOrdinert = konverteringsgrunnlagOrdinert;
    }

    /**
     * @return the konverteringsgrunnlagGJT
     */
    public Konverteringsgrunnlag getKonverteringsgrunnlagGJT() {
        return konverteringsgrunnlagGJT;
    }

    /**
     * @param konverteringsgrunnlagGJT the konverteringsgrunnlagGJT to set
     */
    public void setKonverteringsgrunnlagGJT(Konverteringsgrunnlag konverteringsgrunnlagGJT) {
        this.konverteringsgrunnlagGJT = konverteringsgrunnlagGJT;
    }

    public Konverteringsgrunnlag getKonverteringsgrunnlagYrkesskade() {
        return konverteringsgrunnlagYrkesskade;
    }

    public void setKonverteringsgrunnlagYrkesskade(Konverteringsgrunnlag konverteringsgrunnlagYrkesskade) {
        this.konverteringsgrunnlagYrkesskade = konverteringsgrunnlagYrkesskade;
    }

    public Konverteringsgrunnlag getKonverteringsgrunnlagUforedel() {
        return konverteringsgrunnlagUforedel;
    }

    public void setKonverteringsgrunnlagUforedel(Konverteringsgrunnlag konverteringsgrunnlagUforedel) {
        this.konverteringsgrunnlagUforedel = konverteringsgrunnlagUforedel;
    }

    public AnvendtTrygdetid getAnvendtTrygdetidFolketrygd() {
        return anvendtTrygdetidFolketrygd;
    }

    public void setAnvendtTrygdetidFolketrygd(AnvendtTrygdetid anvendtTrygdetidFolketrygd) {
        this.anvendtTrygdetidFolketrygd = anvendtTrygdetidFolketrygd;
    }

    public MinstepensjonTypeCti getMinstepensjonType() {
        return minstepensjonType;
    }

    public void setMinstepensjonType(MinstepensjonTypeCti minstepensjonType) {
        this.minstepensjonType = minstepensjonType;
    }

    public ResultatKildeCti getResultatKilde() {
        return resultatKilde;
    }

    public void setResultatKilde(ResultatKildeCti resultatKilde) {
        this.resultatKilde = resultatKilde;
    }

    public int getSertilleggNetto() {
        return sertilleggNetto;
    }

    public void setSertilleggNetto(int sertilleggNetto) {
        this.sertilleggNetto = sertilleggNetto;
    }
}
