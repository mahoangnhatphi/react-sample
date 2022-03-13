use window command line (Ctrl + R, cmd)
1. Run cmd:
```
curl -o amazon-corretto-11.zip https://corretto.aws/downloads/resources/11.0.14.10.1/amazon-corretto-11.0.14.10.1-windows-x64-jdk.zip
```
2. Extract amazon-corretto-11.zip by cmd `tar -xf amazon-corretto-11.zip`
3. Set JAVA_HOME by cmd `set JAVA_HOME=%CD%\jdk11.0.14_10`
4. Set PATH by cmd `set PATH=%PATH%;%JAVA_HOME%\bin`
5. Run cmd `gradlew bootRun`
6. Check your api application is running