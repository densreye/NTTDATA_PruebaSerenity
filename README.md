NTTDATA_PruebaSerenity
Prueba NTTDATA - Serenity - Dennys Reyes

Este proyecto consiste en la automatización de un proceso de compra del portal Demoblaze, donde se realiza lo siguiente: Agregar productos al carrito, visualizar el carrito de compra, realizar el proceso de compra.

Prerrequisitos
Se deben de tener las siguientes tecnologías y versiones instaladas en su máquina local:

Sistema operativo Windows 10
IntelliJ IDE versión 2023.2
Maven versión 3.8.6 (debe estar disponible en la variable de entorno)
JDK versión 1.8 (debe estar disponible en la variable de entorno)
Comandos de instalación
Se deben seguir estos pasos para instalar las dependencias del proyecto en nuestra terminal de comandos:

Ejecute el siguiente comando para descargar todas las dependencias:
mvn install -DskipTests
Prueba en el terminal
Ejecutar el comando para ejecutar la prueba:

prueba mvn

Para generar los informes, use el siguiente comando: serenidad mvn: agregado

Visualizar los reportes en la carpeta target/site/serenity

Ejecutar en IntelliJ IDE
Ejecute la clase PurchaseRunner.java
Información adicional
Versión de Selenium: 3.141.59
Versión de Serenity: 2.1.4
Versión de Cucumber: 4.2.0
Versión de JUnit: 4.13
