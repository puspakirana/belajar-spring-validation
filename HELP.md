# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.example.belajar-spring-validation' is invalid and this project uses 'com.example.belajar_spring_validation' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.10/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.10/maven-plugin/build-image.html)
* [Validation](https://docs.spring.io/spring-boot/3.3.10/reference/io/validation.html)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/3.3.10/specification/configuration-metadata/annotation-processor.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Validation](https://spring.io/guides/gs/validating-form-input/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

