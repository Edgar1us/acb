/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexion.Conexion;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import modelo.Entrenador;
import modelo.Equipo;
import modelo.Jugador;
import modelo.TipoJugador;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Edgar
 */
public class App {

    static Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here

        int opc = 0;

        SimpleDateFormat sdfAnyo = new SimpleDateFormat("yyyy/MM/dd");
        sdfAnyo.setLenient(false);

        SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm:ss");
        sdfHora.setLenient(false);

        SimpleDateFormat sdfHoraPartido = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        sdfHoraPartido.setLenient(false);
        
        SessionFactory sessionFactory;
        sessionFactory = Conexion.getSessionFactory();

        do {

            verMenu();
            opc = Integer.parseInt(teclado.nextLine());

            switch (opc) {
                case 1:

                    Entrenador entrenador = new Entrenador("Ilicic", 45, true);
                    Equipo equipo = new Equipo("Valencia");
                    equipo.setEntrenador(entrenador);
                    
                    Session session = sessionFactory.openSession();
                    session.beginTransaction();

                    session.saveOrUpdate(equipo);

                    session.getTransaction().commit();
                    session.close();
                    
                    break;
                    
                case 2:
                    
                    Set<Jugador> jugadores = new HashSet();
                    Equipo madrid = new Equipo("Real Madrid");

                    Jugador doncic = new Jugador("Luka", "Doncic", "Doncic", false, sdfAnyo.parse("1999/09/15"), sdfHora.parse("21:00:00"),
                        sdfHoraPartido.parse("2021/05/1 21:00"), 1500000, new BigDecimal(50.000), TipoJugador.BASE, madrid);

                    Jugador llull = new Jugador("Sergio", "Llull", "Llull", false, sdfAnyo.parse("1999/09/15"), sdfHora.parse("21:00:00"),
                        sdfHoraPartido.parse("2021/05/1 21:00"), 1500000, new BigDecimal(50.000), TipoJugador.BASE, madrid);

                    Jugador chacho = new Jugador("Chacho", "Rogriguez", "Rogriguez", false, sdfAnyo.parse("1999/09/15"), sdfHora.parse("21:00:00"),
                        sdfHoraPartido.parse("2021/05/1 21:00"), 1500000, new BigDecimal(50.000), TipoJugador.BASE, madrid);

                    jugadores.add(llull);
                    jugadores.add(chacho);
                    jugadores.add(doncic);

                    madrid.setJugadores(jugadores);
                    
                    Session session2 = sessionFactory.openSession();
                    session2.beginTransaction();

                    session2.saveOrUpdate(madrid);

                    session2.getTransaction().commit();
                    session2.close();
                    
                    break;
                    
                case 3:

                    Session session3 = sessionFactory.openSession();
                    session3.beginTransaction();
                    
                    System.out.println("Dime el id del jugador que quieres eliminar: ");
                    int eliminar = Integer.parseInt(teclado.nextLine());

                    Jugador j = (Jugador) session3.get(Jugador.class, eliminar);
                    session3.remove(j);
                    
                    session3.getTransaction().commit();
                    session3.close();
                    
                    break;
                    
                case 4:
                    
                    Session session4 = sessionFactory.openSession();
                    session4.beginTransaction();
                    
                    System.out.println("Dime el id del equipo que quieres eliminar: ");
                    int eliminar2 = Integer.parseInt(teclado.nextLine());

                    Equipo team = (Equipo) session4.get(Equipo.class, eliminar2);
                    session4.remove(team);
                    
                    session4.getTransaction().commit();
                    session4.close();

                    break;
                    
                case 5:

                    Session session5 = sessionFactory.openSession();
                    session5.beginTransaction();
                    
                    System.out.println("Dime el id del entrenador que quieres eliminar: ");
                    int eliminar3 = Integer.parseInt(teclado.nextLine());

                    Entrenador coach = (Entrenador) session5.get(Entrenador.class, eliminar3);
                    session5.remove(coach);
                    
                    session5.getTransaction().commit();
                    session5.close();
                    
                    break;
                    
                    
            }

        } while (opc != 0);


        

        

    }

    public static void verMenu() {
        System.out.println("*********************** HIBERNATE ACB ***********************");
        System.out.println("1.- Añadir ENTRENADOR y EQUIPO relación <1 a 1>");
        System.out.println("2.- Añadir EQUIPO y JUGADORES a dicho EQUIPO relación <1 a M>");
        System.out.println("3.- Eliminar jugador");
        System.out.println("4.- Eliminar equipo");
        System.out.println("5.- Eliminar entrenador");
        
        System.out.println(" --------------------- CONSULTAS ---------------------");
        System.out.println(" 6.- Lista de TODOS los JUGADORES");
        System.out.println("0.- Finalizar");
        System.out.println("Elige una opción: ");
    }

}
