public class Test2 {
    Scanner scanner2 = new Scanner(System.in);
        System.out.println("Какую пиццу вы хотите заказать?");
    String pizzaType = scanner.next();

        switch (pizzaType.toUpperCase()){
        case "Маргарита":
            System.out.println("Вы заказали пиццу Маргарита");
            break;
        case "Диаболо":
            System.out.println("Вы заказали пиццу Диаболо");
            break;
        case "Сырная":
            System.out.println("Вы заказали пиццу Сырная");
            break;
        default:
            System.out.println("У нас только три вида пиццы");
    }
}
