# Proyecto Final Java - Tecno3F

Este proyecto Java implementa un sistema de gestión de policías y armas, donde se crean instancias de policías, armas cortas y armas largas, se asignan a los policías y se muestra información detallada sobre cada uno. También se realizan comparaciones entre armas largas basadas en su nivel.

## Funcionalidades

- Creación de instancias de `Policia`, `ArmaCorta` y `ArmaLarga`.
- Asignación de armas a los policías.
- Visualización de información detallada sobre policías y sus armas.
- Comparación de armas largas según su nivel.

## Detalles de Implementación

El proyecto consta de las siguientes clases principales:

- `Main.java`: Contiene el método `main` donde se inicializan y manejan las instancias de policías y armas.
- `Policia.java`: Representa a un policía con atributos como nombre, apellido y legajo.
- `Arma.java`: Clase abstracta base para las clases `ArmaCorta` y `ArmaLarga`, con métodos y atributos compartidos.
- `ArmaCorta.java`: Clase que extiende `Arma` para armas cortas, con características adicionales como si es automática y métodos específicos.
- `ArmaLarga.java`: Clase que extiende `Arma` para armas largas, incluyendo justificación de uso, nivel del arma y si tiene sello RENAR. Implementa la interfaz `Comparable` para comparar armas largas por nivel.

## Uso

Para ejecutar el proyecto, puedes clonarlo y compilarlo usando un IDE como IntelliJ IDEA o desde la línea de comandos:

```bash
$ javac Main.java
$ java Main


Contribuciones
Las contribuciones son bienvenidas. Si encuentras algún problema o tienes sugerencias, 
por favor, abre un issue o envía un pull request.

Autor
MelinaFigueroa - GitHub

Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
