

package introjava;

import java.util.Scanner;


public class IntroJAVA {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        
        int op;
        do{
        System.out.println("Menu Conversões");
        System.out.println("1 - comprimento");
        System.out.println("2 - pesos");
        System.out.println("3 - moedas");
        System.out.println("4 - sair");
        System.out.println("escolha a opção pretendida");
        op = ler.nextInt();
        if(op == 1)
            convertecomprimento();
        else if(op == 2)
            covertepesos();
        else if(op == 3)
            convertemoedas();
        else if(op!=4)
            System.out.println("escolha uma opção válida");
        }while(op!=4);
    }

    private static void convertecomprimento() {
        float metros;
        System.out.println("insira um valor em metros");
        metros = ler.nextFloat();
        System.out.println(metros+"(m) equivale a:\n"+
                +(metros*10)+"(dm)\n"+
                +(metros*100)+"(cm)\n"+
                +(metros*1000)+"(mm)\n"+
                +(metros/1000)+"(km)");
    }

    private static void covertepesos() {

    }

    private static void convertemoedas() {

    }
    
}
