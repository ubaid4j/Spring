1. enable component scanning at applicationContext.xml file
2. then use @Component annotation to register a class as a bean
3. extracting bean is as same as in XML configuration


------------------------------------default bean id--------------------------</br>
1. if we do not put a string in @Component annotation then the class name with its first letter small 
will be our bean id

------------------------------------AutoWired--------------------------------</br>
we can put @AutoWired to constructor, setter method or even field to automatically connect it with its dependency


------------------------------------Qualifier-------------------------------</br>
When we have more than one implementations, then we use @Qualifier after @Autowired
and we put the name of class in the argument of @Qualifier which we want dependency injection</br>

---------------------------------Why Post Construct------------------------</br>
When constructor is called, then first our data array is initialized with values</br>
a, b, c. But 

When Spring creates the beans it follows this general process
1. Construct an instance of class
2. Inject dependencies
3. Set properties etc (@Value)

so, our data array is initialized with a, b, c but their values are not set at this time. 
So, we want to construct our array after [the values have been set in the a, b, and c]
for this, we used @PostConstruct


----------------------------------Scope--------------------------------------------------
1. singleton -default
2. prototype


----------------------------------Life Cycle----------------------------------------------
1. @PostConstruct [INIT method seems like call after constructor and dependency injection]
2. @PreDestory [destroy method] it will not called if scope is prototype



--------------------------------------configuration using java source code ---------------------------
1. @Configuration annotation on config class
2. @ComponentScan annotation after @Configuration and pass an argument as an path of package 
3. @Bean without scanning components, creating beans

---------------------------------------Loading properties file----------------------------------------
1. @PropertySoruce("path of property file") at the config class
2. rest is same as in xml configuration