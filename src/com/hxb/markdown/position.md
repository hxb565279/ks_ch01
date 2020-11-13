##1.简述Spring框架的优点?
<ol>
<li>非侵入式设计：Spring是一种非侵入式（non-invasive）框架，它可以使应用程序代码对框架的依赖最小化</li>
<li>方便解耦,简化开发:Spring就是一个大工厂,可以将所有对象的创建和依赖关系的维护工作都交给Spring容量管理,大大降低了组件的耦合性</li>
<li>支持AOP：Spring提供了对AOP的支持，它允许将一些通用任务，如安全、事务、日志等进行集中式处理，从而提高了程序的复用性</li>
<li>支持声明式事务处理：只需要通过配置就可以完成对事务的管理，而无需手动编程。</li>
<li>方便程序的测试：Spring提供了对Junit4的支持，可以通过注解方便的测试Spring程序。</li>
<li>降低了Java EE API的使用难度：Spring对Java EE开发中非常难用的一些API（如：JDBC、JavaMail等），都提供了封装，使这些API应用难度大大降低</li>
</ol>


##2.请简述什么是spring的IOC和 DI?
<ul>
IoC的全称是Inversion of Control，中文名称为控制反转。控制反转就是指在使用Spring框架之后，对象的实例不再由调用者来创建，而是由Spring容器来创建，Spring容器会负责控制程序之间的关系，而不是由调用者的程序代码直接控制。这样，控制权由应用代码转移到了Spring容器，控制权发生了反转</li>
<li></li>

</ul>DI的全称是Dependency Injection，中文称之为依赖注入。它与控制反转（IoC）的含义相同，只不过这两个称呼是从两个角度描述的同一个概念。从Spring容器的角度来看，Spring容器负责将被依赖对象赋值给调用者的成员变量，这相当于为调用者注入了它依赖的实例，这就是Spring的依赖注入。