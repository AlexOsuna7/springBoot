# springBoot
Some practices in Spring Boot
------- Notaciones -----

La gran mayoría de desarrolladores de Spring Boot, suelen tener en su clase principal (main) anotada con las anotaciones
@Configuration, @EnableAutoConfiguration y @ComponentScan.
Dado que estas anotaciones se combinan con tanta frecuencia, Spring Boot ofrece el substituir tener que declarar constantemente este tridente de anotaciones, por declarar únicamente una sola @SpringBootApplication que englobará a las 3 anteriores.

----- @Configuration-----
Necesaria para configuraciones de resorte manual. La adición de esta anotación garantiza que la configuración se puede realizar en una clase Java en lugar
de usar un archivo xml separado.

------- @EnableAutoConfiguration ---
Spring necesita mucha configuración por hacer. Esta anotación asegura que gran parte de la configuración se realiza automáticamente.

------ @ComponentScan -----
Esto le dice a Spring, donde todos deben buscar componentes.

------------------------------------------------------------------

------- @Autowired -----

Esta notacion nos sirve para inyectar dependencias unas a otras, al trabajar con Spring, una vez creados los objetos el "Autowired" se encarga de realizar la conexion entre ambos, para que ambas clases sepan de la existencia del otro.
