## Passo-a-passo da integração Spring Boot + MySQL dentro do Docker

- Criei um volume:

```docker create volume es-interaction-volume```

- Criei uma rede:

```docker network create es-interaction-mysql```

- Criei um container ligado à rede e ao volume criados:

```docker run --name es-interaction --network es-interaction-mysql -e MYSQL_ROOT_PASSWORD=senha-secreta -v es-interaction-volume:/var/lib/mysql -d mysql:8```

- Teste da conexão com banco de dados pelo container:

![image](https://user-images.githubusercontent.com/31226269/131896092-2e83eaa0-8c2e-476e-9441-ea3f5fd50178.png)

<br/>

Com a conexão estabelecida com sucesso, adicionei as configurações para conectar minha aplicação com o banco de dados usando **JDBC**.

```
# URL do banco de dados
spring.datasource.url=jdbc:mysql://localhost/es_interaction_database

# Usuário e senha para conectar no banco
spring.datasource.username=root
spring.datasource.password=senha-secreta

# Parâmetros de inicialização de acordo com a plataforma de preferencia
spring.sql.init.platform=mysql
spring.sql.init.mode=always
```


