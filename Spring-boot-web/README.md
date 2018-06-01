
#Spring-boot-web
--------

```
git clone https://github.com/linuxhub/JavaDemo.git
cd JavaDemo/Spring-boot-web
mvn clean package
java -jar target/myweb-0.0.1-SNAPSHOT.jar
```


```
curl http://127.0.0.1:8080/user2/list
[{"id":0,"name":"泽泽0","age":25,"address":"中国广州"},{"id":1,"name":"泽泽1","age":26,"address":"中国广州"},{"id":2,"name":"泽泽2","age":27,"address":"中国广州"}]

curl http://127.0.0.1:8080/user2/3
{"id":3,"name":"泽泽","age":25,"address":"中国广州"}

```

```
curl http://127.0.0.1:8080/user1/list
curl http://127.0.0.1:8080/user1/1

```
