package br.com.aulaEncapsulamentoEVisibilidade;

public class Principal {
    public static void main(String[] args) {
        Caneta c1= new Caneta();
        c1.modelo="bic";
        c1.cor="Azul";
        //c1.ponta=0.5f;
        c1.carga=80;//
        //c1.tampada=true;
        c1.status();
        c1.tampar();
        c1.rabiscar();

    }
}
