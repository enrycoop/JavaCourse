#!/bin/bash
docker run --name psql -p 5432:5432 -v /home/sebssekk/Documents/MyProjects/vsCode-java/src/JDBC/create-table.sh:/docker-entrypoint-initdb.d/create-table.sh -e POSTGRES_PASSWORD=testpsw -e POSTGRES_USER=testuser -e POSTGRES_DB=testdb -d postgres

#docker exec -it psql psql testdb testuser
#> \dt



