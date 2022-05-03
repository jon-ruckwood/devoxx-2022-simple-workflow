# devoxx-2022-simple-workflow

Demonstrating a simple workflow.

## Workflows

* Build – runs automatically when commits are pushed to the `main` branch (can also be invoked manually)

## Usage

Build

```shell
mvn package
```

Run
```shell
docker run --rm -p 7000:7000 devoxx-2022-simple-workflow:0.0.0-SNAPSHOT
```

Invoke
```shell
curl http://localhost:7000/ping
```
