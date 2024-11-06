package asanayogaapi;

public class Asana {
    private int id;
    private String nombre;
    private String descripcion;
    private String nivelDificultad;
    private String beneficios;
    private String urlImagen;

    // Constructor, getters y setters
    public Asana(int id, String nombre, String descripcion, String nivelDificultad, String beneficios, String urlImagen) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
        this.beneficios = beneficios;
        this.urlImagen = urlImagen;
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getNivelDificultad() { return nivelDificultad; }
    public String getBeneficios() { return beneficios; }
    public String getUrlImagen() { return urlImagen; }
}

