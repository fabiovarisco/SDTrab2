# SDTrab2

Projeto construído usando tecnologia Servlets e JSP, com o intuito de testar a performance do Tomcat Server. 


## Instruções

O projeto usa o Spring Boot, que usa Maven. 

Para importar no Eclipse, usar Import Existing Maven Project. 

Para rodar no Spring Boot direto (que usa um embedded Tomcat Server): 
* Command Line: mvn sprint-boot::run
* Eclipse, Project > Run As > Maven Build.. > Goals: spring-boot::run > Run.

**Nota: **O Spring Boot tem certas limitações em relação a JSP e não tá rodando. Então, usar o Tomcat direto se estiverem estando Spring Boot. 

Para rodar no Tomcat: 
1. No eclipse, Project > Run As > Maven Build.. > Goals: clean package > Run.
1. Copiar o arquivo .war da pasta target para a pasta webapps do Tomcat. 
1. Iniciar (ou redeploy no app) o Tomcat. 


## Sobre o projeto

REST calls (com retorno JSON): 

* greeting (parâmetros opcionais: name. Ex: greeting?name=Fabio)
* randomNumbers (parâmetros opcionais: n. Ex: randomNumbers?n=1000)

JSP pages: 

* index (parâmetros opcionais: name e n) 
	* A página apresenta uma lista de números randômicos. 
	* A página usa bootstrap CSS, para download de conteúdo dinâmico. 
	

## TO-DO

* Se for necessário computação mais intensiva no servidor, podemos adicionar um método para gerar números randômicos e ordená-los.
* Talvez seja interessante adicionar mais conteúdo estático na página JSP. Talvez algumas imagens, para representar melhor como o servidor Tomcat se comporta servindo conteúdo estático. 