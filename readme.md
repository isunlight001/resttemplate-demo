本文是一个简单的spring-resttemplate的demo,里面有简单的增删改查.
如果想使用resttemplate的话,可以从这里git clone下项目!

**什么是REST？**

REST(RepresEntational State Transfer)资源表现层状态转化，是一种互联网软件架构，REST 定义了一组体系架构原则，开发者可以根据这些原则设计以系统资源为中心的 Web 服务，包括使用不同语言编写的客户端如何通过 HTTP 处理和传输资源状态。REST 结构清晰、符合标准、易于理解、扩展方便，得到了越来越多网站的采用。

**资源(Resources)**

网络中的一个实体，或者说是网络中一个具体信息，它可以是一段文本、一张图片、一首歌曲、一种服务，总之就是一个具体的存在。可以用一个 URI(统一资源定位符)指向它，每种资源对应一个特定的 URI。要获取这个资源，访问它的 URI 就可以，因此 URI 即为每一个资源的独一无二的识别符。

**表现层(Representation)**

把资源具体呈现出来的形式叫做它的表现层(Representation),比如，文本可以用 txt 格式表现，也可以用 HTML 格式、XML 格式、JSON 格式表现，甚至可以采用二进制格式。
.gitignore
**状态转化(State Transfer)**

每发出一个请求，就代表了客户端和服务器的一次交互过程。HTTP 协议是一个无状态协议，即所有的状态都保存在服务器端。因此，如果客户端想要操作服务器，必须通过某种手段，让服务器端发生“状态转化”(State Transfer)，而这种转化是建立在表现层之上的，也就是 “表现层状态转化”。

Web 服务本质上由各种资源组成的，使用 URI 来唯一标识这些资源，客户端将这些资源以某种表现形式，或表现状态展示给用户，如果用户在页面中指向其它资源的链接，则将访问该目标资源，并以某种表现状态来呈现它，这意味着客户端应用程序随着每个资源表现状态的不同而发生状态转移，这就是 REST。

**特点**

1、URL 更加简洁，将参数通过 URL 传到服务端。
非REST：http://localhost/findById?id=1
REST风格：http://localhost/findById/1

2、有利于不同系统之间的资源共享，只需要遵守规范，不需要做其他的配置就能达到资源共享。Restful 具体来讲就是四种表现形式，HTTP 协议中四个表示操作方式的动词：GET、POST、PUT、DELETE，分别对应四种基本操作：
GET 用来获取资源
POST 用来新建资源
PUT 用来修改资源
DELETE 用来删除资源

**什么是 RestTemplate？**
RestTemplate 是 Spring 框架提供的一个用于访问 REST 服务的组件，底层对 HTTP 请求及响应进行了封装，提供了很多访问远程REST服务的方法，可简化代码开发。
