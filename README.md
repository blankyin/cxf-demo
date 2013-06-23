项目名称：
=================================================
cxf-demo

1. 该项目主要为学习使用CXF时所写的测试代码，包含cxf-spring（Server）和cxf-client（Client）；
2. CXF使用的是当前最新版本2.7.5，测试使用JDK 1.6；
3. 项目都使用Maven创建，便于jar包管理；
4. 使用内置的Jetty服务器；
5. 有使用WSS4j进行安全认证测试。


cxf-spring说明：
=================================================
1. com.blankyin.cxf.HelloWorld 中包含3个接口，主要用于测试基本数据类型，List和JavaBean以及CXF无法直接进行处理的Map；
2. com.blankyin.interceptor.AuthInterceptor 是自定义的权限拦截器，主要通过header头消息进行权限验证；
3. 项目有使用WSS4j进行安全认证测试（com.blankyin.handler.ServerPasswordCallback），此处需要注意的是：<br>
	1) WSS4j从1.6的版本后对password的获取有调整，直接调用pc.getPassword()方法将返回null；<br>
	2) 解决方法：可以根据identifier到数据库查询对应的密码，然后调用pc.setPassword(XXXX)传入查询到的密码，即：pc.setPassword(db.getPassword(identifier))；<br>
	3) WSS4j会验证传入的密码和数据库中的密码是否一致；<br>
	4) 官方变更说明：http://coheigea.blogspot.com/2011/02/usernametoken-processing-changes-in.html；<br>
	5) WSS4j官方API文档：http://ws.apache.org/wss4j/apidocs/ 。


cxf-spring服务端启动方法：
=================================================
1. 进入cxf-spring目录；
2. 执行eclipse.bat；
3. 执行jetty_run.bat，启动Jetty服务器；
4. 访问http://localhost:8080/cxf_spring/ws/HelloWorld?wsdl，即可看到WSDL文件


cxf-client客户端调用方法：
=================================================
1. 先启动cxf-spring中的Jetty服务器；
2. 找到SpringClient.java即可调用执行。<br>
备注：cxf-client中有通过使用wsdl2java命令自动生成代码。