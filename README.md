# SDTrab2

Projeto construído usando tecnologia Servlets e JSP, com o intuito de testar a performance do Tomcat Server. 

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