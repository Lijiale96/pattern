package com.bjsxt.facade;

/**
 * 办理注册公司流程的门面对象
 *
 */
public class RegisterFacade {
public void register(){
    工商局 a = new 江阴工商局();
    a.checkName();
    质检局 b = new 江阴质检局();
    b.orgCodeCertificate();
    税务局 c = new 江阴税务局();
    c.taxCertificate();
    银行 d = new 中国银行();
    d.openAccount();
    }
}

