1. enable component scanning at applicationContext.xml file
2. then use @Component annotation to register a class as a bean
3. extracting bean is as same as in XML configuration


------------------------------------default bean id--------------------------
1. if we do not put a string in @Component annotation then the class name with its first letter small 
will be our bean id

------------------------------------AutoWired--------------------------------
we can put @AutoWired to constructor, setter method or even field to automatically connect it with its dependency


------------------------------------Qualifier-------------------------------
When we have more than one implementations, then we use @Qualifier after @Autowired
and we put the name of class in the argument of @Qualifier which we want dependency injection