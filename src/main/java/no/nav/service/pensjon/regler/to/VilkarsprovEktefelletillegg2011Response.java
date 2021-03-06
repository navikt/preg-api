package no.nav.service.pensjon.regler.to;

import no.nav.domain.pensjon.regler.Pakkseddel;
import no.nav.domain.pensjon.regler.vedtak.VilkarsVedtak;

public class VilkarsprovEktefelletillegg2011Response extends ServiceResponse{
	private static final long serialVersionUID = 1220037954801205664L;
	
	private VilkarsVedtak vilkarsvedtak;
	private Pakkseddel pakkseddel;
	
	public VilkarsprovEktefelletillegg2011Response() {
		super();
	}

	public Pakkseddel getPakkseddel() {
		return pakkseddel;
	}

	public void setPakkseddel(Pakkseddel pakkseddel) {
		this.pakkseddel = pakkseddel;
	}

	public VilkarsVedtak getVilkarsvedtak() {
		return vilkarsvedtak;
	}

	public void setVilkarsvedtak(VilkarsVedtak vilkarsvedtak) {
		this.vilkarsvedtak = vilkarsvedtak;
	}

}
