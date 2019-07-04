import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        int moth = 1;
        double money = 1.0;
        double interser_rate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so tien gui: ");
        money = input.nextDouble();
        System.out.print("Nhap so thang gui: ");
        moth = input.nextInt();
        System.out.print("Nhap lai suat: ");
        interser_rate = input.nextDouble();
        double total_interset = 0;
        for (int i = 0; i < moth; i++) {
            total_interset = money * ((interser_rate * 100) / 12) * 3;
        }
        System.out.println("So tien lai la " + total_interset);

    }
}
