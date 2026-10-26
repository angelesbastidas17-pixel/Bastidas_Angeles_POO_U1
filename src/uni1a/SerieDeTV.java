/**
 * Class SerieDeTV
 */
package uni1a;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private Temporada temporada;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int numeroTemp) {
        super(titulo, duracionEnMinutos, genero);
        this.temporada = new Temporada(numeroTemp);
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporada: " + this.temporada.getNumeroTemp());
        System.out.println();
    }
}