package com.company.ioc2;

import java.util.Base64;

public class Encoder {

    private IEncoder iEncoder;
    
    // 외부에있는 인터페이스 IEncoder를 주입받았기에 DI라고 함
    public Encoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
        //this.iEncoder = new Base64Encoder();
        //this.iEncoder = new UrlEncoder();
    }

    public String encode(String message) {
        return iEncoder.encode(message);
    }
}
