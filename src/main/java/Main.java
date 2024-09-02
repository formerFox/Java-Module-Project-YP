import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count;
        Race racer = new Race();

        while(true){
            System.out.println("Введите количество машин:");
            if(scanner.hasNextInt()){
                count = scanner.nextInt();
                scanner.nextLine();
                break;
            }
            else {
                System.out.println("Ошибка ввода! Попробуйте снова!");
                scanner.next();
            }
        }

        for(int i = 0; i < count; i++) {
            System.out.println("Введите название " + (i+1) + "-ой машины:");
            String nameCar = scanner.nextLine();

            int speedCar;
            while (true) {
                System.out.println("Введите скорость " + (i+1) + "-ой машины(больше 0 и меньше 250):");
                if (scanner.hasNextInt()) {
                    speedCar = scanner.nextInt();
                    scanner.nextLine();
                    if( speedCar > 0 && speedCar < 250) {
                        racer.checkRacer(nameCar, speedCar);
                        break;
                    }
                } else {
                    System.out.println("Неправильная скорость!");
                    scanner.next();
                }
            }
        }
        System.out.println("Победитель: " + racer.getRace());
        scanner.close();
    }
}