package com.huibao.esb.insureservice.connector;

import java.net.MalformedURLException;
import java.net.URL;

import com.huibao.esb.insureservice.client.tiananquery.NoPolicyQueryDetail;
import com.huibao.esb.insureservice.client.tiananquery.NoPolicyQueryDetailService;

public class TiananQueryConnector {
	private String urlString;

	public String doPolicyQueryDetail(String req) {
		URL url = null;
		try {
			url = new URL(urlString);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		NoPolicyQueryDetail client = new NoPolicyQueryDetailService(url).getNoPolicyQueryDetailPort();
		return client.doPolicyQueryDetail(req);
	}
	
	public String getUrlString() {
		return urlString;
	}

	public void setUrlString(String urlString) {
		this.urlString = urlString;
	}
}
