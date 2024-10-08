import java.util.Scanner;

public class Main {

    public static void main () {
        main(null);
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int votosTaffe = 0;
        int votosRodrigo = 0;
        int votosLucas = 0;
        int votosAlessandro = 0;
        int votosInvalidos = 0;
        int[] votosRealizados = 0;

        //Informar quantos usuários irão votar
        System.out.println("Informe quantos eleitores");
        int quantidadeEleitor = scanner.nextInt(); //int é um tipo de variável

        int[] votosRealizados = new int[quantidadeEleitor]

        for (int i = 0; i < quantidadeEleitor; i++)//for é um loop de repetição usado quando sabe-se o número de repetições

            System.out.println("exibindo os votos");
        System.out.println("Taffe teve : "votosTaffe + " votos!");
        System.out.println("Rodrigo teve : "votosRodrigo + "votos!");
        System.out.println("Lucas teve : "votosLucas + "votos!");
        System.out.println("Alessandro teve : "votosAlessandro + "votos!");
        voto = scanner.nextInt();
    }while (voto != 99 && voto != 88 && voto != 77 && voto != 66);

        if(votosTaffe > votosRodrigo && votosTaffe > votosAlessandro && votosTaffe > votosLucas) {
            System.out.println("O grande ganhador é o Taffe");
        }else if (votosRodrigo > votosTaffe && votosRodrigo > votosAlessandro && votosRodrigo > votosLucas) {
            System.out.println("O grande ganhador é o Rodrigo");
        }else if (votosAlessandro > votosTaffe && votosAlessandro > votosRodrigo && votosAlessandro > votosLucas) {
            System.out.println("O grande ganhador é o Alessandro");
        }else {
            System.out.println("O grande ganhador é o Lucas");
        }
        }
        }

            int voto = 0;

            do {
                System.out.println("Eleitor número: " + i);
                System.out.println("Os candidatos da eleição são os seguintes: ");
                System.out.println("99 - Taffe");
                System.out.println("88 - Rodrigo");
                System.out.println("77 - Lucas");
                System.out.println("66 - Alessandro");
                System.out.println("Qual é o seu voto ?");
                voto = scanner.nextInt();
            } while (voto != 99 && voto != 88 && voto != 77 && voto != 66);

            //Contabiliza o total dos votos
            if(voto == 99) {
                votosTaffe++;
            }else if (voto == 88) {
                votosRodrigo++;
            }else if (voto == 77) {
                votosLucas++;
            }else (voto == 66) {
                votosAlessandro++;
            }
    }
}