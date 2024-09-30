# Test

- [Introducción](#introducción)
- [Pre-requisitos](#pre-requisitos)
- [Instalación](#instalación)
- [Ejecución](#Ejecución-de-Pruebas)
- [Navegadores](#cambio-de-navegador)
- [Reporte Serenity](#reporte-serenity)
- [Evidencias](#evidencias-pruebas)



# Proyecto de Automatización de Pruebas

Este proyecto contiene las pruebas automatizadas para la aplicación usando 
Serenity BDD y patron de diseño POM.

## Introducción

Este proyecto utiliza Selenium, Serenity BDD y el patrón 
"Page Object Model" que proporciona un conjunto de pruebas
automatizadas para asegurar la calidad del software.

## Pre-requisitos

Asegúrate de tener instalados los siguientes software antes de 
ejecutar las pruebas:

- [Java JDK 8 o superior](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Gradle](https://gradle.org/install/)
- [Git](https://git-scm.com/downloads)

## Instalación

1. Clona el repositorio:

    https://github.com/Camilo-Arias/RetoAutomatizacion.git

2. Compila el proyecto:

    ```bash
    gradle clean build
    ```

## Ejecución de Pruebas

Para ejecutar las pruebas, ir a la siguiente ruta y 
ejecutar el runner con el tag @CreateUser o @comprarProductos
Para ejecutar proyecto completo ejecutar tag @E2E

```bash
    java/runners/Runner.java
 ```

## Cambio de navegador

Este proyecto soporta la ejecución en los navegadores
Chrome y Firefox. Para realizar el cambio de navegador
para la ejecución de las pruebas debe ir a la siguiente
ruta

```bash
src/test/resources/serenity.conf
 ```

Donde encontrara dos lineas de codigo lo cual indican
los navegadores, en este caso esta seleccionado el
navegador Chrome, por otro lado Firefox esta comentado
con "//", si quiere ejecutar en Firefox debe eliminar
estos elementos y colocarlos en Chrome, ej:

```bash

  driver = chrome
//driver = firefox


//driver = chrome
  driver = firefox

 ```


## Reporte Serenity

Para validar las evidencias tomadas en el proceso
de prueba validar la ruta

```bash
/target/site/serenity/index.html
 ```


