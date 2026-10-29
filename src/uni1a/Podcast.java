package uni1a;

import java.util.ArrayList;

public class Podcast extends ContenidoAudiovisual{
    private String anfitrion;
    private int numeroEpisodio;
    private ArrayList<Investigador> investigadores;
    
    public Podcast(String titulo, int duracionEnMinutos, String genero, String anfitrion, int numeroEpisodio){
        super(titulo,duracionEnMinutos, genero);
        this.anfitrion = anfitrion;
        this.numeroEpisodio = numeroEpisodio;
        this.investigadores = new ArrayList<>();
    }

    public String getAnfitrion() {
        return anfitrion;
    }

    public void setAnfitrion(String anfitrion) {
        this.anfitrion = anfitrion;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodios(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }
    
    public void agregarInvestigador(Investigador investigador){
        investigadores.add(investigador);
    }
    
    public ArrayList<Investigador> getInvestigadores(){
        return investigadores;
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println("Detalles del Podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Anfitrión: " + this.anfitrion);
        System.out.println("Numero de episodios: " + this.numeroEpisodio);
        if (investigadores.isEmpty()){
            System.out.println("Investigadores: Aun no se ha agregado ninguno");
        }else{
            System.out.println("Investigadores:");
            for(int i = 0; i<investigadores.size();i++){
                System.out.println(investigadores.get(i).getNombre());
            }
        }
        System.out.println();
    }
}
