package Cofre;

//classe Euro extendendo a classe Moeda
public class Euro extends Moeda {
    
    //Valor euro cotação em 07/05/2024
    double valorEuro = valor * 5.45;
    
    public Euro(double valor) {
        super(valor);
    }

    //usando Converter vindo da classe Abstrata Moeda
    @Override
    double converter() {
        return valorEuro;
    }

    @Override
    //Print das informações 
    String info() {
        double valor1 = valor;
        System.out.println("Valor em Euro: " + valor1);
        return info();
    }

    @Override
    //Print das informações 
    public String toString() {
        return "Euro: €" + valor;
    } 


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Euro other = (Euro) obj;
        if (Double.doubleToLongBits(valorEuro) != Double.doubleToLongBits(other.valorEuro))
            return false;
        return true;
    }

    
}   
