# spring

spring体系结构：

Data Access/Integration                         Web

JDBC    ORM                            WebSocket    Servlet

OXM     JMS                             Web                Protlet

Transactions



AOP    Aspects    Instrumentation     Messaging

​							Core Container

Beans            Core           Context             Spel



​									Test

spring开发步骤

1. 导入坐标
2. 创建Bean
3. 创建applicationContext.xml
4. 在配置文件中进行配置
5. 创建applicationContext对象getBean

Bean标签范围配置

* scope:指定对象的作用范围，取值如下：
	* singleton：默认值，单例的
		* Bean的实例化个数：1个
		* Bean的实例化时机：当Spring核心文件被加载进时，实例化配置的Bean实例
		* Bean的生命周期
			* 对象创建：当应用加载，容器创建时，对象就被创建了
			* 对象运行：只要容器在，对象一直存活
			* 对象销毁：当应用卸载，销毁容器时，对象就被销毁了
	* prototype：多例的
		* Bean的实例化个数：多个
		* Bean的实例化时机：当调用getBean()方法时实例化Bean实例
		* Bean的生命周期
			* 对象创建：当使用对象时，创建新的对象实例化
			* 对象运行：只要对象在使用中，就一直活着
			* 对象销毁：当对象长时间不用时，被java的垃圾回收器回收了
	* request：WEB项目中，spring创建一个Bean的对象，将对象存入到request域中
	* session：WEB项目中，spring创建一个Bean的对象，将对象存入到session域中
	* global session：WEB项目中，应用在Porlet环境，如果没有Porlet环境那么globalSession相当于session

Bean生命周期配置

init-method：指定类中的初始化方法名称

destroy-method：指定类中销毁方法的名称

Bean实例化三种方式

* 无参构造方法实例化
* 工厂静态方法实例化
* 工厂实例方法实例化

Bean的依赖注入概念

* 依赖注入（Dependency Injection）：它是spring框架核心IOC的具体实现。

* IOC解耦只是降低他们的依赖关系，但不会消除。例如：业务层仍会调用持久层的方法。

* 怎么将UserDao注入到UserService内部呢？

	* 构造方法

		```xml
		    <!--构造方法注入-->
		    <bean id="userService" class="com.xian.spring.service.UserServiceImpl">
		        <constructor-arg name="userDao" ref="userDao"/>
		    </bean>
		```

	* set方法

		P命名空间注入本质也是set方法注入，但比起上述的set方法注入更加方便，主要体现在配置文件中，如下：
		首先，需要引入P命名空间：

		```xml
		xmlns:p="http://www.springframework.org/schema/p"
		```

		其次，需要修改注入方式

		```xml
		<!--set方法注入-->
		<bean id="userService" class="com.xian.spring.service.UserServiceImpl" p:userDao-ref="userDao"/>
		```

Bean的依赖注入的数据类型

上面的操作，都是注入的引用Bean，除了对象的引用可以注入，普通数据类型，集合等都可以在容器中进行注入。

引入其他配置文件（分模块开发）

Spring的配置内容非常多，这就导致Spring配置很繁琐且体积很大，所有，可以将部分配置拆解到其他配置文件中，而在Spring主配置文件通过import标签进行加载

```xml
<import resource="applicationContext-xxx.xml"/>
```