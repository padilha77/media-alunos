import java.util.Scanner;

/*
Média 7 ou maior: aprovado
Média entre 5 e 6,9: recuperação
Média abaixo de 5: reprovado
 */

public class mediaAlunos {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua Idade: ");
        byte idade = sc.nextByte();

        System.out.println("Digite sua nota do primeiro trimeste: ");
        double nota1 = sc.nextDouble();
        if (nota1 <= 0 || nota1 >= 10) {
            System.out.println("Nota ínvalida!");
            return;
        }

        System.out.println("Digite sua nota do segundo trimeste: ");
        double nota2 = sc.nextDouble();
        if (nota2 <= 0 || nota2 >= 10) {
            System.out.println("Nota ínvalida!");
            return;
        }

        System.out.println("Digite sua nota do terceiro trimeste: ");
        double nota3 = sc.nextDouble();
        if (nota3 <= 0 || nota3 >= 10) {
            System.out.println("Nota ínvalida!");
            return;
        }
        // media do aluno
        double media = (nota1 + nota2 + nota3)/3;

        System.out.println("\n <========Dados do aluno========> \n Nome: " + nome + "\n Idade: " + idade);
        System.out.printf(" Média: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Parabéns " + nome + ", você foi aprovado!");
        } else if (media >= 5) {
            System.out.println("Você ficou de recupeção!");
        }else{
            System.out.println("Você foi reprovado!");
        }
    }
}
