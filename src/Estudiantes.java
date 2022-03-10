public class Estudiantes {

    private Integer id;
    private String nombre;
    private String apellido;
    private Integer semestre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public void nSemestre(Integer semestre) throws Exception{
        if (semestre < 1 || semestre > 10){
            throw new Exception("El semestre está fuera de los límites");
        }
    }

}
