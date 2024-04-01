import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoMestre {
    private List<Sistema> sistemas;

    public NoMestre() {
        this.sistemas = new ArrayList<>();
    }

    public void adicionarSistema(Sistema sistema) {
        sistemas.add(sistema);
    }

    public void sincronizarRelogios() {
        // Exibe a hora atual de cada sistema antes do ajuste
        System.out.println("Horas dos sistemas antes do ajuste:");
        for (Sistema sistema : sistemas) {
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
            String horaFormatada = formatoHora.format(new Date(sistema.getHoraAtual()));
            System.out.println(sistema.getNome() + ": " + horaFormatada);
        }

        // Separar no terminal as horas antes e depois do ajuste
        System.out.println("-------------------");

        long somaTempos = 0;

        // Calcula a soma dos tempos de todos os sistemas
        for (Sistema sistema : sistemas) {
            somaTempos += sistema.getHoraAtual();
        }

        // Calcula o tempo médio
        long tempoMedio = somaTempos / sistemas.size();

        // Ajusta os relógios de acordo com a diferença em relação ao tempo médio
        for (Sistema sistema : sistemas) {
            long diferenca = tempoMedio - sistema.getHoraAtual();
            sistema.setHoraAtual(sistema.getHoraAtual() + diferenca);
            // Exibe a hora formatada após o ajuste
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
            String horaFormatada = formatoHora.format(new Date(sistema.getHoraAtual()));
            System.out.println("Relógio de " + sistema.getNome() + " ajustado para " + horaFormatada);
        }
    }
}
