import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        List<Estudiantes> estudiantes = new ArrayList<>();
        List<Profesores> profesores = new ArrayList<>();
        List<Asignaturas> asignaturas = new ArrayList<>();

        do{
            System.out.println(" ");
            System.out.println("Digite la opción que desea realizar.");
            System.out.println("1. Registrar estudiante.");
            System.out.println("2. Registrar Profesor.");
            System.out.println("3. Registrar asignatura.");
            System.out.println("4. Ver los estudiantes registrados.");
            System.out.println("5. Ver los profesores registrados.");
            System.out.println("6. Ver las asignaturas registradas.");
            System.out.println("0. Salir del programa.");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    try{
                        System.out.println("Ingrese la identificación del estudiante");
                        Integer id = scanner.nextInt();
                        System.out.println("Ingrese el nombre del estudiante");
                        String nombre = scanner.next();
                        System.out.println("Ingrese el apellido del estudiante");
                        String apellido = scanner.next();
                        System.out.println("Ingrese el semestre del estudiante");
                        Integer semestre = scanner.nextInt();

                        Estudiantes estudiante = new Estudiantes();

                        estudiante.nSemestre(semestre);
                        estudiante.setId(id);
                        estudiante.setNombre(nombre);
                        estudiante.setApellido(apellido);
                        estudiante.setSemestre(semestre);

                        estudiantes.add(estudiante);

                        System.out.println(" ");
                        System.out.println("ESTUDIANTE REGISTRADO EXITOSAMENTE!!!");
                        System.out.println(" ");

                    }catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try{
                        System.out.println("Ingrese la identificacion del profesor");
                        Integer id = scanner.nextInt();
                        System.out.println("Ingrese el nombre del profesor");
                        String nombre = scanner.next();
                        System.out.println("Ingrese el apellido del profesor");
                        String apellido = scanner.next();
                        System.out.println("Ingrese el tipo de contrato del profesor");
                        System.out.println("Contrato tipo CATEDRA o Contrato tipo COMPLETO");
                        String contrato = scanner.next();
                        if (contrato.equalsIgnoreCase("Catedra") || contrato.equalsIgnoreCase("Completo")) {
                            Profesores profesor = new Profesores();
                            profesor.setId(id);
                            profesor.setNombre(nombre);
                            profesor.setApellido(apellido);
                            profesor.setTipoContrato(contrato);

                            profesores.add(profesor);

                            System.out.println(" ");
                            System.out.println("PROFESOR REGISTRADO EXITOSAMENTE!!!");
                            System.out.println(" ");
                        }else {
                            System.out.println("Tipo de contrato no válido");
                        }

                    }catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    try{
                        System.out.println("Digite el nombre del estudiante");
                        String nombreE = scanner.next();

                        for (Estudiantes estudiante : estudiantes) {

                            if (nombreE.equals(estudiante.getNombre())) {
                                System.out.println("||EL ESTUDIANTE SE ENCUENTRA REGISTRADO||");
                                System.out.println(" ");
                                System.out.println("Digite el nombre del profesor");
                                String nombreP = scanner.next();

                                for (Profesores profesor : profesores) {

                                    if (nombreP.equals(profesor.getNombre())) {
                                        System.out.println("||EL PROFESOR SE ENCUENTRA REGISTRADO||");
                                        System.out.println(" ");
                                        System.out.println("Ingrese el nombre de la materia");
                                        String nombreM = scanner.next();
                                        System.out.println("Ingrese la nota del estudiante");
                                        float nota = scanner.nextFloat();

                                        Asignaturas asig = new Asignaturas();
                                        asig.vNota(nota);
                                        asig.setNombre(nombreM);
                                        asig.setEstudiante(nombreE);
                                        asig.setProfesor(nombreP);
                                        asig.setNota(nota);

                                        asignaturas.add(asig);
                                    }
                                }
                            }
                        }
                    }catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    try{
                        if (estudiantes.size() == 0){
                            System.out.println("No hay estudiantes registrados");
                        }else {
                            estudiantes.forEach((c) -> System.out.println("Id: " + c.getId() + ", Nombre: " + c.getNombre()
                                    + ", Apellido: " + c.getApellido() + ", Semestre: " + c.getSemestre()));
                        }
                    } catch (Exception e){
                    System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        if (profesores.size() == 0) {
                            System.out.println("No hay profesores registrados");
                        }else{
                            profesores.forEach((c) -> System.out.println("Id: " + c.getId() + ", Nombre: " + c.getNombre()
                                    + ", Apellido: " + c.getApellido() + ", Tipo de contrato: " + c.getTipoContrato()));
                        }
                    }catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 6:
                    try {
                        if (asignaturas.size() == 0) {
                            System.out.println("No hay asignaturas registradas");
                        } else {
                            asignaturas.forEach((c) -> System.out.println("Materia: " + c.getNombre() + ", estudiante: " + c.getEstudiante()
                                    + ", Profesor: " + c.getProfesor() + ", Nota: " + c.getNota()));
                        }
                    }catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
            }

        } while (opcion != 0);

    }
}
