public class Sistema {
    private String nome;
    private long horaAtual;

    public Sistema(String nome, long horaAtual) {
        this.nome = nome;
        this.horaAtual = horaAtual;
    }

    public long getHoraAtual() {
        return horaAtual;
    }

    public void setHoraAtual(long horaAtual) {
        this.horaAtual = horaAtual;
    }

    public String getNome() {
        return nome;
    }
}
