package no.nav.pensjon.regler.domain.beregning2011;



/**
 * @author Steinar Hjellvik (Decisive) - PK-11391
 */
public class BeregningsgrunnlagYrkesskade extends AbstraktBeregningsgrunnlag {
	
	private static final long serialVersionUID = 3545891503020530843L;


	private int inntektVedSkadetidspunkt;

    /**
     * Angir det sluttpoengtall som yrkesskade beregningsgrunnlaget er omregnet fra.
     * Ang�r kun beregning av avd�de i sammenheng med nytt UT_GJT.
     */

    private double sluttpoengtall;

	public BeregningsgrunnlagYrkesskade() {
		super();
	}

	public BeregningsgrunnlagYrkesskade(BeregningsgrunnlagYrkesskade beregningsgrunnlagYrkesskade) {
		super(beregningsgrunnlagYrkesskade);
		this.inntektVedSkadetidspunkt = beregningsgrunnlagYrkesskade.inntektVedSkadetidspunkt;
        this.sluttpoengtall = beregningsgrunnlagYrkesskade.sluttpoengtall;
	}

	public int getInntektVedSkadetidspunkt() {
		return inntektVedSkadetidspunkt;
	}

	public void setInntektVedSkadetidspunkt(int inntektVedSkadetidspunkt) {
		this.inntektVedSkadetidspunkt = inntektVedSkadetidspunkt;
	}

    public double getSluttpoengtall() {
        return sluttpoengtall;
    }

    public void setSluttpoengtall(double sluttpoengtall) {
        this.sluttpoengtall = sluttpoengtall;
    }
}
