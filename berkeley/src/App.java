public class App {
    public static void main(String[] args) throws Exception {
        Sistema sistemaA = new Sistema("Sistema A", 64800000); // Tempo inicial: 15 horas (em milissegundos) com ajuste de fuso horario (-3hrs)
        Sistema sistemaB = new Sistema("Sistema B", 64200000); // Tempo inicial: 14 minutos e 50 minutos (em milissegundos) com ajuste de fuso horario (-3hrs)
        Sistema sistemaC = new Sistema("Sistema C", 66300000); // Tempo inicial: 15 horas e 25 minutos (em milissegundos) com ajuste de fuso horario (-3hrs)

        // Criação do nó mestre
        NoMestre noMestre = new NoMestre();

        // Adiciona os sistemas ao nó mestre
        noMestre.adicionarSistema(sistemaA);
        noMestre.adicionarSistema(sistemaB);
        noMestre.adicionarSistema(sistemaC);

        // Sincroniza os relógios
        noMestre.sincronizarRelogios();
    }
}
