Gradle Tasks: build

> Task :compileJava SKIPPED

> Task :compileAspectj FAILED
[warning] You aren't using a compiler supported by lombok, so lombok will not work and has been disabled.
Your processor is: org.aspectj.org.eclipse.jdt.internal.compiler.apt.dispatch.BatchProcessingEnvImpl
Lombok supports: OpenJDK javac, ECJ
	
D:\git\MyAspectjTest\src\main\java\mattmck\testapp\Test.java:8 [error] The method setCustomerId(int) is undefined for the type Customer
c.setCustomerId(1);
  ^^^^^^^^^^^^^
D:\git\MyAspectjTest\src\main\java\mattmck\testapp\Test.java:9 [error] The method setFirstName(String) is undefined for the type Customer
c.setFirstName("Joe");
  ^^^^^^^^^^^^
D:\git\MyAspectjTest\src\main\java\mattmck\testapp\Test.java:10 [error] The method setSurname(String) is undefined for the type Customer
c.setSurname("Smith");
  ^^^^^^^^^^
D:\git\MyAspectjTest\src\main\java\mattmck\testapp\Test.java:11 [error] The method setComments(String) is undefined for the type Customer
c.setComments("Some comments");
  ^^^^^^^^^^^
