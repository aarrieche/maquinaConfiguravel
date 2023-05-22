public class App {
    public static void main(String[] args) {
        MaquinaAguaConfiguravel maquinaCustom = new MaquinaAguaConfiguravel(10000, 30, 20);

        System.out.println(maquinaCustom.getCapacidadeAgua() == 10000); // mL
        System.out.println(maquinaCustom.getCapacidadeCopos200() == 30);
        System.out.println(maquinaCustom.getCapacidadeCopos300() == 20);

        maquinaCustom.setCapacidadeAgua(100000);
        maquinaCustom.setCapacidadeCopos200(300);
        maquinaCustom.setCapacidadeCopos300(200);

        System.out.println(maquinaCustom.agua() == 0); // mL
        System.out.println(maquinaCustom.copos200() == 0);
        System.out.println(maquinaCustom.copos300() == 0);

        maquinaCustom.abastecerAgua();
        maquinaCustom.abastecerCopo200();
        maquinaCustom.abastecerCopo300();

        System.out.println("erro 1");

        System.out.println(maquinaCustom.agua() == 10000);
        System.out.println(maquinaCustom.copos200() == 30);
        System.out.println(maquinaCustom.copos300() == 20);

        maquinaCustom.servirCopo200(); // -200
        maquinaCustom.servirCopo200(); // -200
        maquinaCustom.servirCopo200(); // -200
        maquinaCustom.servirCopo200(); // -200
        maquinaCustom.servirCopo200(); // -200

        System.out.println(maquinaCustom.copos200() == 25);
        System.out.println(maquinaCustom.agua() == 9000);

        MaquinaAguaConfiguravel maquininha = new MaquinaAguaConfiguravel(1000, 6, 3);

        System.out.println(maquininha.getCapacidadeAgua() == 1000); // mL
        System.out.println(maquininha.getCapacidadeCopos200() == 6);
        System.out.println(maquininha.getCapacidadeCopos300() == 3);

        maquininha.abastecerAgua();
        maquininha.abastecerCopo200();
        maquininha.abastecerCopo300();

        System.out.println(maquininha.agua() == 1000);
        System.out.println(maquininha.copos200() == 6);
        System.out.println(maquininha.copos300() == 3);

        maquininha.servirCopo200(); // -200
        maquininha.servirCopo200(); // -200
        maquininha.servirCopo200(); // -200
        maquininha.servirCopo200(); // -200
        maquininha.servirCopo200(); // -200

        System.out.println(maquininha.agua() == 0);
        System.out.println(maquininha.copos200() == 1);
        System.out.println(maquininha.copos300() == 3);

        System.out.println(maquininha.agua());

        

        System.out.println("erro 2");

        try {
            maquininha.servirCopo200(); // -200
            System.out.println(false); // esta linha não deve ser executada
        } catch (IllegalStateException e) {
            // Tratamento de exceção aqui
        }

        System.out.println(maquininha.agua() == 1000);
        System.out.println(maquininha.copos200() == 1);
        System.out.println(maquininha.copos300() == 3);

        maquininha.servirCopo200(); // -200
        maquininha.servirCopo200(); // -200
        maquininha.servirCopo200(); // -200
        maquininha.servirCopo200(); // -200
        maquininha.servirCopo200(); // -200

        System.out.println(maquininha.agua() == 800);
        System.out.println(maquininha.copos200() == 0);
        System.out.println(maquininha.copos300() == 3);

        

        try {
            maquininha.servirCopo200(); // -200
            System.out.println(false); // esta linha não deve ser executada
        } catch (IllegalStateException e) {
            // Tratamento de exceção aqui
        }

        System.out.println(maquininha.agua() == 800);
        System.out.println(maquininha.copos200() == 0);
        System.out.println(maquininha.copos300() == 3);

        try {
            maquininha.servirCopo300(); // -300
            System.out.println(false); // esta linha não deve ser executada
        } catch (IllegalArgumentException e) {
            // Tratamento de exceção aqui
        }

        System.out.println(maquininha.agua() == 800);
        System.out.println("erro aqui");
        System.out.println(maquininha.copos200() == 0);
        System.out.println(maquininha.copos300() == 3);

        MaquinaAguaConfiguravel maquinao = new MaquinaAguaConfiguravel(1000000, 1000, 1000);

        maquinao.abastecerAgua();
        maquinao.abastecerCopo300();

        try { // servindo enquanto houver água até causa estado inválido
            while (true) {
                maquinao.servirCopo300(); // -300
            }
        } catch (IllegalStateException e) {
            // Tratamento de exceção aqui
        }

        System.out.println(maquinao.copos300() == 334);
    }
}
