package cn.com.tontron.res.ui.message;

import java.io.Serializable;

public class JsonObject<T> implements Serializable {
    private T data;
    private boolean isSuccess;
    private String message;

    public static JsonObject<String> success() {
        return new JsonObject("", true, "");
    }

    public static <T> JsonObject<T> success(T data) {
        return new JsonObject(data, true, "");
    }

    public static JsonObject<String> error(String message) {
        return new JsonObject(message, false, message);
    }

    public JsonObject(T data, boolean success, String message) {
        this.isSuccess = true;
        this.data = data;
        this.isSuccess = success;
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
