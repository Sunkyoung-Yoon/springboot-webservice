#!/usr/bin/env bash

ABSPATH=$(readlink -f $0)
ABSDIR=$(dirname $ABSPATH) # 현재 stop.sh가 속해있는 경로를 찾는다
source ${ABSDIR}/profile.sh # 자바로 보면 import 구문에 해당, 이 코드로 profile.sh의 여러 function 사용 가능

IDLE_PORT=$(find_idle_port)

echo "> $IDLE_PORT 에서 구동중인 어플리케이션 pid 확인"
IDLE_PID=$(lsof -ti tcp:${IDLE_PORT})

if [ -z ${IDLE_PORT} ]
then
  echo "> 현재 구동중인 어플리케이션이 없으므로 종료하지 않습니다."
else
  echo "> kill -15 $IDLE_PID" # Nginx에 연결되어 있지는 않지만 현재 실행 중인 jar Kill
  kill 15 ${IDLE_PID}
  sleep 5
fi