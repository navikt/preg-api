package no.nav.domain.pensjon.regler.beregning2011;

import no.nav.domain.pensjon.regler.GuiPrompt;
import no.nav.domain.pensjon.regler.kode.FormelKodeCti;
import no.nav.domain.pensjon.regler.kode.JustertPeriodeCti;
import no.nav.domain.pensjon.regler.kode.YtelseVedDodCti;
import no.nav.domain.pensjon.regler.trygdetid.Brok;

import java.util.Date;

/**
 * @author Swiddy de Louw (Capgemini) - PK-10228
 * @author Aasmund Nordstoga (Accenture) - PKFEIL-2605
 * @author Steinar Hjellvik (Decisive) - PK-11391
 * @author Lars Hartvigsen (Decisive) - PK-12169
 * @author Nabil Safadi (Decisive) - PK-8518
 */
public class Uforetrygdberegning extends Beregning2011 {
    private static final long serialVersionUID = 1L;

    @GuiPrompt(prompt = "Brutto per �r")
    private int bruttoPerAr;

    @GuiPrompt(prompt = "Formel")
    private FormelKodeCti formelKode;

    @GuiPrompt(prompt = "Grunnbel�p")
    private int grunnbelop;

    @GuiPrompt(prompt = "Minsteytelse")
    private Minsteytelse minsteytelse;

    @GuiPrompt(prompt = "Pro rata br�k")
    private Brok prorataBrok;

    @GuiPrompt(prompt = "Uf�regrad")
    private int uforegrad;

    @GuiPrompt(prompt = "Uf�retidspunkt")
    private Date uforetidspunkt;

    @GuiPrompt(prompt = "Egenopptjent uf�retrygd")
    private EgenopptjentUforetrygd egenopptjentUforetrygd;

    @GuiPrompt(prompt = "Egenopptjent uf�retrygd gunstigst")
    private boolean egenopptjentUforetrygdBest;

    @GuiPrompt(prompt = "Yrkesskadegrad")
    private int yrkesskadegrad;

    @GuiPrompt(prompt = "Yrkesskadetidspunkt")
    private Date yrkesskadetidspunkt;

    @GuiPrompt(prompt = "Mottar minsteytelse")
    private boolean mottarMinsteytelse;

    /* Bygger opp �rsakskoder som viser hvorfor personen mottar minsteytelse */
    private String minsteytelseArsak;

    private String PREG_avtaleBeregningsmetode;

    /* Viser hvilken type institusjonsopphold det er beregnet for. Kodene hentes fra K_JUST_PERIODE */
    @GuiPrompt(prompt = "Institusjonsopphold type")
    private JustertPeriodeCti instOppholdType;

    /* Angir om ytelsen er endret, enten  �kt eller redusert. */
    @GuiPrompt(prompt = "Institusjonsopphold anvendt")
    private boolean instOpphAnvendt;

    /*
     * Ekstra informasjon til beregnet uf�retrygd.
     * Brukes for at PREG skal beregne en uf�rehistorikk for uf�retrygd.
     */
    @GuiPrompt(prompt = "Ekstra informasjon til beregnet uf�retrygd")
    private UforeEkstraUT uforeEkstra;

    /**
     * Satt p� de beregninger hvor avd�des ytelse har p�virket beregningen.
     */
    @GuiPrompt(prompt = "Ytelse ved d�d")
    private YtelseVedDodCti ytelseVedDod;

    public Uforetrygdberegning() {
        super();
    }

    /**
     * Kopi-konstrukt�r som kan kopiere delberegninger.
     *
     * @param b beregningene som skal kopieres.
     * @param kopierDelberegning2011Liste settes til true dersom delberegninger skal kopieres.
     */
    public Uforetrygdberegning(Uforetrygdberegning b, boolean kopierDelberegning2011Liste) {
        super(b, kopierDelberegning2011Liste);
        copyCommonFields(b);
    }

    /**
     * Kopi-konstrukt�r som benyttes i normaltilfellet der man ikke �nsker � eksplisitt kopiere delberegninger.
     * @param b uf�retrygdberegningen man vil kopiere.
     */
    public Uforetrygdberegning(Uforetrygdberegning b) {
        super(b, false);
        copyCommonFields(b);
    }

    private void copyCommonFields(Uforetrygdberegning b){
        bruttoPerAr = b.bruttoPerAr;
        grunnbelop = b.grunnbelop;
        uforegrad = b.uforegrad;
        egenopptjentUforetrygdBest = b.egenopptjentUforetrygdBest;
        yrkesskadegrad = b.yrkesskadegrad;
        PREG_avtaleBeregningsmetode = b.PREG_avtaleBeregningsmetode;
        mottarMinsteytelse = b.mottarMinsteytelse;
        minsteytelseArsak = b.minsteytelseArsak;
        instOpphAnvendt = b.instOpphAnvendt;

        if (b.formelKode != null) {
            formelKode = new FormelKodeCti(b.formelKode);
        }
        if (b.uforetidspunkt != null) {
            uforetidspunkt = (Date) b.uforetidspunkt.clone();
        }
        if (b.minsteytelse != null) {
            minsteytelse = new Minsteytelse(b.minsteytelse);
        }
        if (b.egenopptjentUforetrygd != null) {
            egenopptjentUforetrygd = new EgenopptjentUforetrygd(b.egenopptjentUforetrygd);
        }
        if (b.instOppholdType != null) {
            instOppholdType = new JustertPeriodeCti(b.instOppholdType);
        }
        if (b.yrkesskadetidspunkt != null) {
            yrkesskadetidspunkt = (Date) b.yrkesskadetidspunkt.clone();
        }
        if (b.prorataBrok != null) {
            prorataBrok = new Brok(b.prorataBrok);
        }
        if (b.uforeEkstra != null) {
            uforeEkstra = new UforeEkstraUT(b.uforeEkstra);
        }
        if (b.ytelseVedDod != null) {
            this.ytelseVedDod = new YtelseVedDodCti(b.ytelseVedDod);
        }
    }

