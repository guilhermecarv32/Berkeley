public class App {
    public static void main(String[] args) throws Exception {
        Sistema sistemaA = new Sistema("Sistema A", 3600000); // Tempo inicial: 1 hora (em milissegundos)
        Sistema sistemaB = new Sistema("Sistema B", 3580000); // Tempo inicial: 59 minutos e 40 segundos (em milissegundos)
        Sistema sistemaC = new Sistema("Sistema C", 3660000); // Tempo inicial: 1 hora e 1 minuto (em milissegundos)

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
