spring boot
--------

# jar包
```
git clone https://github.com/linuxhub/JavaDemo.git
cd JavaDemo/linuxhub
mvn clean package
java -jar target/linuxhub-1.0.jar
```

```
# war包
sed -i 's/<packaging>jar/<packaging>war/g' pom.xml

# jar包
sed -i 's/<packaging>war/<packaging>jar/g' pom.xml
```
