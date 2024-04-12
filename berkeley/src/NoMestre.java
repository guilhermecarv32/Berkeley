import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NoMestre extends Sistema {
    public NoMestre(String nome, long horaAtual) {
        super(nome, horaAtual);
    }

    public void sincronizarRelogios(List<Sistema> sistemas) {
        
        // exibe a hora atual(simulada) formatada de cada sistema antes do ajuste
        System.out.println("Horas dos sistemas antes do ajuste:");
        for (Sistema sistema : sistemas) {
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
            String horaFormatada = formatoHora.format(new Date(sistema.getHoraAtual()));
            System.out.println(sistema.getNome() + ": " + horaFormatada);
        }

        // separar antes e depois no terminal
        System.out.println("-------------------");

        long somaTempos = 0;

        // calcula a soma dos horarios de todos os sistemas
        for (Sistema sistema : sistemas) {
            somaTempos += sistema.getHoraAtual();
        }

        // calcula o horario médio
        long tempoMedio = somaTempos / sistemas.size();

        // ajusta os relógios
        for (Sistema sistema : sistemas) {
            long diferenca = tempoMedio - sistema.getHoraAtual();
            sistema.setHoraAtual(sistema.getHoraAtual() + diferenca);
            //formata e exibe a hora depois do ajuste
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
            String horaFormatada = formatoHora.format(new Date(sistema.getHoraAtual()));
            System.out.println("Relógio de " + sistema.getNome() + " ajustado para " + horaFormatada);
        }
    }
}
