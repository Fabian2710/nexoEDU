/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nexoedu;
import java.util.ArrayList;

public class NexoEDU {
    public static void main(String[] args) {
        // 1. Crear usuarios
        Estudiante estudiante = new Estudiante("Juan", "juan@correo.com", "1234");
        UsuarioInvitado invitado = new UsuarioInvitado();
        invitado.ingresarComoInvitado();

        // 2. Crear docentes y agregarlos al estudiante
        Docente d1 = new Docente(1, "Dra. Maria Perez", 4.5f);
        Docente d2 = new Docente(2, "Ing. Pedro Lopez", 4.7f);
        estudiante.agregarDocente(d1);
        estudiante.agregarDocente(d2);

        // 3. Crear materiales y avisos, y agregarlos al estudiante
        Material m1 = new Material("Algebra Lineal", "http://link1.com", "Juan");
        Material m2 = new Material("Programacion", "http://link2.com", "Pedro");
        Aviso a1 = new Aviso("Entrega de tareas hasta el viernes", "Importante");

        estudiante.agregarMaterial(m1);
        estudiante.agregarMaterial(m2);
        estudiante.agregarAviso(a1);

        // 4. Crear materia y aula, agregar a horario
        Aula aula1 = new Aula("A-101", "Edificio Principal");
        Materia materia1 = new Materia("Matematicas", "08:00", aula1, true);
        Horario horario = new Horario();
        horario.agregarMateria(materia1);

        // 5. Probar control de materiales y reportes
        ControlMaterial control = new ControlMaterial();
        control.aprobarM(m1);
        Reporte reporte = new Reporte(m2, "Contenido inapropiado");
        reporte.procesar();

        // 6. Moderador aprueba y banea
        Moderador mod = new Moderador();
        mod.aprobarMaterial(m2);
        mod.banearUsuario(estudiante);

        // 7. Buscar docentes usando filtro
        ArrayList<Docente> todosDocentes = new ArrayList<>();
        todosDocentes.add(d1);
        todosDocentes.add(d2);
        Filtro filtro = new Filtro();
        filtro.agregarCriterio("nombre", "Pedro");
        Buscador buscador = new Buscador();
        ArrayList<Docente> resultadoBusqueda = buscador.buscarDocente(filtro, todosDocentes);
        System.out.println("Docentes encontrados con filtro:");
        for (Docente doc : resultadoBusqueda) {
            System.out.println(" - " + doc);
        }

        // 8. Simón AI interacción
        PromptBusqueda prompt = new PromptBusqueda("Donde esta la oficina de inscripcion?", "oficina");
        SimonAI simon = new SimonAI();
        Resultado resultadoAI = simon.interactuar(prompt);
        System.out.println("IA responde: " + resultadoAI.getContenido());

        // 9. Geolocalización: buscar ubicaciones
        GeoLocalizacion geo = new GeoLocalizacion();
        ArrayList<String> zonasWifi = geo.buscarUbicacion("wifi");
        System.out.println("Zonas Wifi:");
        for (String zona : zonasWifi) {
            System.out.println(" - " + zona);
        }

        // 10. Mostrar horario y avisos del estudiante
        System.out.println(horario);
        System.out.println("Avisos del estudiante:");
        for (Aviso aviso : estudiante.getAvisos()) {
            System.out.println(aviso);
        }

        System.out.println("Demo completa!");
    }
}

