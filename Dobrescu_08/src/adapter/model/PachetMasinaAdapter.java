package adapter.model;

import adapter.model.ProiectExistent.IPachet;
import adapter.model.ProiectNou.IMasina;

public class PachetMasinaAdapter implements IPachet {
    private IMasina masina;

    public PachetMasinaAdapter(IMasina masina) {
        this.masina = masina;
    }

    @Override
    public void vindePachet() {
        masina.inchiriazaMasina();

    }
}
