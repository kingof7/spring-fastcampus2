package com.company.ioc2;

public class Main {

    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        //Base64Encoder encoder = new Base64Encoder();

        // DI : new로 주입 : ()안에만 건들여주면 되서, 생성자 클래스를 직접건들필요가 없음
        //Encoder encoder = new Encoder(new Base64Encoder()); // base64로 인코딩
        Encoder encoder = new Encoder(new UrlEncoder()); // utf-8로 인코딩

        String result = encoder.encode(url);
        System.out.println(result);

        //IEncoder urlEncoder = new UrlEncoder();
        //String urlResult = urlEncoder.encode(url);

        // System.out.println(url); // 그냥 주소만나옴

    }
}
