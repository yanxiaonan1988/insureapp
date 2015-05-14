/**
 * 2008-6-11
 */
package insureapp;

import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;

import org.apache.commons.codec.binary.Base64;

/**
 * RSA安全编码组件
 * 
 * @author 梁栋
 * @version 1.0
 */
public abstract class RSACoder {

	/**
	 * 非对称加密密钥算法
	 */
	public static final String KEY_ALGORITHM = "RSA";

	/**
	 * 公钥
	 */
	private static final String PUBLIC_KEY = "RSAPublicKey";

	/**
	 * 私钥
	 */
	private static final String PRIVATE_KEY = "RSAPrivateKey";

	/**
	 * RSA密钥长度 
	 * 默认1024位，
	 * 密钥长度必须是64的倍数， 
	 * 范围在512至65536位之间。
	 */
	private static final int KEY_SIZE = 512;

	/**
	 * 私钥解密
	 * 
	 * @param data
	 *            待解密数据
	 * @param key
	 *            私钥
	 * @return byte[] 解密数据
	 * @throws Exception
	 */
	public static byte[] decryptByPrivateKey(byte[] data, byte[] key)
			throws Exception {

		// 取得私钥
		PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(key);

		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);

		// 生成私钥
		PrivateKey privateKey = keyFactory.generatePrivate(pkcs8KeySpec);

