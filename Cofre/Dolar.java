package Cofre;

public class Dolar extends Moeda{
    //Valor Dolar cotação em 07/05/2024
    double valorDolar = valor * 5.07;

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    //usando Converter vindo da classe Abstrata Moeda
    double converter() {
        return valorDolar;
    }

    @Override
    //Print das informações 
    String info() {
        System.out.println("Adicionado: $" + valor);
        return info();
    }


    @Override
    //Print das informações 
    public String toString() {
        return "Dolar: $" + valor;
    } 

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dolar other = (Dolar) obj;
        if (Double.doubleToLongBits(valorDolar) != Double.doubleToLongBits(other.valorDolar))
            return false;
        return true;
    }

    
}
