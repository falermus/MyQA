package Training;

public class Contoh {

    public static int mySquare(int input) {
        int hasil = input * input;
        return hasil;
    }

    public static String namaSambung(String namaDepan, String namaBelakang) {
        System.out.println(namaDepan + " " + namaBelakang);
        return namaDepan + " " + namaBelakang;
    }

    public static String isEven(int number) {
        String hasil;

        if(number % 2 == 0) {
            hasil = number + " genap";
        }
        else {
           hasil = number + " ganjil";
        }

        return hasil;
    }

    public static void main(String[] args) {
        int x1 = 5;
        int x2 = 8;
        int x3 = 10;

        System.out.println(isEven(x1));
        System.out.println(isEven(x2));
        System.out.println(isEven(x3));
    }
}