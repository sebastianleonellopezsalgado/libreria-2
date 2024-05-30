# Librería

Este proyecto es un catálogo de libros que utiliza la API de Gutendex para obtener información sobre libros. El catálogo permite realizar búsquedas de libros, listar libros y autores registrados, y realizar consultas específicas como buscar autores vivos en un determinado año o libros por idioma.

## Tecnologías Utilizadas

- Java
- Spring Boot 3.2.5
- Spring Data JPA
- PostgreSQL
- Maven

## Configuración del Proyecto

### Prerrequisitos

- JDK 17 o superior
- Maven 3.6 o superior
- PostgreSQL

### Instalación

1. Clonar el repositorio:

    ```bash
    git clone https://github.com/sebastianleonellopezsalgado/libreria-2.git
    cd libreria-2/libreria
    ```

2. Configurar la base de datos PostgreSQL:

    - Crear una base de datos llamada `libreria`.
    - Configurar las credenciales de acceso en `src/main/resources/application.properties`.

3. Construir el proyecto con Maven:

    ```bash
    mvn clean install
    ```

4. Ejecutar la aplicación:

    ```bash
    mvn spring-boot:run
    ```

## Uso

Al ejecutar la aplicación, se puede interactuar con ella a través de la consola. Las opciones disponibles en el menú son:

1. Buscar libro por título.
2. Listar libros registrados.
3. Listar autores registrados.
4. Listar autores vivos en un determinado año.
5. Listar libros por idioma.
0. Salir.

### Ejemplo de Uso

1. Seleccione la opción 1 para buscar un libro por título.
2. Ingrese el nombre del libro que desea buscar.
3. El sistema mostrará los detalles del libro encontrado y lo guardará en la base de datos.

## Estructura del Proyecto

- `src/main/java/com/libreria/alura/model`: Contiene las entidades `Autor`, `Libro`, y las clases de datos `Datos`, `DatosLibro`, `DatosAutor`.
- `src/main/java/com/libreria/alura/repository`: Contiene los repositorios `LibroRepository` y `AutorRepository`.
- `src/main/java/com/libreria/alura/service`: Contiene los servicios `ConsumoAPI` y `Conversor`.
- `src/main/java/com/libreria/alura/principal`: Contiene la clase principal `Principal` que ejecuta la aplicación.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, siga los pasos habituales para hacer un fork del repositorio y enviar un pull request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulte el archivo `LICENSE` para obtener más detalles.

