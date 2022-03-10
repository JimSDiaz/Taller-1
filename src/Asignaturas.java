public class Asignaturas {

    private String nombre;
    private String estudiante;
    private String profesor;
    private Float nota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public void vNota(Float nota) throws Exception{
        if (nota < 0.0 || nota > 5.0){
            throw new Exception("La nota no está dentro de los límites establecidos.");
        } else{
            this.nota = nota;
        }
    }

}
