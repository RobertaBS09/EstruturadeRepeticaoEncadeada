import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1, v2, v3, aux;

        System.out.println("Digite o primeio valor:");
        v1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        v2 = sc.nextInt();
        System.out.println("Digite o terceiro valor:");
        v3 = sc.nextInt();

        if (v1 >v2) {
            aux=v1;
            v1=v2;
            v2=aux;
        }

        if (v1>v3){
            aux =v1;
            v1=v3;
            v3=aux;
        }

        if (v2>v3){
            aux=v2;
            v2=v3;
            v3=aux;
        }

        System.out.println(v1+" "+v2+" "+v3);

    }
}

