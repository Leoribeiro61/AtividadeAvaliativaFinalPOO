public class Cd extends Midia {

    private int nMusicas;

    public Cd() {
    }

    public Cd(final int codigo, final double preco, final String nome, final int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(final int nMusicas) {
        this.nMusicas = nMusicas;
    }

    @Override
    public String getDetalhes() {
        final StringBuilder detalhes = super.getDetalhes();
        detalhes.append(" | Número de músicas: " + this.nMusicas);
        return detalhes.toString();
    }

}