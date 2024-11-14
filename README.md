

Teclado Adaptable para Android

Descripción del Proyecto

Este proyecto es una aplicación de Android que implementa una interfaz de usuario que imita un teclado utilizando botones. La aplicación se adapta dinámicamente al giro del dispositivo y reacciona al modo oscuro del sistema operativo.

Para esto e pensado dos soluciones : 
//Al final e decidido entregarte dos app separadas porque sino no podrias emular la otra pantalla a no ser que al pinchar un boton te lleve a la otra view...

Teclado1:

Hacer un GridLayout, dentro del LinearLayout por defecto, con un tamaño fijo en los botones en densidad de pixeles. Se adapta a casi todas los dispositivos exceptuando los que tienen una densidad de pixeles muy pequeña, como los apple watch. En la carpeta res\draweable e añadido un xml (diseno_boton.xml) en el que en el que le e dado estilo al los botones, dandoles forma cuadrada, añadiendo redondeado en los bordes, añadiendo un borde y haciendo un gradiante como color de fondo. Cada boton lo e conectado al estilo con este codigo "android:background="@drawable/diseno_boton"".

Teclado3:

Hacer un GridLayout directamente y con match parent hacer que ocupe todo la pantalla. Con esto conseguimos que al rotarla tambien ocupe todo el tamaño de la pantalla, por lo tanto funciona correctamente en todos los dispositivos.

Características

Interfaz de usuario amigable: Se simula un teclado con botones que permiten a los usuarios interactuar fácilmente.

Adaptación al giro de pantalla: La aplicación se adapta automáticamente cuando se rota el dispositivo.

Modo oscuro: Soporta el tema oscuro, ajustando los colores de la interfaz según la configuración del sistema.

Tecnologías Utilizadas

Lenguaje de programación: Java

IDE: Android Studio

SDK: Android 5.0 (API nivel 21) y superior

Dependencias: Material Components for Android

Instalación

Requisitos Previos:

Antes de comenzar, asegúrate de tener lo siguiente:

Java Development Kit (JDK): Debes tener instalado el JDK. 

Android Studio: Para desarrollar y ejecutar la aplicación. 

Pasos para Usar una App de Android en un Ordenador

1\. Abrir Android Studio

Inicia Android Studio.

2\. Abrir el Proyecto

Selecciona "Open an existing Android Studio project".

Navega hasta la carpeta donde se encuentra tu proyecto Android y selecciónalo.

3\. Configuración del Emulador

Si deseas ejecutar la app usando el emulador:

Crear un dispositivo virtual (AVD):

Haz clic en "Tools" en la barra de menú.

Selecciona "AVD Manager".

Haz clic en "Create Virtual Device".

Elige el tipo de dispositivo y haz clic en "Next".

Selecciona una imagen del sistema (recomendado la última versión estable de Android) y haz clic en "Next".

Configura las opciones del dispositivo virtual y haz clic en "Finish".

4\. Ejecutar la Aplicación

Con el emulador configurado (o un dispositivo real conectado via USB con la depuración USB activada):

Asegúrate de que el dispositivo virtual/emulador está activo.

Haz clic en el botón "Run" (el icono del triángulo verde) en la barra de herramientas.

Selecciona el AVD en el que deseas ejecutar la aplicación y haz clic en "OK".

5\. Interactuar con la Aplicación

Una vez que la app inicie, podrás interactuar con ella en la ventana del emulador o en el dispositivo real.

