public class Main {
    public static void main(String[] args) {
        int age = 15;
        long idnumber = 38953872;
        double height = 1.72;
        boolean underage;
        String name = "Lucas";

        if (age <= 18)
           underage = false;
            else
                underage = true;

        System.out.println("La edad es: " + age);
        System.out.println("El numero de documento es: " + idnumber);
        System.out.println("La altura es: " + height);
        System.out.println("Es mayor de edad: " + underage);
        System.out.println("El nombre es: " + name);
    }
}