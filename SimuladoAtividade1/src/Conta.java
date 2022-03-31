public class Conta {
    //Atributos da nossa classe
    private int numero;
    private double saldo;
    private Usuario usuario;


    public Conta(Usuario usuario, int numero){
        this.numero = numero;
        this.usuario = usuario;
        saldo = 0;
    }

    public String visualizarSaldo(){
        return  String.format("R$%.2f", saldo);
    }

    public boolean sacar(double valor){
        if(valor > saldo) return false;
        if(valor < 0) return false;
        this.saldo -= valor;
        return true;
    }

    public boolean depositar(double valor){
        if(valor < 0) 
            return false;
        this.saldo += valor;
        return true;
    }

    public boolean transferirDinheiro(double valor, Conta destino){
        if(!sacar(valor)) return false;
        if(!destino.depositar(valor)) return false;
        return true;
    }

    public String toString(){
        return "Numero: "+numero+"\nCliente: " +usuario.getNome()+"\nSaldo: "+visualizarSaldo();
    }
}