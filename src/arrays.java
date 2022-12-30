public class arrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        String[] vehicles = {"Volvo", "BMW", "Ford", "toyota"};
        for (String j : vehicles) {
            System.out.println(j);
        }

    }
}
