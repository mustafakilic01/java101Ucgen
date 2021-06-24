import java.util.Scanner;
public class ucgenCevreHesapla {
    public static void main(String[] args) {
        //İlk Scanner tanımladık.
        Scanner input = new Scanner(System.in);
        //Değerlerin sınıfları tanımlanır.
        int kenar1, kenar2, kenar3, cevre,alan, cevreHesap;
        double hipohesap;

        //Sonra Kullanıcıdan üçgenin iki kenarının uzunluğu alınır.
        System.out.print("Üçgenin kenar uzunluğu |1| --> Giriniz : ");
        kenar1 = input.nextInt();

        System.out.print("Üçgenin kenar uzunluğu |2| --> Giriniz : ");
        kenar2 = input.nextInt();

        //Daha sonra bu iki kenar ile hipotenüsün hesaplanma formulü yazlır.
        hipohesap = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        System.out.println("Üçgenin hipotenüsü : "+ hipohesap);

        //Çıkan hipotenüs ile üçgenin üç kenarı bulunur ve artık üçgenin çevresinin ve alanını hesaplatabiliriz.
        cevreHesap = (int) (kenar1 + kenar2 + hipohesap) / 2;
        cevre =cevreHesap*2;
        System.out.println("Üçgenin toplam çevre uzunluğu: " + cevre);

        //Alan hesaplaması
        alan = (int) Math.sqrt(cevreHesap*(cevreHesap-kenar1)*(cevreHesap-kenar2)*(cevreHesap-hipohesap));
        System.out.println("Üçgenin alanı: " + alan);



    }
}
