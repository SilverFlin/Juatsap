# org.itson.dominio

```mermaid
classDiagram

class User{
    -ObjectId _id
    -String username
    -String password
    -Imagen imagenPerfil
    -String correo
    -Sexo sexo
    -List~ObjectId~ chats
    -LocalDateTime fechaNacimiento
    -String telefono
    -Direccion direccion    
}

class Chat{
    -ObjectId _id
    -ObjectId receptor
    -ObjectId emisor
    -LocalDateTime fecha
    -List<ObjectId> historialMensajes
}

class Mensaje{
    -ObjectId _id   
    -ObjectId userId
    -String contenidoMensaje
    -Imagen imagen
    -LocalDateTime timestamp
    -boolean disponibilidad
}
}
```
