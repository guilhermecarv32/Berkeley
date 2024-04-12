import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Sistema sistemaA = new NoMestre("Sistema A", 64800000); // Nome e Hora Atual: 15 horas (em milissegundos) com ajuste de fuso horario (-3hrs)
        Sistema sistemaB = new Sistema("Sistema B", 64200000); // Nome e Hora Atual: 14 minutos e 50 minutos (em milissegundos) com ajuste de fuso horario (-3hrs)
        Sistema sistemaC = new Sistema("Sistema C", 66300000); // Nome e Hora Atual: 15 horas e 25 minutos (em milissegundos) com ajuste de fuso horario (-3hrs)

        // criação do daemon de tempo
        NoMestre NoMestre = (NoMestre) sistemaA;

        // lista dos sistemas
        List<Sistema> sistemas = new ArrayList<>();
        sistemas.add(sistemaA);
        sistemas.add(sistemaB);
        sistemas.add(sistemaC);

        // sincroniza os relógios
        NoMestre.sincronizarRelogios(sistemas);
    }
}
