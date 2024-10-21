import java.util.Scanner;
import java.util.Random;
/*Nome: Lucas da Silva Lucio
 Disciplina: Desenvolvimento de aplicações
 TURMA: TCTG241CNTDEV
 */
public class Lista02 {

    public static void main(String[] args) {
        // Questão 1. FUPQ que simule uma calculadora simples (adição, subtração, divisão, multiplicação e SAIR) 
        // com a entrada de dois números e a apresentação do resultado.
        
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha a operação: 1) Adição 2) Subtração 3) Multiplicação 4) Divisão 5) Sair");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                double resultado = 0;

                switch (opcao) {
                    case 1: resultado = num1 + num2; break;
                    case 2: resultado = num1 - num2; break;
                    case 3: resultado = num1 * num2; break;
                    case 4: 
                        if (num2 != 0) {
                            resultado = num1 / num2; 
                        } else {
                            System.out.println("Divisão por zero não é permitida.");
                        }
                        break;
                }
                if (opcao != 4 || num2 != 0) {
                    System.out.println("Resultado: " + resultado);
                }
            }

        } while (opcao != 5);
        
        // Questão 2. FUPQ que faça o cálculo da regra de três simples de acordo com a entrada dos valores. 
        // O programa será executado até que o operador digite um comando para SAIR.

        do {
            System.out.print("Digite o valor A (ou 0 para sair): ");
            double A = scanner.nextDouble();
            if (A == 0) break;

            System.out.print("Digite o valor B: ");
            double B = scanner.nextDouble();
            System.out.print("Digite o valor C: ");
            double C = scanner.nextDouble();

            double resultadoRegraTres = (B * C) / A;
            System.out.println("Resultado da regra de três: " + resultadoRegraTres);

        } while (true);
        
        // Questão 3. FUPQ informe todos os números entre 1 a 1000 que quando divididos por 11 obtemos resto = 5.

        System.out.println("Números entre 1 e 1000 que deixam resto 5 ao serem divididos por 11:");
        for (int i = 1; i <= 1000; i++) {
            if (i % 11 == 5) {
                System.out.println(i);
            }
        }

        // Questão 4. FUPQ calcule a série fibonacci a partir da entrada de um número para determinar a
        // quantidade de elementos a serem apresentados.

        System.out.print("Digite a quantidade de elementos da série Fibonacci: ");
        int quantidade = scanner.nextInt();
        int a = 0, b = 1;

        System.out.println("Série Fibonacci:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        // Questão 5. FUPQ o operador tenha que acertar o número escolhido aleatoriamente pela aplicação.
        
        Random rnd = new Random(); // Inicia Aleatorio
        int x = rnd.nextInt(10); // gera um número aleatório (0 - 9)
        int palpite;

        do {
            System.out.print("\nAdivinhe o número entre 0 e 9: ");
            palpite = scanner.nextInt();

            if (palpite < x) {
                System.out.println("MAIOR");
            } else if (palpite > x) {
                System.out.println("MENOR");
            } else {
                System.out.println("ACERTOU!");
            }

        } while (palpite != x);
        
        scanner.close();
    }
}
