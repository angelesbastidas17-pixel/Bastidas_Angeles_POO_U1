package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        
        Pelicula pelicula1 = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        Actor actor1 = new Actor("Sam Worthington");
        Actor actor2 = new Actor("Zoe Saldaña");
        pelicula1.agregarActor(actor1);
        pelicula1.agregarActor(actor2);
        contenidos[0] = pelicula1;
        
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        
        Investigador investigador1 = new Investigador("Carl Sagan");
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy",investigador1);
        
        Podcast podcast1 = new Podcast("The Wild Project #11", 213, "Science", "Jordi Wild", 11);
        Investigador investigador2 = new Investigador("Javier Santaolalla");
        podcast1.agregarInvestigador(investigador2);
        contenidos[3] = podcast1;
        
        contenidos[4] = new VideoMusical("Si Antes Te Hubiera Conocido",3,"Regueton","Karol G", "Coke Studio");
        
        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}