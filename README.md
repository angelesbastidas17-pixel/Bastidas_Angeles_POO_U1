# Sistema de Gestión de Contenidos Audiovisuales (POO - Unidad 2)

## Objetivo del Proyecto
El objetivo principal es aplicar conceptos avanzados de **Programación Orientada a Objetos (POO)** para modelar un programa escalable, manteniendo un control de versiones estructurado en GitHub.

El sistema resuelve la necesidad de catalogar distintos formatos multimedia (películas, series, documentales, videos musicales y podcasts) junto con las entidades que participan en ellos (actores, temporadas e investigadores).

---

## Nuevas Clases y Funcionalidades Añadidas

### 1. Clases de Relación
* **`Actor` (Agregación con `Pelicula`):** Modela a los actores del reparto. Su ciclo de vida es independiente del de la película; una película puede agrupar múltiples objetos `Actor`.
* **`Temporada` (Composición con `SerieDeTV`):** Representa las divisiones de una serie con su número de temporada. Su existencia depende estrictamente de la instancia de `SerieDeTV` que la contiene.
* **`Investigador` (Asociación con `Documental`):** Modela al científico/investigador a cargo de la investigación presentada en el documental.

### 2. Nuevas Subclases de `ContenidoAudiovisual`
* **`VideoMusical`:** Hereda de `ContenidoAudiovisual`. Incorpora atributos específicos como artista, álbum y sello discográfico, sobrescribiendo la visualización de detalles.
* **`Podcast`:** Hereda de `ContenidoAudiovisual`. Añade atributos para el anfitrión (host), número de episodio y plataforma de distribución, igualmente sobrescribiendo la visualización de detalles.

---

## Instrucciones de Instalación y Uso
### Prerrequisitos:
* Java Development Kit (JDK): Versión 17 o superior.
* IDE recomendado: Eclipse IDE for Java Developers (o cualquier IDE compatible como NetBeans / VS Code).
* Git: Instalado en el sistema.

---

## Pasos para clonar:
1. En la barra de menú superior de Eclipse, selecciona **`File` > `Import...`**.
2. En la ventana emergente, despliega la carpeta **`Git`**, selecciona la opción **`Projects from Git (with smart import)`** y haz clic en **`Next >`**.
3. Selecciona **`Clone URI`** y presiona **`Next >`**.
4. En el campo **`URI`**, pega el enlace de este repositorio: `https://github.com/angelesbastidas17-pixel/Bastidas_Angeles_POO_U1.git`
   Los campos Host y Repository path se autocompletarán automáticamente. Haz clic en `Next >`.
5. Asegúrate de que la rama principal (main o master) esté marcada con un visto y haz clic en `Next >`.
6. Verifica o elige la carpeta en tu computadora donde se guardará la copia local del proyecto y haz clic en `Next >`.
7. En la ventana Import Projects from File System or Archive, verifica que el proyecto aparezca seleccionado en la casilla Folder con el estado Project (Eclipse project) y haz clic en `Finish`.

## Pasos para ejecutar localmente:
1. En el panel Package Explorer, despliega el proyecto y navega hasta `src/main/java/poo/PruebaAudioVisual.java.`
2. Haz clic derecho sobre `PruebaAudioVisual.java` y selecciona `Run As` > `1 Java Application`.

---

## Ejemplo de la salida en la consola:
<img width="270" height="543" alt="image" src="https://github.com/user-attachments/assets/5af32435-c464-4611-9cf0-13050f4c0f70" />
<img width="299" height="292" alt="image" src="https://github.com/user-attachments/assets/4932592d-91b6-450e-84e3-3766d0872e81" />
