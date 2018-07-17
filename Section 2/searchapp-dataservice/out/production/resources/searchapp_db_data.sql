INSERT INTO topic (name, description, text_field1, text_field2)
VALUES
('Spring Boot vs. Spring Framework',
'
Spring framework is a Injection dependency framework at first (it''s
still as it is today) targeting managing life-cycle of Java components
(what so-called beans). Today, Spring framework is pretty bloated with
tons facilities/helpers on top of it; but if you look at the big
picture, it''s still a framework that glue things together, a middle
man to MVC frameworks (Struts 1,2, JSF etc), ORM frameworks
(Hibernate, iBatis, JOOQ etc) and other necessary facilities (Quartz,
Email, you can tell, whatever you need, most likely, there''s a Spring
support). Back to our assumed flow, it takes quite a lengthy tutorial
to set Spring framework up and running because Spring framework nature
is to provide flexibility of choices to you.
',
'
Spring boot on the other hand is built on a totally different
mantra. It''s basically a suite, pre-configured, pre-sugared set of
frameworks/technologies to reduce boiler plate configuration providing
you the shortest way to have a Spring web application up and running
with smallest line of code/configuration out-of-the-box. As you can
see from there Spring Boot page, it took less than 20 LOC to have a
simple RESTful application up and running with almost zero
configuration. It definitely has a ton of way to configure application
to match your need, this is the Spring Boot Reference Guide for your
reference
',
'
Spring based applications have a lot of configuration. For example,
when we use Spring MVC, we need to configure component scan,
dispatcher servlet, a view resolver, web jars(for delivering static
content) among other things.
Spring Boot looks at a) Frameworks available on the CLASSPATH b)
Existing configuration for the application. Based on these, Spring
Boot provides basic configuration needed to configure the application
with these frameworks. This is called Auto Configuration.
'
),
('Spring Boot vs. Spring Framework',
'
Spring framework is a Injection dependency framework at first (it''s
still as it is today) targeting managing life-cycle of Java components
(what so-called beans). Today, Spring framework is pretty bloated with
tons facilities/helpers on top of it; but if you look at the big
picture, it''s still a framework that glue things together, a middle
man to MVC frameworks (Struts 1,2, JSF etc), ORM frameworks
(Hibernate, iBatis, JOOQ etc) and other necessary facilities (Quartz,
Email, you can tell, whatever you need, most likely, there''s a Spring
support). Back to our assumed flow, it takes quite a lengthy tutorial
to set Spring framework up and running because Spring framework nature
is to provide flexibility of choices to you.
',
'
Spring boot on the other hand is built on a totally different
mantra. It''s basically a suite, pre-configured, pre-sugared set of
frameworks/technologies to reduce boiler plate configuration providing
you the shortest way to have a Spring web application up and running
with smallest line of code/configuration out-of-the-box. As you can
see from there Spring Boot page, it took less than 20 LOC to have a
simple RESTful application up and running with almost zero
configuration. It definitely has a ton of way to configure application
to match your need, this is the Spring Boot Reference Guide for your
reference
',
'
Spring based applications have a lot of configuration. For example,
when we use Spring MVC, we need to configure component scan,
dispatcher servlet, a view resolver, web jars(for delivering static
content) among other things.
Spring Boot looks at a) Frameworks available on the CLASSPATH b)
Existing configuration for the application. Based on these, Spring
Boot provides basic configuration needed to configure the application
with these frameworks. This is called Auto Configuration.
'
),
('Spring Boot vs. Spring Framework',
'
What is the core problem that Spring Framework solves? 
Think long and hard. 
What''s the problem Spring Framework solves?
Most important feature of Spring Framework is Dependency Injection. At
the core of all Spring Modules is Dependency Injection or IOC
Inversion of Control.
Why is this important?
Because, when DI or IOC is used properly, we can develop loosely
coupled applications. And loosely coupled applications can be easily
unit tested.
What is the core problem that Spring MVC Framework solves?
Spring MVC Framework provides decoupled way of developing web
applications. With simple concepts like Dispatcher Servlet,
ModelAndView and View Resolver, it makes it easy to develop web
applications.
Why do we need Spring Boot?
Spring based applications have a lot of configuration. For example,
when we use Spring MVC, we need to configure component scan,
dispatcher servlet, a view resolver, web jars(for delivering static
content) among other things.
',
'
Spring MVC is a complete HTTP oriented MVC framework managed by the
Spring Framework and based in Servlets. It would be equivalent to JSF
in the JavaEE stack. The most popular elements in it are classes
annotated with @Controller, where you implement methods you can access
using different HTTP requests. It has an equivalent @RestController to
implement REST based APIs.

Spring boot is a utility for setting up applications quickly, offering
an out of the box configuration in order to build Spring powered
applications. As you may know, Spring integrates a wide range of
different modules in its umbrella, as spring-core, spring-data,
spring-web (which includes Spring MVC, by the way) and so on. With
this tool you can tell Spring how many of them to use and you''ll get a
fast setup for them (you are allowed to change it by yourself later
on).
',
'
'
);





