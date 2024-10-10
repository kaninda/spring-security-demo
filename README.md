# Spring-security-demo
This repo we will study spring security

## Command pour HttpBasic
Affichage de tous les books en local
```shell
curl http://localhost:8081/api/books -u userTest:password  -v
```
Ajout des books dans la base

```
curl -i -X POST -u "userTest:password" -H "Content-type:application/json" -d @- http://localhost:8081/api/books <<EOF
{
  "title": "The Great Gatsby",
  "author": "F. Scott Fitzgerald"
}
EOF
```


