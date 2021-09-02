- Criei um volume:

````docker create volume es-interaction-volume```

- Criei uma rede no docker:

```docker network create es-interaction-mysql```

- Criei um container ligado à rede e ao volume criados:

```docker run --name es-interaction --network es-interaction-mysql -e MYSQL_ROOT_PASSWORD=senha-secreta -v es-interaction-volume:/var/lib/mysql -d mysql:8```

- Teste da conexão com banco de dados pelo container:

![image](https://user-images.githubusercontent.com/31226269/131896092-2e83eaa0-8c2e-476e-9441-ea3f5fd50178.png)
