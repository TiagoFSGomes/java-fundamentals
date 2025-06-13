public class GalToLit {
    public static void main(String[] args) {
        // Programa converste galões em litros

        double gallons;
        double liters;

        gallons = 10;
        liters = gallons * 3.78541; //converte galões para litros

        System.out.println("Gallons: " + gallons);
        System.out.println("Liters: " + liters);
        //Concatenacao + ajuste de casas decimais
        System.out.println(gallons + " gallons is " + String.format("%.2f", liters) + " liters");

    }
}
