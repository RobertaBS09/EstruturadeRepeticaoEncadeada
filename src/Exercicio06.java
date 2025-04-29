import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, salarionovo, difsalrial;
        int tempo;
        String cargo;

        System.out.print("Seu cargo:");
        cargo = sc.next();
        System.out.print("Tempo de cargo:");
        tempo = sc.nextInt();
        System.out.print("Qual é o seu salário:");
        salario = sc.nextInt();

        if (cargo.equalsIgnoreCase("gerente")) {
            if (tempo >= 5) {
                salarionovo = salario * 1.10;
            }
            else if(tempo>=3){
                salarionovo=salario*1.09;
            }
            else{
                salarionovo= salario*1.08;
            }
        }


    }
}
