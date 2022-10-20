/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerconcolores;

/**
 *
 * @author l52
 */
public class Tallerconcolores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personajes p1 = new Personajes ();
        p1.setPersonaje("Winnie Pooh");
        p1.setEdad("90 años");
        p1.setTipo("Caricatura");
        p1.setQuelegusta("Le encanta la miel");
        
        Personajes p2 = new Personajes ();
        p2.setPersonaje("homero Simpson");
        p2.setEdad("66 años");
        p2.setTipo("Caricatura");
        p2.setQuelegusta("Le encanta tomar");
        
        Personajes p3 = new Personajes ();
        p3.setPersonaje("bugs bunny");
        p3.setEdad("81 años");
        p3.setTipo("Caricatura");
        p3.setQuelegusta("Le encanta las zanahorias");
        
        Personajes p4 = new Personajes ();
        p4.setPersonaje("clifford el perro");
        p4.setEdad("59 años");
        p4.setTipo("Caricatura");
        p4.setQuelegusta("Le encanta comer gatos");
        
        System.out.println("Mi personaje es: " +p1.getPersonaje()+ " Su edad es: " +p1.getEdad()+ " Su tipo es: " +p1.getTipo()+ " Le gusta: " +p1.getQuelegusta());
        System.out.println("Mi personaje es: " +p2.getPersonaje()+ " Su edad es: " +p2.getEdad()+ " Su tipo es: " +p2.getTipo()+ " Le gusta: " +p2.getQuelegusta());
        System.out.println("Mi personaje es: " +p3.getPersonaje()+ " Su edad es: " +p3.getEdad()+ " Su tipo es: " +p3.getTipo()+ " Le gusta: " +p3.getQuelegusta());
        System.out.println("Mi personaje es: " +p4.getPersonaje()+ " Su edad es: " +p4.getEdad()+ " Su tipo es: " +p4.getTipo()+ " Le gusta: " +p4.getQuelegusta());
    }
    
}
