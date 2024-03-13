package src.Listas;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Lista02 {

    public Lista02() {
        // Exercício 01

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira seu nome: ");
//        String nome = scanner.nextLine();
//        System.out.println( "Olá, " + nome + "!" );


        // Exercício 02

//        Scanner scanner = new Scanner(System.in);
//        System.out.println( "Insira um número: " );
//        int numero = scanner.nextInt();
//        System.out.println( "Insira outro número: ");
//        int numero2 = scanner.nextInt();
//        System.out.println( "A soma dos números é: " + (numero + numero2) );

        // Exercício 03

//        Scanner scanner = new Scanner(System.in);
//        System.out.println( "Insira um número: " );
//        int numero = scanner.nextInt();
//        if (numero % 2 == 0) {
//            System.out.println("O número é par.");
//        } else {
//            System.out.println("O número é ímpar.");
//        }

        // Exercício 04

//        Scanner scanner = new Scanner(System.in);
//        System.out.println( "Insira um número: " );
//        int numero = scanner.nextInt();
//        System.out.println("Insira outro número: ");
//        int numero2 = scanner.nextInt();
//        System.out.println("O maior número é: " + Math.max(numero, numero2));

        // Exercício 05

//        Scanner scanner = new Scanner(System.in);
//        System.out.println( "Insira uma nota: " );
//        double nota = scanner.nextDouble();
//        System.out.println("Insira outra nota: ");
//        double nota2 = scanner.nextDouble();
//        String resultado = (nota + nota2) / 2 >= 7 ? "Aprovado" : "Reprovado";
//        System.out.println("O aluno foi: " + resultado);

        // Exercício 06

//        Scanner scanner = new Scanner(System.in);
//        System.out.println( "Insira uma letra: " );
//        char letra = scanner.next().charAt(0);
//        boolean vogal = letra == 'a' ? true : false;
//        if (vogal){
//            System.out.println("Você digitou a letra a");
//        } else {
//            System.out.println("Você digitou outra letra");
//        }

        // Exercício 07

//        Scanner scanner = new Scanner(System.in);
//        System.out.println( "Digite sua idade: " );
//        int idade = scanner.nextInt();
//        String resultado = idade < 18 ? "menor de idade" : "maior de idade";
//        System.out.println("Você é " + resultado);

        // Exercício 08

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite uma temperatura em Celsius: ");
//        double celsius = scanner.nextDouble();
//        System.out.println("A temperatura em Fahrenheit é: " + ((celsius * 9/5) + 32));

        // Exercício 09

//        Scanner scanner = new Scanner(System.in);
//        System.out.println( "Insira um número: " );
//        int numero = scanner.nextInt();
//        boolean zero = numero == 0 ? true : false;
//        if (zero){
//            System.out.println("O número é zero");
//        } else {
//            System.out.println("O número não é zero");
//        }

        // Exercício 10

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira uma distância em metros: ");
//        double metros = scanner.nextDouble();
//        System.out.println("A distancia em kilometros é: " + metros / 1000 + "km");

        // Exercício 11

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira o raio de um círculo: ");
//        double raio = scanner.nextDouble();
//        System.out.println("A área do círculo é: " + Math.PI * Math.pow(raio, 2));

        // Exercício 12

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira um booleano: ");
//        boolean booleano = scanner.nextBoolean();
//        System.out.println("O valor do booleano é: " + booleano);


        // Exercício 13

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira um número: ");
//        int numero = scanner.nextInt();
//        System.out.println("Insira outro número: ");
//        int numero2 = scanner.nextInt();
//        int resultado = numero > numero2 ? numero - numero2 : numero2 - numero;
//        System.out.println("A diferença entre os números é: " + resultado);

        // Exercício 14

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira o numero de horas trabalhadas: ");
//        int horas = scanner.nextInt();
//        System.out.println("Insira o valor da hora trabalhada: ");
//        double valor = scanner.nextDouble();
//        System.out.println("O salário é: " + horas * valor);

        // Exercício 15

//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> nomes = new ArrayList<String>();
//        System.out.println("Insira o primeiro nome: ");
//        nomes.add(scanner.nextLine());
//        System.out.println("Insira o segundo nome: ");
//        nomes.add(scanner.nextLine());
//        System.out.println("Insira o terceiro nome: ");
//        nomes.add(scanner.nextLine());
//        for (int i = nomes.size() - 1; i >= 0; i--) {
//            System.out.println(nomes.get(i));
//        }


        // Exercício 16

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Qual o seu peso: ");
//        double peso = scanner.nextDouble();
//        System.out.println("Qual a sua altura: ");
//        double altura = scanner.nextDouble();
//        System.out.println("Seu IMC é: " + peso / Math.pow(altura, 2));

        // Exercício 17

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira um caractere: ");
//        char caractere = scanner.next().charAt(0);
//        Character.isUpperCase(caractere);
//        if (Character.isUpperCase(caractere)) {
//            System.out.println("O caractere é maiúsculo");
//        } else {
//            System.out.println("Não é maiúsculo");
//        }

        // Exercício 18

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira um número: ");
//        int numero = scanner.nextInt();
//        System.out.println("Insira outro número: ");
//        int numero2 = scanner.nextInt();
//        if(numero2 == 0){
//            System.out.println("Não é possível dividir por zero");
//        } else {
//            System.out.println("O resultado da divisão é: " + numero / numero2);
//        }

        // Exercício 19

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira seu nome: ");
//        String nome = scanner.nextLine();
//        System.out.println("Insira sua idade: ");
//        int idade = scanner.nextInt();
//        System.out.print("Seu nome é " + nome + " e você tem " + idade + " anos.");


        // Exercício 20

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira o valor do produto: ");
//        double valor = scanner.nextDouble();
//        System.out.println("O valor do produto com 10% de desconto é: " + valor * 0.9);

        // Exercício 21

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira o tamanho do lado do quadrado: ");
//        double lado = scanner.nextDouble();
//        System.out.println("O perímetro do quadrado é: " + (lado * 4));

        // Exercício 22

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira um numero: ");
//        int numero = scanner.nextInt();
//        if(numero > 0){
//            System.out.println("O número é positivo");
//        } else if(numero < 0){
//            System.out.println("O número é negativo");
//        } else {
//            System.out.println("O número é zero");
//        }

        // Exercício 23

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira um número: ");
//        int numero = scanner.nextInt();
//        System.out.println("O número possui " + String.valueOf(numero).length() + " dígitos");

        // Exercício 24

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira seu nome em minusculas: ");
//        String nome = scanner.nextLine();
//        System.out.println("Seu nome capitalizado é " + nome.substring(0, 1).toUpperCase() + nome.substring(1));

        // Exercício 25

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira uma string: ");
//        String string = scanner.nextLine();
//        System.out.println("Insira outra string: ");
//        String string2 = scanner.nextLine();
//        if (string.toLowerCase().equals(string2.toLowerCase())) {
//            System.out.println("As strings são iguais");
//        } else {
//            System.out.println("As strings são diferentes");
//        }



}
}