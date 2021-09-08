
## 项目说明

本音乐网站的客户端和管理端使用 **VUE** 框架来实现，服务端使用 **Spring Boot + MyBatis** 来实现，数据库使用了 **MySQL**。项目启动方法看文章末尾。


## 技术栈

### 后端

**SpringBoot + MyBatis-plus + MongoDB**

### 前端

**Vue + Vue-Router + Vuex + Axios +  ElementUI**

<br/>

## 开发环境

JDK： jdk-8u141

mysql：mysql-5.7.21-1-macos10.13-x86_64

node：v12.4.0

IDE：IntelliJ IDEA 2018、VSCode

<br/>

## 下载运行

#### 1、下载项目到本地
git clone https://github.com/Yin-Hongwei/music-website.git


#### 2、下载数据库中记录的资源

去【链接: https://pan.baidu.com/s/1Qv0ohAIPeTthPK_CDwpfWg 提取码: gwa4 】下载网站依赖的歌曲及图片，将 data 夹里的文件放到 music-server 文件夹下。


#### 3、修改配置文件
1）创建数据库
将 `music-website/music-server/sql` 文件夹中的 `tp_music.sql` 文件导入数据库。

2）修改用户名密码
修改 `music-website/music-server/src/main/resources/application.properties` 文件里的 `spring.datasource.username` 和 `spring.datasource.password`；

3）修改资源路径

修改 `music-server/src/main/java/com/example/yin/constant/Constants.java` 文件中的 `RESOURCE_PATH`，**否则资源加载不了**。

![](https://tva1.sinaimg.cn/large/008i3skNly1gske6w6kk8j33aq0u0wn2.jpg)

#### 4、启动项目

- **启动管理端**：进入 music-server 文件夹，运行下面命令启动服务器

```js
// 方法一
./mvnw spring-boot:run

// 方法二
mvn spring-boot:run // 前提装了 maven
```

- **启动客户端**：进入 music-client 目录，运行下面命令

```js
npm install // 安装依赖

npm run dev // 启动前台项目
```

- **启动管理端**：进入 music-manage 目录，运行下面命令

```js
npm install // 安装依赖

npm run dev // 启动后台管理项目
```

