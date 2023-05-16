# org.itson.database

```mermaid
classDiagram

MongoConnection <|-- MongoConnectionImpl : implements


class MongoConnectionImpl{
    +loadClientSettings()  MongoClientSettings
}

```