package Cofre;

public class Real extends Moeda {
    //Valor em Real
    double valorReal = valor * 1;

    public Real(double valor) {
        super(valor);
    }

    @Override
    // usando Converter vindo da classe Abstrata Moeda
    double converter() {
        return valorReal;
    }

    @Override
    // Print das informações
    String info() {
        System.out.println("Adicionado: $" + valor);
        return info();
    }

    @Override
    // Print das informações
    public String toString() {
        return "Real: R$" + valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Real other = (Real) obj;
        if (Double.doubleToLongBits(valorReal) != Double.doubleToLongBits(other.valorReal))
            return false;
        return true;
    }

}
