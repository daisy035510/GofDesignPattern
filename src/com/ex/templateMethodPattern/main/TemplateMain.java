package com.ex.templateMethodPattern.main;

import com.ex.templateMethodPattern.AbstConnectHelper;
import com.ex.templateMethodPattern.DefaultAbstConnectHelper;

/*
템플릿 메소드 -
알고리즘의 구조를 정의하고
하위 클래스에서 알고리즘 구조를 변경하지 않고 재정의 한다
 */
public class TemplateMain {

    public static void main(String[] args) {

        AbstConnectHelper helper = new DefaultAbstConnectHelper();
        helper.requestConnection("아이디 암호 접속 정보");
    }
}
