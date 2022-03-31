public class Atividade1 {
    public void run(){
        //codigo principal
        Conta conta1 = new Conta("Ana",1000);
        Conta conta2 = new Conta("Helena", 250);
        Conta conta3 = new Conta("Marcacini", 3000);
        Transacoes t = new Transacoes();
        //        t.transferirDinheiro(valor, retirar, destino)
        t.transferirDinheiro(250, conta2, conta1);
        System.out.println(""+t.NotaRecebe(conta1, 250)+ t.NotaDeQuem(conta2));

        t.transferirDinheiro(250, conta3, conta1);
        System.out.println(""+t.NotaRecebe(conta1, 250)+ t.NotaDeQuem(conta3));

        t.transferirDinheiro(250, conta2, conta1);
        System.out.println(""+t.NotaRecebe(conta1, 250)+ t.NotaDeQuem(conta2));


        t.transferirDinheiro(1000, conta3, conta2);
        System.out.println(""+t.NotaRecebe(conta2, 250)+ t.NotaDeQuem(conta3));

    }
    //funções


}