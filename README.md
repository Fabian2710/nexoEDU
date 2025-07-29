# NexoEDU

**Sistema de Gestión Académica y Plataforma de Recursos  
Facultad de Tecnología – UMSS**

---

## Descripción

**NexoEDU** es un sistema educativo universitario orientado a la gestión de estudiantes, docentes, materiales de estudio, avisos, reportes, horarios y recursos institucionales.  
Incluye interacción con IA (SimónAI), búsqueda avanzada, control de recursos y localización de zonas WiFi y oficinas.

---

## Estructura del Proyecto

```
src/
│
├── Aula.java
├── Aviso.java
├── Buscador.java
├── ControlMaterial.java
├── DatosDocente.java
├── Docente.java
├── Estudiante.java
├── Filtro.java
├── GeoLocalizacion.java
├── Horario.java
├── NexoEDU.java
├── Materia.java
├── Material.java
├── Moderador.java
├── Oficina.java
├── PromptBusqueda.java
├── Reporte.java
├── Resultado.java
├── SimonAI.java
├── Usuario.java
├── UsuarioInvitado.java
└── WifiZone.java
```

---

## Clases Principales

- **Usuario, Estudiante, UsuarioInvitado:**  
  Gestión de usuarios, información personal y avisos.

- **Docente, DatosDocente, Moderador:**  
  Gestión de docentes y control de recursos/materiales.

- **Material, Aviso, Reporte, ControlMaterial:**  
  Recursos de estudio, avisos y reportes.

- **Materia, Aula, Horario:**  
  Materias, aulas y generación de horarios.

- **Buscador, Filtro:**  
  Búsqueda avanzada de docentes y materiales.

- **PromptBusqueda, SimonAI, Resultado:**  
  Interacción con IA institucional para preguntas y respuestas.

- **GeoLocalizacion, WifiZone, Oficina:**  
  Localización de recursos y zonas clave de la universidad.

---

## Compilación y Ejecución

Desde la carpeta `src`:

```sh
javac *.java
java NexoEDU
```

---

## Ejemplo de Uso

La clase `NexoEDU.java` incluye una demo de:

- Registro e interacción de usuarios (estudiantes, invitados)
- Creación de docentes, materiales y avisos
- Armado de horarios, reportes y control de materiales
- Búsqueda avanzada y preguntas a la IA institucional
- Consulta de ubicaciones WiFi y oficinas universitarias

---

## Notas

- Código Java orientado a objetos, modular y fácilmente extensible.
- Sin dependencias externas, solo Java estándar.

