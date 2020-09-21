# Modelo de projeto com cucumber e rest-assured

Este é um modelo de projeto com cucumber para praticar o conceito de BDD. E tudo isso vai funcionar realizando chamadas em uma APIRest utilizando rest-assured.

### pre-requisitos

- jdk/jre 8
- maven version 3.3.1 or higher
- plugin do cucumber na ide
- plugin do testng ou junit na ide

### passos

no pom.xml colocar as seguintes dependencias: 
1. cucumber
2. cucumber for junit
3. rest-assured

`OBS: reload projeto maven sempre que colocar algo no pom.xml`

no package java:
6. criar a pasta "features" no resource
7. criar os packages dos runners e dos steps (e do action se necessario)
8. adicionar o -Dtestng.dtd.http=true na configuracao do run do testerunner (se for com tesng)
9. adicionar o tesng.xml (se for com testng)
10. adicionar as configuracoes adicionais do cucumber no runner 

### como rodar o projeto?

na feature que você escreveu seus cenários ou no Runner do projeto de o play no `Run "RunnerTest"` ou com o comando `Ctrl + shift + F10`