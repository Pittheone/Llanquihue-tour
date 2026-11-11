
# Llanquihue-tour

**Autor:** Pedro Ascui

## Descripción
Aplicación en Java que lee desde un archivo de texto (`archivos.txt`) la
información de los tours clasificados de la agencia Llanquihue Tour. Los
datos se cargan en objetos `Tours`, se guardan en un `ArrayList` y luego
se recorren y filtran por lugar para mostrarlos en consola.

## Estructura de carpetas
```
llanquihue-tour/
├── README.md
└── src/
    ├── model/
    │   └── Tours.java             (nombre, lugar y precio)
    ├── data/
    │   └── GestorTour.java        (lee el archivo y crea los objetos)
    ├── ui/
    │   └── LlanquihueTourApp.java (clase Main: recorre y filtra)
    └── resources/
        └── archivos.txt           (datos separados por ;)
```

## Formato de archivos.txt
Una línea por tour, con los campos separados por punto y coma, sin espacios:
```
nombre;lugar;precio
```

## Cómo ejecutar la clase Main
1. Clonar o descargar el repositorio.
2. Abrir el proyecto en NetBeans (File → Open Project).
3. Verificar que `archivos.txt` esté en `src/resources/`.
4. Ejecutar la clase `LlanquihueTourApp` del paquete `ui`
   (clic derecho → Run File).
5. En consola se muestra la lista completa de tours y luego los tours
   filtrados por lugar.