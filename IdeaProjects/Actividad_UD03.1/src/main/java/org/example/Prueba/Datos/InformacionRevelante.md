src/main/java/
└── org.example.Prueba.Laboral/
│
├── controlador/
│   └── FrontController.java
│
├── comando/
│   ├── Comando.java
│   ├── ComandoListar.java
│   ├── ComandoBuscar.java
│   ├── ComandoEditar.java
│   └── ComandoConsultarSalario.java
│
├── fabrica/
│   └── FabricaComandos.java
│
├── estrategia/
│   ├── EstrategiaCalculoSueldo.java
│   └── ...
│
├── modelo/
│   ├── Persona.java
│   ├── Empleado.java
│   └── Nomina.java
│
├── dao/
│   └── EmpleadoDAO.java
│
├── servicio/
│   └── EmpleadoService.java
│
└── BD/
└── ConexionBD.java


Lo haremos en este orden:
1. Crear FrontController.java.
2. Crear la interfaz Comando.java.
3. Implementar los comandos de cada funcionalidad.
4. Crear FabricaComandos.java.
5. Implementar Strategy para el cálculo de nóminas.
6. Adaptar los formularios y enlaces de las JSP.
7. Probar todas las operaciones.
8. Crear la etiqueta de GitHub y preparar el código empaquetado.
9. Redactar la explicación de los patrones para entregar.

-----------------------------------------------------------//-----------------------------------------------------------
Los patrones que he implementado en este ejercicio son:

1. Command
El patrón Command es muy común en el código Java. La mayoría de las veces se utiliza como alternativa a 
las retrollamadas (callbacks) para parametrizar elementos UI con acciones. También se utiliza para poner 
tareas en cola, realizar el seguimiento del historial de operaciones, etc.

2. Factory Method
El patrón Factory Method se utiliza mucho en el código Java. Resulta muy útil cuando necesitas proporcionar un 
alto nivel de flexibilidad a tu código.

3. Strategy
El patrón Strategy es muy común en el código Java. Se utiliza a menudo en varios frameworks para proporcionar 
a los usuarios una forma de cambiar el comportamiento de una clase sin extenderla.