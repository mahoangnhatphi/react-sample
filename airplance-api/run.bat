IF EXIST "./amazon-corretto-11-x64-windows-jdk.zip" (
    echo 'JDK has been downloaded'
) ELSE (
    curl -LO https://corretto.aws/downloads/latest/amazon-corretto-11-x64-windows-jdk.zip
)
unzip ./amazon-corretto-11-x64-windows-jdk.zip
set JAVA_HOME=./amazon-corretto-11-x64-windows-jdk
set PATH=%PATH%;%JAVA_HOME%\bin
echo %PATH%