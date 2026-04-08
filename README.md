# java2JAVA2 학습 정리
202330107 김세훈

## 6주차(26.04.08)
배열의 크기, length 필드
# 자바의 배열은 객체로 처리
# 배열의 크기는 배열의 객체의 length 필드에 저장
int intArray[];
intArray = new int[5];

int size = intArray.length;
//size는 5
*length 필드를 이용하여 배열의 모든 값을 출력하는 사례 
for(int i=0; i<intArray.length; i++) // intArray 배열 크기만큼 루프를 돈다.
    System.out.println(intArray[i]);

# 배열과 for-each문
for-each문 : 배열이나 나열의 원소를 순차 접근하는데 유용한 for 문
for-each문으로 정수 배열의 합을 구하는 사례
int [] n = {1,2,3,4,5};
int sum = 0;
for (int k : n) {
        sum += k;}

# 2차원 배열 
2차원 배열 선언
ont intArray[][]; 또는 int[][] intArray;
2차원 배열 생성
intArray = new int[2][5];   ,   int intArray[] = new int[2][5]; // 배열 선언과 생성 동시
2차원 배열의 구조 
int i[][] = new int[2][5];
int size1 = 1.length; //2
int size2 = i[0].iength; //5
int size3 = i[1].length; //5
2차원이 배열의 length 필드
i.length > 2차원 배열의 행의 개수로,2
i[n].length > n번째 행의 열의 개수
i[1].length > 1번째 행의 열의 개수, 5

#2차원 배열의 초기화 
배열 선언과 동시에 초기화

예제 3-10
2차원 배열에 학년별로 1,2 학기 성적을 저장하고, 4년 전체 평점 평균을 출력하라.

#매소드의 배열 리턴
배열의 레퍼런스만 리턴되며, 배열 전체가 리턴되는 것이 아님
메소드의 리턴 타입
-리턴하는 배열 타입과 리턴 받는 배열 타입 일치
-리턴 타입에 배열의 크기를 지정하지 않음

int[] makeArray() {
    int temp[] = new int[4];
    return temp;}
    

## 4주차 - Java 심화 개념
# 메모리 구조
Heap : 객체 저장 영역
Stack : 변수 및 함수 실행 영역
# 자료형
# 기본 타입
boolean, char, byte, short, int, long, float, double
# 참조 타입
클래스, 배열, 인터페이스 등
# 변수와 상수
변수 : 값 변경 가능
상수 : final 사용, 값 변경 불가
# 출력 방법
System.out.print() : 줄바꿈 없음
System.out.println() : 줄바꿈 있음
System.out.printf() : 형식 지정 출력
# 타입 변환
# 자동 변환
작은 타입 → 큰 타입
# 강제 변환
(int) 3.14

# 입력 처리
# System.in
기본 입력 스트림
# Scanner
다양한 자료형 입력 가능
# 연산자
산술 : + - * / %
비교 : > < == !=
논리 : && || !
# 실습 코드 개요
# Foo.java
메서드 정의 및 호출
# Bar.java
상수 사용 및 계산
# Hun.java
형변환 확인
# Boo.java
입력 처리 실습
## 전체 요약
Git을 이용한 버전 관리 방법 학습
Java 기본 구조 및 실행 방식 이해
자료형, 연산, 입출력 개념 학습
간단한 코드 실습 진행

## 3주차 - Java 기초 이론
## 프로그래밍 언어 개요
컴퓨터에게 작업을 지시하기 위한 언어
컴퓨터는 0과 1로 구성된 기계어만 이해함
## 절차 지향 vs 객체 지향
## 절차 지향 언어
순차적인 실행 구조
데이터와 기능이 분리됨
예: C, Pascal
## 객체 지향 언어
객체 중심 구조
데이터와 기능을 하나로 묶음
예: Java, Python, C++
# 컴파일 과정
사람이 작성한 코드를 컴퓨터가 이해할 수 있도록 변환
Java: .java → .class
# Java의 특징
플랫폼 독립성 (JVM 기반)
객체 지향 지원
자동 메모리 관리
다양한 라이브러리 제공
## JDK와 JRE
# JDK
개발 도구 + 실행 환경 포함
# JRE
Java 프로그램 실행 환경
## 주요 실행 도구
javac : Java 코드 컴파일
java : 프로그램 실행
javadoc : 문서 생성
jar : 파일 압축 및 관리

## 2주차 - Git 및 GitHub 기초
## Git 주요 개념
## Repository
프로젝트 파일과 변경 이력을 함께 저장하는 공간
코드 버전 관리의 기본 단위
## Branch
기존 코드와 분리된 작업 공간
기능 개발이나 테스트 시 사용
## Git 초기 설정 및 기본 명령어
## 저장소 생성
git init

현재 디렉토리를 Git 저장소로 설정 했습니다
## 파일 추가
git add 파일명

특정 파일만 선택적으로 추가
git add .

모든 변경 파일을 한 번에 추가
## 커밋 생성
git commit -m "설명"

변경 내용을 기록으로 저장
## 원격 저장소 사용
## 저장소 복제
git clone 저장소주소

원격 저장소를 내 컴퓨터로 복사
## 원격 저장소 연결
git remote add origin 저장소주소

로컬 저장소와 GitHub 연결
## 업로드
git push -u origin main

변경 내용을 원격 저장소에 업로드
## 브랜치 및 사용자 설정
## 기본 브랜치 변경
git branch -M main

## 사용자 정보 설정
git config --global user.name "이름" git config --global user.email "이메일"

프로젝트별 설정 시 --global 제거
## 수정 후 업로드 과정
git add . git commit -m "수정 내용" git push

## Markdown 기본 문법
## : 제목 작성
: 목록 생성
--- : 구분선
코드 : 한 줄 코드 강조

