package uni1a;

import java.util.ArrayList;

public class Podcast extends ContenidoAudiovisual{
    private String anfitrion;
    private int numeroEpisodios;
    private ArrayList<Investigador> investigadores;
    
    public Podcast(String titulo, int duracionEnMinutos, String genero, String anfitrion, int numeroEpisodios){
        super(titulo,duracionEnMinutos, genero);
        this.anfitrion = anfitrion;
        this.numeroEpisodios = numeroEpisodios;
    }

    public String getAnfitrion() {
        return anfitrion;
    }

    public void setAnfitrion(String anfitrion) {
        this.anfitrion = anfitrion;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
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
        System.out.println("Numero de episodios: " + this.numeroEpisodios);
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
