package com.i9sites.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	public PasswordUtils(){
	}
	
	public static String gerarBCrypty(String senha){
		if(senha == null){
			return senha;
		}
		log.info("Gerando Hash com o BCrypt");
		BCryptPasswordEncoder bCryptEnconder = new BCryptPasswordEncoder();
		return bCryptEnconder.encode(senha);
	}

}
