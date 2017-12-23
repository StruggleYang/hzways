echo "stop application"
PID=$(ps -ef | grep hzwasy-v1.jar | grep -v grep | awk '{ print $2 }')
if [ -z "$PID" ];then
echo "Application is already stopped"
else
echo "kill $PID"
kill $PID
echo "application stopped !!"
fi
echo "start application"
java -jar hzways-v1.jar > log.log 2>&1 &
