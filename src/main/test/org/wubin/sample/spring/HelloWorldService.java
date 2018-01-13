package org.wubin.sample.spring;

/**
 * @author wubin
 * @date 2018/01/05
 **/
public class HelloWorldService {

    private String text;

    public void helloWorld() {
        System.out.println(text);
    }

    public void setText(String text) {
        this.text = text;
    }
}
