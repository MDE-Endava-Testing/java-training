package homeworks.christian.firstAssigment.firstAssigment;

public class Main {

    public static void main(String[] args){
        Humano hombre = new Humano();
        hombre.setName("Carlos");
        hombre.setCedula(1094938619);
        hombre.alimentarse();
        hombre.comunicarse();
        hombre.dormir();
        hombre.pensar();

        System.out.println();

        Animal domestico = new Animal();
        domestico.setRaza("Pastor aleman");
        domestico.alimentarse();
        domestico.comunicarse();
        domestico.dormir();
        domestico.cuidar();

        System.out.println();

        Hombre padre = new Hombre();
        padre.setName("Senior Carlos");
        padre.setCedula(1094966455);
        padre.alimentarse();
        padre.comunicarse();
        padre.dormir();
        padre.pensar();

        System.out.println();

        Mujer madre = new Mujer();
        madre.setName("Luisa");
        madre.setCedula(1094966555);
        madre.alimentarse();
        madre.comunicarse();
        madre.dormir();
        madre.pensar();

        System.out.println();

        Perro doberman = new Perro();
        doberman.aullar();

        Gato miau = new Gato();
        miau.maullar();

    }
}
