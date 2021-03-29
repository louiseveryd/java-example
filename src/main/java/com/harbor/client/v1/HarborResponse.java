package com.harbor.client.v1;

import lombok.Data;

/**
 * @author lr
 * @date 2021/2/22
 */
@Data
public class HarborResponse<T> {

    private int status;

    private String body;

//    private String msg;
//
//    public HarborResponse(int status, String msg) {
//        this.status = status;
//        this.msg = msg;
//    }

    public HarborResponse(int status) {
        this.status = status;
    }

    public HarborResponse(int status, String body) {
        this.status = status;
        this.body = body;
    }

    public boolean success() {
        return !(status < 200 || status >= 300);
    }



//    public static Builder status(int status) {
//        return new Builder(status);
//    }
//
//    static class Builder {
//        private int status;
//
//        private T body;
//
//        public Builder(int status) {
//            this.status = status;
//        }
//        public <T> HarborResponse<T> body(T body) {
//            return new HarborResponse<>(status, body);
//        }
//    }
}
