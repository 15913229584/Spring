package edu.nf.ch01.factory;

import edu.nf.ch01.Users;

/**
 * @author 沧海归心心不眠
 * @date 2020/11/30 0030
 */
public class UserFactory {
    public static Users create()
    {
        return new Users();
    }
}
