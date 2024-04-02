package xyz.solidnetwork.service;

public class Resource {
    private String data;

    public Resource() {
        super();
        data = "resource data";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Resource [data=" + data + "]";
    }

}
