# spring-data-relational-issue-1750

This is a minimal yet complete sample to reproduce https://github.com/spring-projects/spring-data-relational/issues/1750.

## Reproducing procedure

- Start a test DB container (see [here](https://github.com/kota65535/spring-data-relational-issue-1750/tree/main/src/main/resources/initdb.d) for the schema and data)

```shell
docker compose up -d
```

- Run test fails and see the stack trace

```shell
./gradlew test
```
