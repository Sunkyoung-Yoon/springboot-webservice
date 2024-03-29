#!/usr/bin/env bash

# 쉬고 있는 profile 찾기: real1이 사용 중이면 real2가 쉬고 있고, real2가 실행 중이면 real1이 쉬고 있음
function find_idle_profile()
{
# 현재 엔진엑스가 바라보고 있는 스프링부트가 정상적으로 수행 중인지 확인
 RESPONSE_CODE=$(curl -s -o /dev/null -w "%{http_code}" http://localhost/profile)

 if [ ${RESPONSE_CODE} -ge 400 ] # 400보다 크면 -> 40x, 50x 에러 포함

 then
   CURRENT_PROFILE=real2
 else
   CURRENT_PROFILE=$(curl -s http://localhost/profile)
 fi

 if [ ${CURRENT_PROFILE} == real1 ]
 # 엔진엑스와 연결되어 있지 않은 profile
 then
   IDLE_PROFILE=real2
 else
   IDLE_PROFILE=real1
 fi
# bash라는 스크립트는 값을 반환하는 기능x -> 제일 마지막 줄에 echo로 결과 출력, 클라이언트가 그 값을 잡아서 사용
 echo "${IDLE_PROFILE}"
}

# 쉬고 있는 profile의 port 찾기
function find_idle_port()
{
  IDLE_PROFILE=$(find_idle_profile)

  if [ ${IDLE_PROFILE} == real1 ]
  then
    echo "8081"
  else
    echo "8082"
  fi
}