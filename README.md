# Práctica Sesión 06 - Java

Programas realizados con base en la práctica **Sesión 06 de fecha 14/Marzo**.

## Cómo compilar

```bash
javac src/*.java
```

## Cómo ejecutar algunos ejemplos

```bash
java -cp src Hello
java -cp src MCD
java -cp src Cuenta
java -cp src Parametros estos son parametros
java -cp src ProgramaAuto
java -cp src ProgramaSueldos
java -cp src TwoThreadsTest
```

## Ejemplos con archivos

Antes de ejecutar los ejemplos de I/O, se puede crear un archivo `Origen.txt`:

```bash
echo "Linea de prueba" > Origen.txt
java -cp src ProgramaIO
```

## Ejemplos con sockets

En una terminal:

```bash
java -cp src MultiServer
```

En otra terminal:

```bash
java -cp src Client
```

## Ejemplo RMI

En versiones modernas de Java ya no es necesario generar `stub` con `rmic`.

Terminal 1:

```bash
rmiregistry
```

Terminal 2:

```bash
java -cp src NumeroImpl localhost
```

Terminal 3:

```bash
java -cp src ClienteNumero localhost
```
