# community

## 项目介绍

本项目根据牛客网推出的项目实战课程https://www.nowcoder.com/courses/semester/senior所实现

## 项目运行方式

1. 安装redis并启动

2. 安装Kafka 

   windows下用cmd进入kafka安装目录后输入如下指令启动

   ```shell
   bin\windows\zookeeper-server-start.bat config\zookeeper.properties 
   ```

3. 安装elasticsearch-7.9.3，es版本不同有可能会报错，并安装ik中文分词器插件，然后双击bin目录下的elasticsearch.bat启动
4. 将项目导入idea中启动，打开浏览器输入localhost:8080/community即可访问



测试账号：niuke

密码：123

如果要测试注册功能，将application.properties中的spring.mail.username和password改为自己的即可

若页面显示不全或者鼠标点击无法触发js事件，则可能有的js文件未加载，打开vpn再次刷新即可

