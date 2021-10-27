import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ürünün KDV'siz fiyatını giriniz: ");
        int fiyat = scan.nextInt();
        if(fiyat<1000) {
            double yeni_fiyat = fiyat + (fiyat * 0.18);

            System.out.println("KDV'li fiyat = " + yeni_fiyat);
        } else if(fiyat > 1000)
        {
            double yeni_fiyat = fiyat + (fiyat * 0.08);

            System.out.println("KDV'li fiyat = " + yeni_fiyat);
        }
    }
}
