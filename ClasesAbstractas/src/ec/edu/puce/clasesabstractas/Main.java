package ec.edu.puce.clasesabstractas;

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo("Rectangulo 1");
        r1.setBase(7);
        r1.setAltura(15);
        System.out.println(r1.toString());

        Rectangulo r2 = new Rectangulo("Rectangulo 2");
        r2.setBase(8);
        r2.setAltura(10);
        System.out.println(r2.toString());

        if (r1.mayorQue(r2))
            System.out.println("El mayor es: " + r1.toString());
        else
            System.out.println("El menor es: " + r2.toString());
        
        
        System.out.println("-----------------------------------");
        Triangulo t1 = new Triangulo("Triangulo 1");
        t1.setBase(3);
        t1.setAltura(18);
        System.out.println(t1.toString());
        
        Triangulo t2 = new Triangulo("Triangulo 2");
        t2.setBase(2);
        t2.setAltura(9);
        System.out.println(t2.toString());

        if (t1.mayorQue(t2))
            System.out.println("El mayor es: " + t1.toString());
        else
            System.out.println("El menor es: " + t2.toString());
        
        
        System.out.println("-----------------------------------");
        Circulo c1 = new Circulo("Circulo 1");
        c1.setRadio(5);
        System.out.println(c1.toString());
        
        Circulo c2 = new Circulo("Circulo 2");
        c2.setRadio(3);
        System.out.println(c2.toString());
        
        if (c1.mayorQue(c2))
            System.out.println("El mayor es: " + c1.toString());
        else
            System.out.println("El menor es: " + c2.toString());
    }
}








