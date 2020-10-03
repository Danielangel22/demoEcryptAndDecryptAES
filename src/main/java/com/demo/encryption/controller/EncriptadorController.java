package com.demo.encryption.controller;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.encryption.model.ParametrosEncry;
import com.demo.encryption.service.EncriptadorAES;

@RestController
public class EncriptadorController {

	@Autowired
	private EncriptadorAES cry;

	@PostMapping("/Encry")
	public String Encriptar(@RequestBody ParametrosEncry param) throws InvalidKeyException, UnsupportedEncodingException,
			NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
		return cry.encriptar(param);
	}
	@PostMapping("/Decry")
	public String Desencriptar(@RequestBody ParametrosEncry param) throws InvalidKeyException, UnsupportedEncodingException,
			NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
		return cry.desencriptar(param);
	}
	
}
