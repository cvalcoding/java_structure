# Java Structure

Ceci est projet de démarrage pour les futurs projets en java qui vont être développé avec différent plugin.

## Installation

Utiliser le package manager [mvn](https://maven.apache.org/install.html) pour installer les différent composants dans le
repertoire

```mvn
mvn install
```

## Configuration

### persistence

- Allez dans le fichier persistence.xml.example qui se trouve au src/main/resources/META-INF
  et copier le en persistence.xml
- Mettre dans le fichier le user, password et changer le dbname
  dans la partie properties (le type de base est mariadb)

### flyway

- Allez dans le fichier flyway.conf.example qui se trouve au src/main/resources
  et copier le en flyway.conf
- Mettre dans le fichier le user, password et changer le dbname
  dans l'url (le type de base est mariadb)

Ne pas oublier de créer la base de donnée

```mvn
# check la migration
mvn clean flyway:info
# lancer la migration
mvn clean flyway:migrate
```
