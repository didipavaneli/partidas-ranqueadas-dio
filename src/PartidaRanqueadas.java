import java.util.Scanner;

public class PartidaRanqueadas {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o numero de vitorias!");
            int v = sc.nextInt();
            System.out.println("digite o numero de derrotas");
            int d = sc.nextInt();
            int saldo = v - d;
            String rank = getRank(saldo);

            String mensagem = String.format("O Herói tem o saldo de %d vitorias e está no nível de %s",saldo , rank);
            System.out.println(mensagem);

        }


        public static String getRank(int saldo) {

            int xpRange = (saldo >= 101) ? 8 :
                    (saldo >= 91)  ? 7 :
                            (saldo >= 81)  ? 6 :
                                    (saldo >= 51)  ? 5 :
                                            (saldo >= 21)  ? 4 :
                                                    (saldo >= 11)  ? 3 :
                                                            (saldo >= 10)  ? 2 : 1;

            return switch (xpRange) {
                case 1 -> "Ferro";
                case 2 -> "Bronze";
                case 3 -> "Prata";
                case 4 -> "Ouro";
                case 5 -> "Diamante";
                case 6 -> "Lendário";
                case 7 -> "Imortal";
                default -> "Desconhecido";
            };
        }
    }

