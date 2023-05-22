public class MaquinaAguaConfiguravel {
    private int capacidadeAgua;
    private int capacidadeCopos200;
    private int capacidadeCopos300;
    private int quantidadeAgua;
    private int copos200;
    private int copos300;

    public MaquinaAguaConfiguravel(int capacidadeAgua, int capacidadeCopos200, int capacidadeCopos300) {
        if (capacidadeAgua <= 0) {
            throw new IllegalArgumentException("A capacidade de água deve ser positiva");
        }
        if (capacidadeCopos200 <= 0) {
            throw new IllegalArgumentException("A capacidade de copos de 200mL deve ser positiva");
        }
        if (capacidadeCopos300 <= 0) {
            throw new IllegalArgumentException("A capacidade de copos de 300mL deve ser positiva");
        }

        this.capacidadeAgua = capacidadeAgua;
        this.capacidadeCopos200 = capacidadeCopos200;
        this.capacidadeCopos300 = capacidadeCopos300;
        this.quantidadeAgua = 0;
        this.copos200 = 0;
        this.copos300 = 0;
    }

    public int getCapacidadeAgua() {
        return capacidadeAgua;
    }

    public int getCapacidadeCopos200() {
        return capacidadeCopos200;
    }

    public int getCapacidadeCopos300() {
        return capacidadeCopos300;
    }

     public void setCapacidadeAgua(int capacidadeAgua) {
        this.capacidadeAgua = capacidadeAgua;
    }

    public void setCapacidadeCopos200(int capacidadeCopos200) {
        this.capacidadeCopos200 = capacidadeCopos200;
    }

    public void setCapacidadeCopos300(int capacidadeCopos300) {
        this.capacidadeCopos300 = capacidadeCopos300;
    }

    public int agua() {
        return quantidadeAgua;
    }

    public int copos200() {
        return copos200;
    }

    public int copos300() {
        return copos300;
    }

  public void servirCopo200() {
    if (copos200 > 0 && quantidadeAgua >= 200) {
        quantidadeAgua -= 200;
        copos200--;
    } else {
        throw new IllegalStateException("Não há copos de 200mL ou água suficiente");
    }
    
}

public void servirCopo300() {
    if (copos300 > 0 && quantidadeAgua >= 300) {
        quantidadeAgua -= 300;
        copos300--;
    } else {
        throw new IllegalStateException("Não há copos de 300mL ou água suficiente");
    }
}




    public void abastecerAgua() {
        quantidadeAgua = capacidadeAgua;
        System.out.println("Quantidade de água atualizada: " + quantidadeAgua);
    }

    public void abastecerCopo200() {
        copos200 = capacidadeCopos200;
    }

    public void abastecerCopo300() {
        copos300 = capacidadeCopos300;
        
    }
}
