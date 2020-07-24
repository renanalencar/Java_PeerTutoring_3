import java.util.Stack;

/**
 * ConsultaDeDescontos
 */
public class ConsultaDeCupons {
    public static void main(String[] args) {
        
        GerenciadorDeCupons gerenciador =  new GerenciadorDeCupons();

        Stack<Cupom> historico = new Stack<>();

        String codigos [] = {"VD74", "VD158", "VD14", "VD52", "VD221"};

        for (int i = 0; i < codigos.length; i++) {
            gerenciador.adicionaCupom(new Cupom(codigos[i]));
        }
        
        String s = "";
        System.out.print("Digite o código do cupom (ou '0' para sair): ");
        s = System.console().readLine();

        while (!s.equals("0")) {
                
            Cupom cupom = new Cupom(s);

            if (gerenciador.validaCupom(cupom)) {
                System.out.println("Cupom de desconto válido.");

                System.out.println("Removendo cupom utilizado do gerenciador...");
                gerenciador.removeCupom(cupom);

                System.out.println("Adicionando cupom ao histórico de cupons utilizados...");
                historico.add(cupom);
            } else {
                System.out.println("Esse cupom não existe ou está vencido.");
            }

            System.out.print("Digite o código do cupom (ou '0' para sair): ");
            s = System.console().readLine();
        }

        System.out.println("Historico de cupons utilizados:");
        for (Cupom c : historico) {
            System.out.println(c);
        }



    }
}