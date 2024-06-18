import java.util.Scanner;
public class MediaEscolar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Nome do aluno:");
        String nomeDoAluno = leitor.nextLine();

        System.out.print("Nota do primeiro bimestre: ");
        double notaDoPrimeiroBimestre = leitor.nextDouble();

        System.out.print("Nota do segundo bimestre: ");
        double notaDoSegundoBimestre = leitor.nextDouble();

        System.out.print("Nota do terceiro bimestre: ");
        double notaDoTerceiroBimestre = leitor.nextDouble();

        System.out.print("Nota do quatro bimestre: ");
        double notaDoQuatroBimestre = leitor.nextDouble();
        leitor.close();

        double mediaDoAluno = (notaDoPrimeiroBimestre + notaDoSegundoBimestre + notaDoTerceiroBimestre + notaDoQuatroBimestre) / 4;

        System.out.println("***********************");
        System.out.println("MÉDIA FINAL");
        System.out.println("***********************");

        System.out.printf("Nome do aluno: %s \n", nomeDoAluno);
        System.out.printf("Nota do bimestre 1: %s \n", notaDoPrimeiroBimestre);
        System.out.printf("Nota do bimestre 2: %s \n", notaDoSegundoBimestre);
        System.out.printf("Nota do bimestre 3: %s \n", notaDoTerceiroBimestre);
        System.out.printf("Nota do bimestre 4: %s \n", notaDoQuatroBimestre);
        System.out.println("------------------------");
        System.out.printf("%s, a sua nota final é: %s \n", nomeDoAluno, mediaDoAluno);
        System.out.println("------------------------");

        if (mediaDoAluno >= 7.0){
        //VERDADE
       System.out.printf("Parabéns!! você foi aprovado!!");
        } else if (mediaDoAluno < 5.0) {
            //FALSA
            System.out.printf("Que pena!! você foi Reprovado!!");
        } else {
            System.out.printf("Que pena!! você está de recuperação.");
    }
}
