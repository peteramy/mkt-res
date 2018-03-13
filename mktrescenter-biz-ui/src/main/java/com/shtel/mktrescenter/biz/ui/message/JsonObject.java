package com.shtel.mktrescenter.biz.ui.message;

import java.io.Serializable;

public class JsonObject<T> implements Serializable {
    public static final String typeRefresh = "refresh";
    public static final String typeAlert = "alert";
    public static final String typeUpdater = "updater";
    public static final String typeDialog = "dialog";
    public static final String typeData = "data";
    public static final String typeRedirect = "redirect";
    private String type;
    private T data;
    private boolean isSuccess;
    private String message;

    public static JsonObject refresh() {
        return new JsonObject("refresh", "");
    }

    public static JsonObject updater(String html) {
        return new JsonObject("updater", html);
    }

    public static JsonObject<String> success() {
        return new JsonObject("data", "", true, "");
    }

    public static <T> JsonObject<T> success(T data) {
        return new JsonObject("data", data, true, "");
    }

    public static JsonObject<String> error(String message) {
        return new JsonObject("dialog", message, false, message);
    }

    public static JsonObject<String> redirect(String url) {
        return new JsonObject("redirect", url);
    }

    public static JsonObject alert(String message) {
        return new JsonObject("alert", message);
    }

    public JsonObject(String type, T data) {
        this(type, data, true, "");
    }

    public JsonObject(String type, T data, boolean success, String message) {
        this.isSuccess = true;
        this.type = type;
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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
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

    public static JsonObject reload() {
        return new JsonObject("reload", "");
    }
}
