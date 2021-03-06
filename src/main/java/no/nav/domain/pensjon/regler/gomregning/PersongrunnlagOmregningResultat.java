package no.nav.domain.pensjon.regler.gomregning;

import no.nav.domain.pensjon.regler.grunnlag.Inntektsgrunnlag;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PersongrunnlagOmregningResultat implements Serializable {
    private static final long serialVersionUID = -2935494155836759499L;

    private Long persongrunnlagId;
    private List<Inntektsgrunnlag> inntektsgrunnlagResultatListe;

    public PersongrunnlagOmregningResultat(Long persongrunnlagId, List<Inntektsgrunnlag> inntektsgrunnlagResultatListe) {
        super();
        this.persongrunnlagId = persongrunnlagId;
        this.inntektsgrunnlagResultatListe = inntektsgrunnlagResultatListe;
    }

    public PersongrunnlagOmregningResultat() {
        inntektsgrunnlagResultatListe = new ArrayList<Inntektsgrunnlag>();
    }

    public Inntektsgrunnlag[] inntektsgrunnlagResultatListeAsArray() {
        return inntektsgrunnlagResultatListe.toArray(new Inntektsgrunnlag[0]);
    }

    public Long getPersongrunnlagId() {
        return persongrunnlagId;
    }

    public void setPersongrunnlagId(Long persongrunnlagId) {
        this.persongrunnlagId = persongrunnlagId;
    }

    public List<Inntektsgrunnlag> getInntektsgrunnlagResultatListe() {
        return inntektsgrunnlagResultatListe;
    }

    public void setInntektsgrunnlagResultatListe(List<Inntektsgrunnlag> inntektsgrunnlagResultatListe) {
        this.inntektsgrunnlagResultatListe = inntektsgrunnlagResultatListe;
    }

}
