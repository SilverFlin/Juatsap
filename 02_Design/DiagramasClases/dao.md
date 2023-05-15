```mermaid
classDiagram

UsuarioDAO --|> BaseDAO~E~ : Inheritance
ChatDAO --|> BaseDAO~E~ : Inheritance
MensajeDAO --|> BaseDAO~E~ : Inheritance


class BaseDAO~E~{
    <<Abstract>>
    #getDatabase() MongoDatabase
    # getCollection()* MongoCollection~E~  
    +agregar(E entidad)* void
    +actualizar(E entidad)* void
    +consultar(String idEntidad)* E
    +consultarTodo(E entidad)* List~E~
}

class UsuarioDAO{
    consultar(String usuario) Usuario
}

class ChatDAO{
    consultarTodo(ObjectId idUsuario) List~Chat~
}

```

