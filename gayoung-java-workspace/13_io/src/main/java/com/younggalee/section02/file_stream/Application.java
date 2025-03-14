package com.younggalee.section02.file_stream;

public class Application {
    /*
    ## Stream ##
    1. 자바에서는 java.io 패키지에서  스트림 클래스들을 제공함 (계층구조로 되어있음)
    2. 특징
    1) 단방향 : 입력용 스트림과 출력용 스트림이 따로 존재함
    2) 선입선출 : FIFO, 먼저 전송한 데이터가 먼저 나감 >> delay 발생가능
    3. 구분
        - 출력 스트림 : 프로그램 >>>데이터 >>> 외부매체
        - 입력 스트림 : 프로그램 <<<데이터 <<< 외부매체

        통로사이즈
        - 바이트 스트림 : byte단위(1byte)로 데이터 전송 >> 출력(outputStream) /  입력(InputStream)
        - 문자 스트림 :  char단위 (2byte)로 데이터 전송 >> 출력 (Writer) / 입력(Reader)

        외부매체와 직접 연결 여부
        - 기본(기반) 스트림 : 외부매체와 직접 연결되는 스트림 (필수)
        - 보조(필터) 스트림 : 외부매체와 직접 연결되는 스트림x (선택)
                              기본 스트림에 추가로 사용되는 스트림 (보조역할 수행, 추가기능 제공)


     */
    public static void main(String[] args) {
        FileByteDao fbd = new FileByteDao();
        fbd.fileSave();
        fbd.fileRead();

    }
}


