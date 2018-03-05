package DZ;

import java.util.Scanner;

public class Main {
    static Fraction fraction = new Fraction();
    static VerhovnaRada verhovnaRada = new VerhovnaRada();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loop:
        while (true) {
            printCommandList();
            System.out.println("Введите команду:");
            String command = scanner.next();

            switch (command) {
                case "create":
                    create_deputy();
                    break;
                case "show":
                    System.out.println(fraction.deputyList);
                    break;
                case "remove":
                remove_deputy();
                break;
                case "take":
                take_bribe_deputy();
                break;
                case "dell":
                dellDeputy();
                break;
                case "all":
                allBribe();
                break;
                case "clearf":
                removeFraction();
                break;
                case "createf":
                createFraction();
                break;
                case "showf":
                    System.out.println(verhovnaRada.verhovnaRadaList);
                    break;
                case "exit":
                    System.out.println("bye-bye");
                    break loop;
                default:
                    System.out.println("Я не знаю этой комманды, введите еще раз");
                    break;
            }
        }
    }

    private static void printCommandList() {
        System.out.println("========= Список комманд =========");
        System.out.println("create: добавить депутата");
        System.out.println("remove: удалить депутата");
        System.out.println("take: дать взятку");
        System.out.println("dell: удалить всех депутатов");
        System.out.println("show: показать всех депутатов");
        System.out.println("all: показать всех взяточников");
        System.out.println("createf: добавить фракцию");
        System.out.println("clearf: удалить фракцию");
        System.out.println("showf: показать все фракции");
        System.out.println("exit: выход");
        System.out.println("==================================");
    }

    public static void create_deputy() {
        System.out.println("ВВедите вес депутата: ");
        Double weight = Double.valueOf(scanner.next());
        System.out.println("ВВедите рост депутата: ");
        Double growth = Double.valueOf(scanner.next());
        System.out.println("ВВедите фамилию депутата: ");
        String serName = scanner.next();
        System.out.println("ВВедите имя депутата: ");
        String name = scanner.next();
        System.out.println("ВВедите возраст депутата: ");
        Integer age = scanner.nextInt();
        System.out.println("Депутат берет взятки (true|false): ");
        boolean bribe = scanner.next().equals("true");
        Deputy deputy = fraction.create(weight, growth, serName, name, age, bribe);
        System.out.println("Вы создали депутата");
        System.out.println(deputy);
    }

    public static void remove_deputy() {
        System.out.println("Введите имя депутата: ");
        String name = scanner.next();
        fraction.remove(name);
        System.out.println("Депутат: " + name + " удален.");
    }

    public static void take_bribe_deputy() {
        System.out.println("Введите имя депутата:");
        String name = scanner.next();
        System.out.println("размер взятки депутату: ");
        Integer bribe = scanner.nextInt();
        fraction.bribeDeputy(name,bribe);
    }
    public static void dellDeputy(){
        fraction.dellAlldeputy();
    }
    public static void allBribe(){
        fraction.allBribe();
    }
    public static void createFraction(){
        System.out.println("ВВедите название фракции: ");
        String nameFraction = scanner.next();
        verhovnaRada.create_fraction(nameFraction);
        System.out.println("Вы создали фракцию: " + nameFraction);
    }
    public static void removeFraction(){
        System.out.println("Введите название фракции которую хотите удалить: ");
        String nameFraction = scanner.next();
        verhovnaRada.remove_fraction(nameFraction);
    }
}




