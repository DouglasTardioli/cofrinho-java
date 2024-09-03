package Cofre;

public abstract class Moeda {
    double valor;


    
    public Moeda(double valor) {
        this.valor = valor;
    }
    
    abstract double converter();
    abstract String info();
}
