package com.utp.alg.est.model.dao;

import com.utp.alg.est.model.Usuario;

/**
 *
 * @author
 */
public interface LoginDao {
    
    public Usuario validateLogin(String dni, String password);
}