    public int getBruttoPerAr() {
        return bruttoPerAr;
    }

    public void setBruttoPerAr(int bruttoPerAr) {
        this.bruttoPerAr = bruttoPerAr;
    }

    public JustertPeriodeCti getInstOppholdType() {
        return instOppholdType;
    }

    public void setInstOppholdType(JustertPeriodeCti instOppholdType) {
        this.instOppholdType = instOppholdType;
    }

    public boolean isInstOpphAnvendt() {
        return instOpphAnvendt;
    }

    public void setInstOpphAnvendt(boolean instOpphAnvendt) {
        this.instOpphAnvendt = instOpphAnvendt;
    }

    public FormelKodeCti getFormelKode() {
        return formelKode;
    }

    public void setFormelKode(FormelKodeCti formelKode) {
        this.formelKode = formelKode;
    }

    public int getGrunnbelop() {
        return grunnbelop;
    }

    public void setGrunnbelop(int grunnbelop) {
        this.grunnbelop = grunnbelop;
    }

    public Minsteytelse getMinsteytelse() {
        return minsteytelse;
    }

    public void setMinsteytelse(Minsteytelse minsteytelse) {
        this.minsteytelse = minsteytelse;
    }

    public Brok getProrataBrok() {
        return prorataBrok;
    }

    public void setProrataBrok(Brok prorataBrok) {
        this.prorataBrok = prorataBrok;
    }

    public int getUforegrad() {
        return uforegrad;
    }

    public void setUforegrad(int uforegrad) {
        this.uforegrad = uforegrad;
    }

    public Date getUforetidspunkt() {
        return uforetidspunkt;
    }

    public void setUforetidspunkt(Date uforetidspunkt) {
        this.uforetidspunkt = uforetidspunkt;
    }

    public EgenopptjentUforetrygd getEgenopptjentUforetrygd() {
        return egenopptjentUforetrygd;
    }

    public void setEgenopptjentUforetrygd(EgenopptjentUforetrygd egenopptjentUforetrygd) {
        this.egenopptjentUforetrygd = egenopptjentUforetrygd;
    }

    public boolean isEgenopptjentUforetrygdBest() {
        return egenopptjentUforetrygdBest;
    }

    public void setEgenopptjentUforetrygdBest(boolean egenopptjentUforetrygdBest) {
        this.egenopptjentUforetrygdBest = egenopptjentUforetrygdBest;
    }

    public int getYrkesskadegrad() {
        return yrkesskadegrad;
    }

    public void setYrkesskadegrad(int yrkesskadegrad) {
        this.yrkesskadegrad = yrkesskadegrad;
    }

    public Date getYrkesskadetidspunkt() {
        return yrkesskadetidspunkt;
    }

    public void setYrkesskadetidspunkt(Date yrkesskadetidspunkt) {
        this.yrkesskadetidspunkt = yrkesskadetidspunkt;
    }

    public boolean isMottarMinsteytelse() {
        return mottarMinsteytelse;
    }

    public void setMottarMinsteytelse(boolean mottarMinsteytelse) {
        this.mottarMinsteytelse = mottarMinsteytelse;
    }

    public String getMinsteytelseArsak() {  return minsteytelseArsak; }

    public void setMinsteytelseArsak(String minsteytelseArsak) {  this.minsteytelseArsak = minsteytelseArsak; }

    public String getPREG_avtaleBeregningsmetode() {
        return PREG_avtaleBeregningsmetode;
    }

    public void setPREG_avtaleBeregningsmetode(String PREG_avtaleBeregningsmetode) {
        this.PREG_avtaleBeregningsmetode = PREG_avtaleBeregningsmetode;
    }

    /**
     * @return the uforeEkstra
     */
    public UforeEkstraUT getUforeEkstra() {
        return uforeEkstra;
    }

    /**
     * @param uforeEkstra the uforeEkstra to set
     */
    public void setUforeEkstra(UforeEkstraUT uforeEkstra) {
        this.uforeEkstra = uforeEkstra;
    }

    public YtelseVedDodCti getYtelseVedDod() {
        return ytelseVedDod;
    }

    public void setYtelseVedDod(YtelseVedDodCti ytelseVedDod) {
        this.ytelseVedDod = ytelseVedDod;
    }
}
