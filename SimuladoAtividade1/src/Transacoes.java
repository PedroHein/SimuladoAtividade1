import java.time.LocalDate;

public class Transacoes {
    public void run(){
        Usuario usuario = new Usuario("Usuario1", "1", "usuario1@gmail.com");
        Conta conta = new Conta(usuario, 1);

        System.out.println(conta);

        Transacoes transacoes = new Transacoes();

        conta.depositar(1000)
    }
}
