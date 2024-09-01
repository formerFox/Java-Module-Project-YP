import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerLine = new Scanner(System.in);

        int count;
        Race racer = new Race();

        while(true){
            System.out.println("Введите количество машин:");
            if(scannerInt.hasNextInt()){
                count = scannerInt.nextInt();
                break;
            }
            else {
                System.out.println("Ошибка ввода! Попробуйте снова!");
                scannerInt.next();
            }
        }

        for(int i = 0; i < count; i++) {
            System.out.println("Введите название " + (i+1) + "-ой машины:");
            String nameCar = scannerLine.nextLine();

            int speedCar;
            while (true) {
                System.out.println("Введите скорость " + (i+1) + "-ой машины:");
                if (scannerInt.hasNextInt()) {
                    speedCar = scannerInt.nextInt();
                    if( speedCar > 0 && speedCar < 250) {
                        racer.checkRacer(nameCar, speedCar);
                        break;
                    }
                } else {
                    System.out.println("Неправильная скорость!");
                    scannerInt.next();
                }
            }
        }
        System.out.println("Победитель: " + racer.getRace());
        scannerInt.close();
        scannerLine.close();
    }
}