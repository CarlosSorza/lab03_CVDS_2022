# lab03_CVDS_2022
## David Leon-Carlos Sorza
COMPILAR Y EJECUTAR\
Ejecute los comandos necesarios de Maven, para compilar el proyecto y verificar que el proyecto se creó correctamente y los cambios realizados al archivo pom no generan inconvenientes.
![image](https://user-images.githubusercontent.com/98216838/153490123-d3f42013-0cf9-49a1-a56f-88a648c125a3.png)
![image](https://user-images.githubusercontent.com/98216838/153490395-f003459d-3759-4a21-8e01-3bc5bf7ef510.png)\
Busque el comando requerido para ejecutar las pruebas unitarias de un proyecto desde Maven y ejecútelo sobre el proyecto. Se debe ejecutar la clase AppTest con resultado exitoso.
![image](https://user-images.githubusercontent.com/98216838/153490490-41a96084-6e89-4f71-9f7b-bff1cc18c353.png)\
EJECUTAR LAS PRUEBAS\
Para correr las pruebas utilice
$ mvn package
![image](https://user-images.githubusercontent.com/98216838/153491844-0ba248ff-ef44-40bd-a647-b6d04e91f63b.png)\
Tambien puede utilizar:
$ mvn test
![image](https://user-images.githubusercontent.com/98216838/153491929-58a3223d-8382-4002-9222-3acd3c8d5032.png)\
Revise cual es la diferencia.\
mvn test compila y ejecuta las pruebas y mvn package empaqueta y ejecuta
FINALIZAR EL EJERCICIO\
Piense en los casos de equivalencia que se pueden generar del ejercicio para la registraduría, dadas las condiciones. Deben ser al menos 5.

Complete la implementación de la clase RegistryTest.java con (al menos) un método por cada clase de equivalencia, creando diferentes personas y validando que el resultado sea el esperado.
![image](https://user-images.githubusercontent.com/98216838/153493388-d58cc3de-021e-48cd-985a-7868a80413e2.png)\

Complete la implementación del método registerVoter en la clase Registry.java para retornar el resultado esperado según la entrada.\
IMPLEMENTACIÓN DE LAS PRUEBAS \
Descargue el archivo aerodescuentos.jar y adicione esta nueva dependencia en el archivo pom.xml de su proyecto.\
Para adicionar una librería personalizada al repositorio local de maven puede ejecutar el siguiente comando.

$ mvn install:install-file -Dfile=aerodescuentos-1.0.0.jar -DgroupId=edu.eci.cvds -DartifactId=aerodescuentos -Dversion=1.0.0 -Dpackaging=jar
![image](https://user-images.githubusercontent.com/98216838/153493889-d9c5425e-5c2e-4b06-86f4-26d33a0e22d4.png)\

Cree el archivo TarifasTest.java en el directorio src/test/java/edu/eci/cvds/tdd/aerodescuentos.\
Realice la implementación de las pruebas propuestas en la etapa de diseño de pruebas en esta clase. Para sus pruebas debe usar el método "calculoTarifa" de la clase edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos, que se encuentran dentro del JAR de la librería personalizada.

Ejecute el comando de Maven para las fases de compilación y pruebas. Verifique el resultado exitoso de todas las pruebas y el reporte generado.\
![image](https://user-images.githubusercontent.com/98216838/153529752-d6753ce6-b485-426c-9674-57714b2e9326.png)

