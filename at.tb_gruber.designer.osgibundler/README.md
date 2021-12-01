# osgi bundler
apache pdfbox ist nicht als p2 bundle erhältlich, deshalb bauen wir es hier selbst:  
erst build, dann deploy. jetty muss für tycho build laufen.

## build
```
mvn p2:site
```

danach sind die artefakte im target folder.

## deployment
p2 updatesite:
```
mvn jetty:run
```

danach updatesite unter http://localhost:8080/site


## weitere doku

https://github.com/reficio/p2-maven-plugin