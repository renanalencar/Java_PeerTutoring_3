import java.util.ArrayList;

/**
 * GerenciadorDeCupons
 */
public class GerenciadorDeCupons {
    private ArrayList<Cupom> cupons;

    public GerenciadorDeCupons() {
        this.cupons = new ArrayList<>();
    }

    public void adicionaCupom(Cupom cupom) {
        this.cupons.add(cupom);
    }

    public void removeCupom(Cupom cupom) {
        this.cupons.remove(cupom);
    }

    public boolean validaCupom(Cupom cupom) {
        return this.cupons.contains(cupom);
    }

    public boolean vazio() {
        return this.cupons.size() == 0;
    }
        
}