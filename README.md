# Strategy pattern

El [patrón estrategia](https://sourcemaking.com/design_patterns/strategy) es un [patrón de diseño de software](https://sourcemaking.com/design_patterns) dentro de los patrones de comportamiento. Con él podemos cambiar el algoritmo o comportamiento en ejecución sin necesidad de modificar nuestro código.

Existen muchos ejemplos como:
* Cuando necesitamos cambiar la integración con un servicio RestFul.
* Seleccionar el origen de datos de base de datos relacional versus un archivo plano.
* Cambiar la lógica de las validaciones dependiendo de un valor entrante.
* Entre otros.

## ¿Como funciona?

Las funcionalidades deben depender de abstracciones y no de implementaciones fijas, es decir, cumplir con el [principio de inversión de dependencias](https://en.wikipedia.org/wiki/Dependency_inversion_principle), uno de los [principios SOLID](https://en.wikipedia.org/wiki/SOLID).

Las asbtracciones nos permiten ser flexibles cuando deseamos ejecutar una lógica o un algoritmo, ya que en tiempo de ejecución podemos decidir que implementación usar.

Imagen tomada de: [https://sourcemaking.com/design_patterns/strategy](https://sourcemaking.com/design_patterns/strategy)
![Image](https://sourcemaking.com/files/v2/content/patterns/Strategy1.png)

En esta imagen podemos observar que tenemos una interface y dos posibles implementaciones.

## ¿Que encontramos en este repositorio?

El problema que vamos a solucionar es el procesamiento de tarjetas de crédito (TC) por 2 plataformas de pago: El servidor 1 (SR1) y el servidor 2 (SR2). Los ejemplos que podemos encontrar aquí están divididos por pasos:

|Paso|Descripción|
|---|---|
|1|Cada modelo de TC tiene su propia lógica de negocio para determinar si usa la plataforma SR1 o SR2. Las TC son TC MasterCard y TC VISA.|
|2|Se agrega una nueva TC Diners, sin embargo TC Diners no tiene plataforma para procesar sus pagos y retorna un **null**.|
|3|Una vez más, se agregan más TC: TC Falabella, TC AMEX y TC Rappi.<br><br>TC Falabella sufre lo mismo que TC Diners, no tienen plataforma para procesar sus pagos y deben retornar **null**.<br><br>Se observan comportamientos repetidos en TC AMEX, TC MasterCard y TC Rappi, las 3 usan la plataforma SR1 y el código se está repitiendo.|

### Problema 1: Métodos implementados sin lógica de negocio

TC Falabella y TC Diners tienen un problema:
* ¿Qué hacemos con las TC que no tienen plataforma para procesar sus pagos?
* ¿Cómo solucionar los métodos que NO deben ser implementados porque retornan **null**?

|Paso|Descripción|
|---|---|
|4|**Se crea la interface IProcessCreditCard** que solo es **implementada** por por las TC que tienen plataformas de pago: TC AMEX, TC MasterCard, TC Rappi y TC VISA.|

### Problema 2: Código duplicado

TC AMEX, TC MasterCard y TC VISA tienen un problema:
* ¿Qué hacemos con las TC que repiten su lógica de procesamiento de plataforma para pagos?
* ¿Cómo refactorizar el código duplicado?

|Paso|Descripción|
|---|---|
|5|Se crean 2 implementaciones de *IProcessCreditCard*: *ProcessServerOneCreditCardImpl* y *ProcessServerTwoCreditCardImpl*.<br><br>*ProcessServerOneCreditCardImpl* se encarga de los pagos a procesar por el SR1 y *ProcessServerTwoCreditCardImpl* hace lo mismo para SR2 ... y aquí viene lo importante, **cada TC deja de implementar la interface IProcessCreditCard y en cambio esta se agrega como un atributo a nivel de clase**.<br><br>Para este paso 5 solo se cuenta con TC MasterCard y TC VISA, cada una puede cambiar la plataforma de procesamiento de pagos en tiempo de ejecución.|
