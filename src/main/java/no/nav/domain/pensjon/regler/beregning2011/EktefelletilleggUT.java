package no.nav.domain.pensjon.regler.beregning2011;

import no.nav.domain.pensjon.regler.GuiPrompt;
import no.nav.domain.pensjon.regler.beregning.Ektefelletillegg;
import no.nav.domain.pensjon.regler.beregning.Ytelseskomponent;
import no.nav.domain.pensjon.regler.kode.YtelsekomponentTypeCti;

/* PREG domeneklasse for ytelseskomponent Ektefelletillegg Uf�retrygd
 *
 * @author Magnus Bakken - PKFEIL-3285: Feilretting av kopikonstrukt�r.
 * @author Swiddy de Louw - PKYTON-369 PK-6582 / PK-7106
 */

public class EktefelletilleggUT extends Ytelseskomponent implements UforetrygdYtelseskomponent{

    private static final long serialVersionUID = 8521270172851585927L;

    /**
     * �rsbel�p for delytelsen fra tidligere vedtak (fra tilsvarende beregningsperiode)
     */
    private int tidligereBelopAr;

    /**
     * Akkumulert netto hittil i �ret eksklusiv m�ned for beregningsperiodens fomDato.
     */
    @GuiPrompt(prompt = "Netto akkumulert")
    private int nettoAkk;

    /**
     * gjenst�ende bel�p brukeren har rett p� for �ret som beregningsperioden starter,
     * og inkluderer m�neden det beregnes fra.
     */
    @GuiPrompt(prompt = "Netto gjenst�ende")
    private int nettoRestAr;

    /**
     * Inntektsavkortningsbel�p per �r, f�r justering med differansebel�p
     */
    @GuiPrompt(prompt = "Avkortningsbel�p per �r")
    private int avkortningsbelopPerAr;

	/**
	 * netto ektefelletillegg per m�ned f�r konvertering * 12
	 */
    @GuiPrompt(prompt = "Ektefelletillegg f�r skattekompensasjon")
    private double etForSkattekomp;

	/**
	 * brukers oppjusterte uf�repensjon f�r skattekompensasjon
	 */
    @GuiPrompt(prompt = "Brukers oppjusterte uf�repensjon f�r skattekompensasjon")
	private double upForSkattekomp;

    public EktefelletilleggUT() {
        super();
        ytelsekomponentType = new YtelsekomponentTypeCti("UT_ET");
    }

    public EktefelletilleggUT(EktefelletilleggUT ektefelletilleggUT) {
        super(ektefelletilleggUT);
        nettoAkk = ektefelletilleggUT.nettoAkk;
        nettoRestAr = ektefelletilleggUT.nettoRestAr;
        avkortningsbelopPerAr = ektefelletilleggUT.avkortningsbelopPerAr;
        ytelsekomponentType = new YtelsekomponentTypeCti("UT_ET");
        etForSkattekomp = ektefelletilleggUT.etForSkattekomp;
        upForSkattekomp = ektefelletilleggUT.upForSkattekomp;
        tidligereBelopAr = ektefelletilleggUT.tidligereBelopAr;
    }

    public EktefelletilleggUT(Ektefelletillegg ektefelletillegg) {
        super(ektefelletillegg);
        ytelsekomponentType = new YtelsekomponentTypeCti("UT_ET");
    }

    public int getNettoAkk() {
        return nettoAkk;
    }

    public void setNettoAkk(int nettoAkk) {
        this.nettoAkk = nettoAkk;
    }

    public int getNettoRestAr() {
        return nettoRestAr;
    }

    public void setNettoRestAr(int nettoRestAr) {
        this.nettoRestAr = nettoRestAr;
    }

    public int getAvkortningsbelopPerAr() {
        return avkortningsbelopPerAr;
    }

    public void setAvkortningsbelopPerAr(int avkortningsbelopPerAr) {
        this.avkortningsbelopPerAr = avkortningsbelopPerAr;
    }

    public double getEtForSkattekomp() {
        return etForSkattekomp;
    }

    public void setEtForSkattekomp(double etForSkattekomp) {
        this.etForSkattekomp = etForSkattekomp;
    }

    public double getUpForSkattekomp() {
        return upForSkattekomp;
    }

    public void setUpForSkattekomp(double upForSkattekomp) {
        this.upForSkattekomp = upForSkattekomp;
    }

    @Override
    public int getTidligereBelopAr() {
        return tidligereBelopAr;
    }

    @Override
    public void setTidligereBelopAr(int tidligereBelopAr) {
        this.tidligereBelopAr = tidligereBelopAr;
    }
}
