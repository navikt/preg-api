package no.nav.domain.pensjon.regler.grunnlag;

import no.nav.domain.pensjon.regler.GuiPrompt;
import no.nav.domain.pensjon.regler.kode.GrunnlagsrolleCti;
import no.nav.domain.pensjon.regler.util.Copyable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static no.nav.domain.pensjon.regler.util.DateCopyUtil.copyDate;
import static no.nav.domain.pensjon.regler.util.ListUtil.deepCopyList;

public class UforetrygdEtteroppgjorDetalj implements Serializable, Copyable<UforetrygdEtteroppgjorDetalj> {
    private static final long serialVersionUID = 5218276049487224432L;

    /**
     * Angir gyldighetsperioden for detaljen. Avgrenset av uføreperioden og året som etteroppgjørsgrunnlaget gjelder for.
     */
    @GuiPrompt(prompt = "Fra og med dato")
    private Date fomDato;

    /**
     * Liste over inntektsfratrekk for etteroppgjøret (for perioder uten uføretrygd og andre registrerte fradrag).
     */
    @GuiPrompt(prompt = "Inntektsfratrekk for etteroppgjøret")
    private List<Inntektsgrunnlag> fratrekk = new ArrayList<Inntektsgrunnlag>();

    /**
     * Kode som angir hvilken rolle personen har på kravet. De ulike rollene er definert i Kodeverk, ark K_GRNL_ROLLE_T.
     */
    @GuiPrompt(prompt = "Grunnlagsrolle")
    private GrunnlagsrolleCti grunnlagsrolle;

    /**
     * Liste over alle inntekter som skal benyttes i etteroppgjøret.
     */
    @GuiPrompt(prompt = "Inntekter benyttet i etteroppgjør")
    private List<Inntektsgrunnlag> inntekter = new ArrayList<Inntektsgrunnlag>();

    /**
     * Angir gyldighetsperioden for detaljen. Avgrenset av uføreperioden og året som etteroppgjørsgrunnlaget gjelder for.
     */
    @GuiPrompt(prompt = "Til og med dato")
    private Date tomDato;

    public UforetrygdEtteroppgjorDetalj() {
    }

    public UforetrygdEtteroppgjorDetalj(UforetrygdEtteroppgjorDetalj uforetrygdEtteroppgjorDetalj) {
        if (uforetrygdEtteroppgjorDetalj.grunnlagsrolle != null) {
            grunnlagsrolle = new GrunnlagsrolleCti(uforetrygdEtteroppgjorDetalj.grunnlagsrolle);
        }
        inntekter = deepCopyList(uforetrygdEtteroppgjorDetalj.inntekter);
        fratrekk = deepCopyList(uforetrygdEtteroppgjorDetalj.fratrekk);
        fomDato = copyDate(uforetrygdEtteroppgjorDetalj.fomDato);
        tomDato = copyDate(uforetrygdEtteroppgjorDetalj.tomDato);
    }

    @Override
    public UforetrygdEtteroppgjorDetalj deepCopy() {
        return new UforetrygdEtteroppgjorDetalj(this);
    }

    public Date getFomDato() {
        return fomDato;
    }

    public List<Inntektsgrunnlag> getFratrekk() {
        return fratrekk;
    }

    public GrunnlagsrolleCti getGrunnlagsrolle() {
        return grunnlagsrolle;
    }

    public List<Inntektsgrunnlag> getInntekter() {
        return inntekter;
    }

    public Date getTomDato() {
        return tomDato;
    }

    public void setFomDato(Date fomDato) {
        this.fomDato = fomDato;
    }

    public void setFratrekk(List<Inntektsgrunnlag> fratrekk) {
        this.fratrekk = fratrekk;
    }

    public void setGrunnlagsrolle(GrunnlagsrolleCti grunnlagsrolle) {
        this.grunnlagsrolle = grunnlagsrolle;
    }

    public void setInntekter(List<Inntektsgrunnlag> inntekter) {
        this.inntekter = inntekter;
    }

    public void setTomDato(Date tomDato) {
        this.tomDato = tomDato;
    }

    public Inntektsgrunnlag[] getInntekterAsArray() {
        return inntekter != null ? inntekter.toArray(new Inntektsgrunnlag[inntekter.size()]) : new Inntektsgrunnlag[0];
    }

    public Inntektsgrunnlag[] getFratrekkAsArray() {
        return fratrekk != null ? fratrekk.toArray(new Inntektsgrunnlag[fratrekk.size()]) : new Inntektsgrunnlag[0];
    }
}
