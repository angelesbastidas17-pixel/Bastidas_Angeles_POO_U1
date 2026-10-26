package uni1a;

public class VideoMusical extends ContenidoAudiovisual{
    private String nombreArtista;
    private String discografica;

    public VideoMusical(String titulo, int duracionEnMinutos, String genero, String nombreArtista, String discografica) {
        super(titulo, duracionEnMinutos, genero);
        this.nombreArtista = nombreArtista;
        this.discografica = discografica;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println("Detalles del video musical: ");
        System.out.println("ID: "+ getId());
        System.out.println("Título: "+getTitulo());
        System.out.println("Duración en minutos: "+getDuracionEnMinutos());
        System.out.println("Género: "+getGenero());
        System.out.println("Nombre del artista: " + this.nombreArtista);
        System.out.println("Discográfica: "+this.discografica);
    }
    
}
