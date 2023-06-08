import java.util.Scanner;

public class sinifgecmedurumu {
    public static void main(String[] args) {
         int mat, fizik, turkce, kimya, muzik;
         Scanner input = new Scanner(System.in);

         System.out.print("matematik Notunuz : ");
         mat = input.nextInt();

         System.out.print("fizik notunuz :");
        fizik = input.nextInt();

        System.out.print("turkce notunuz : ");
        turkce = input.nextInt();

        System.out.print("kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("muzik notunuz : ");
        muzik = input.nextInt();

        double avarage = (mat + fizik + turkce + muzik )/5;
        if (avarage <= 55){
            System.out.println("sınıfta kaldınz !");
        }else {
            System.out.print("Tebrikler sınıfı geçtiniz");

        }
        System.out.println("ortalamanız : " +avarage);





    }
}
