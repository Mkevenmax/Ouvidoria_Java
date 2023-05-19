import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        String[] lista_ocorrencia = new String[5];
        int opcao = 500;
        while (opcao != 3) {
            System.out.println("---------- OUVIDORIA KEVEN ----------");
            System.out.println("1 - ADICIONAR RECLAMACAO");
            System.out.println("2 - LISTAR RECLAMACOES");
            System.out.println("3 - SAIR");
            System.out.println("Digite sua opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: {
                    System.out.println("---------- ADICIONAR RECLAMACAO ----------");
                    for (int x = 0; x < lista_ocorrencia.length; x++) {
                        System.out.println("DIGITE SUA RECLAMACAO: ");
                        lista_ocorrencia[x] = sc.nextLine();

                    }
                    break;
                }
                case 2: {
                    System.out.println("---------- LISTAR RECLAMACOES ----------");
                    for (String item : lista_ocorrencia) {
                        System.out.println(item);
                    }
                    break;
                }
                case 3: {
                    System.out.println("---------- SAIR ----------");
                }
                break;

                default:{
                    System.out.println("OPCAO INVALIDA!");
                }
                break;
            }

        }



    }
    }
