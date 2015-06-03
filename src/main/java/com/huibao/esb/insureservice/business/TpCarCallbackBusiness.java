package com.huibao.esb.insureservice.business;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.codec.binary.Base64;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.huibao.esb.insureservice.util.RSACoder;

public class TpCarCallbackBusiness {
	
	public byte[] doBusiness(String xml) throws Exception {
//		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//		DocumentBuilder builder = factory.newDocumentBuilder();
//        // File file = new File("NewFile.xml");
//		InputSource is = new InputSource();  
//        is.setCharacterStream(new StringReader(xml));  
//        Document doc = builder.parse(is);
//
//        Element root = doc.getDocumentElement();
//        NodeList children = root.getElementsByTagName("Request");
//        String content = children.item(0).getTextContent();
//        System.out.println("before replace:");
//        System.out.println(content);
		
		byte[] publicKey = RSACoder.getImposedPublicKey();
		byte[] privateKey = RSACoder.getImposedPrivateKey();

		System.err.println("¹«Ô¿:\n" + Base64.encodeBase64String(publicKey));
		System.err.println("Ë½Ô¿:\n" + Base64.encodeBase64String(privateKey));
		
		
		int start = xml.indexOf("<Response>");
		int end = xml.indexOf("</Response>");
		String content = xml.substring(start, end+10);
		System.out.println(content);
		byte[] signedData = RSACoder.signMD5withRSA(content.getBytes("GBK"), privateKey);
		String signedToken = Base64.encodeBase64URLSafeString(signedData);
		System.out.println(signedToken);
		
		start = xml.indexOf("</Package>");
		
		xml = xml.subSequence(0, start)+"<Sign>"+signedToken+"</Sign>"+xml.subSequence(start, xml.length());
		
        return xml.getBytes();
	}
	
}
