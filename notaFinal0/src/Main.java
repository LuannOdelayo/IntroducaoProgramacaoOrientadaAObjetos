import entities.Student;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Digite a nota do seu primeiro trimestre: ");
        student.tri1 = sc.nextDouble();
        System.out.print("Digite a nota do seu segundo trimestre: ");
        student.tri2 = sc.nextDouble();
        System.out.print("Digite a nota do seu terceiro trimestre: ");
        student.tri3 = sc.nextDouble();

        if (student.finalGrade() < 60) {
            System.out.printf("Reprovado, necessita de: %.2f", student.missingPoints());
        }
        else {
            System.out.printf("Aprovado");
        }






        sc.close();

    }
}