		// 对数据解密
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());

		cipher.init(Cipher.DECRYPT_MODE, privateKey);

		return cipher.doFinal(data);
	}

	/**
	 * 公钥解密
	 * 
	 * @param data
	 *            待解密数据
	 * @param key
	 *            公钥
	 * @return byte[] 解密数据
	 * @throws Exception
	 */
	public static byte[] decryptByPublicKey(byte[] data, byte[] key)
			throws Exception {

		// 取得公钥
		X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(key);

		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);

		// 生成公钥
		PublicKey publicKey = keyFactory.generatePublic(x509KeySpec);

		// 对数据解密
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());

		cipher.init(Cipher.DECRYPT_MODE, publicKey);

		return cipher.doFinal(data);
	}

	/**
	 * 公钥加密
	 * 
	 * @param data
	 *            待加密数据
	 * @param key
	 *            公钥
	 * @return byte[] 加密数据
	 * @throws Exception
	 */
	public static byte[] encryptByPublicKey(byte[] data, byte[] key)
			throws Exception {

		// 取得公钥
		X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(key);

		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);

		PublicKey publicKey = keyFactory.generatePublic(x509KeySpec);

		// 对数据加密
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());

		cipher.init(Cipher.ENCRYPT_MODE, publicKey);

		return cipher.doFinal(data);
	}

	/**
	 * 私钥加密
	 * 
	 * @param data
	 *            待加密数据
	 * @param key
	 *            私钥
	 * @return byte[] 加密数据
	 * @throws Exception
	 */
	public static byte[] encryptByPrivateKey(byte[] data, byte[] key)
			throws Exception {

		// 取得私钥
		PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(key);

		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);

		// 生成私钥
		PrivateKey privateKey = keyFactory.generatePrivate(pkcs8KeySpec);

		// 对数据加密
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());

		cipher.init(Cipher.ENCRYPT_MODE, privateKey);

		return cipher.doFinal(data);
	}
	
	//sign with MD5withRSA 
	public static byte[] signMD5withRSA(byte[] data, byte[] key)
			throws Exception {

		// 取得私钥
		PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(key);

		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);

		// 生成私钥
		PrivateKey privateKey = keyFactory.generatePrivate(pkcs8KeySpec);

		// sign with MD5withRSA by private key
		java.security.Signature signet = java.security.Signature.getInstance("MD5withRSA");
		signet.initSign(privateKey);
		signet.update(data);
		byte[] signed = signet.sign();
		return signed;
	}
	
	//verify with MD5withRSA 
		public static boolean verifyMD5withRSA(byte[] data, byte[] key)
				throws Exception {

			// get public key
			java.security.spec.X509EncodedKeySpec bobPubKeySpec = new java.security.spec.X509EncodedKeySpec(key);

			KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);

			// generate public key
			PublicKey publicKey = keyFactory.generatePublic(bobPubKeySpec);

			// sign with MD5withRSA by private key
			java.security.Signature signatureChecker = java.security.Signature.getInstance("MD5withRSA");
			signatureChecker.initVerify(publicKey);
			signatureChecker.update(data);
			if(signatureChecker.verify(data)){
				return true;
			}else{
				return false;
			}
		}
	

	/**
	 * 取得私钥
	 * 
	 * @param keyMap
	 *            密钥Map
	 * @return byte[] 私钥
	 * @throws Exception
	 */
	public static byte[] getPrivateKey(Map<String, Object> keyMap)
			throws Exception {

		Key key = (Key) keyMap.get(PRIVATE_KEY);

		return key.getEncoded();
	}

	/**
	 * 取得公钥
	 * 
	 * @param keyMap
	 *            密钥Map
	 * @return byte[] 公钥
	 * @throws Exception
	 */
	public static byte[] getPublicKey(Map<String, Object> keyMap)
			throws Exception {

		Key key = (Key) keyMap.get(PUBLIC_KEY);

		return key.getEncoded();
	}

	/**
	 * 初始化密钥
	 * 
	 * @return Map 密钥Map
	 * @throws Exception
	 */
	public static Map<String, Object> initKey() throws Exception {

		// 实例化密钥对生成器
		KeyPairGenerator keyPairGen = KeyPairGenerator
				.getInstance(KEY_ALGORITHM);

		// 初始化密钥对生成器
		keyPairGen.initialize(KEY_SIZE);

		// 生成密钥对
		KeyPair keyPair = keyPairGen.generateKeyPair();

		// 公钥
		RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();

		// 私钥
		RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();

		// 封装密钥
		Map<String, Object> keyMap = new HashMap<String, Object>(2);

		keyMap.put(PUBLIC_KEY, publicKey);
		keyMap.put(PRIVATE_KEY, privateKey);

		return keyMap;
	}
	
	public static byte[] getImposedPublicKey()
			throws Exception {

//		String pubKeyString = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAIflMfMr9+NnnXvhLlPUK6IIHOjpkuInBFA9LgiQfa4x8BUY5TAhWsPj81S5sIukgx19Z9HzG3HCg4W/N+8g9/kCAwEAAQ==";
		String pubKeyString = "";
		
		
		return Base64.decodeBase64(pubKeyString);
	}
	
	public static byte[] getImposedPrivateKey()
			throws Exception {

//		String privateKeyString = "MIIBVgIBADANBgkqhkiG9w0BAQEFAASCAUAwggE8AgEAAkEAh+Ux8yv342ede+EuU9Qroggc6OmS4icEUD0uCJB9rjHwFRjlMCFaw+PzVLmwi6SDHX1n0fMbccKDhb837yD3+QIDAQABAkEAh99bH91YTmBtD01IOryqm6ks7puLJt8H6wogmqONZbo7fk8m86j4GFXswxbn5gGBXEQE63l/3J3bpwNszsCdAQIhAPAJcWyfTu1kKPRzsUX7UctbEtQRQiYEdQvBycHr7hRxAiEAkO7FsnxFtB8wdF6bp1PI8wL1uACdCU/2mhptwuQGQAkCIF1+4B42IzEWPVmSIq+mh6KU882Ed2aFf+23atXNBuwRAiEAhF+xbe4XdAawqPjoThI2jc58Q4074Q+J+wJ8ke7WzpECIQCVQ9YiXxpKBn+mh1RYNNwrfLPEjqFQ1sUdfk1ZDenCDA==";
		String privateKeyString = "";
		
		return Base64.decodeBase64(privateKeyString);
	}
}
