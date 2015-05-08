package com.huibao.esb.insureservice.connector;

import java.net.MalformedURLException;
import java.net.URL;

import com.huibao.esb.insureservice.client.tianan.NoCarProposalSave;
import com.huibao.esb.insureservice.client.tianan.NoCarProposalSaveService;


public class TiananConnector {
	private String urlString;

	public String saveNoCarProposal(String req) {
		URL url = null;
		try {
			url = new URL(urlString);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		NoCarProposalSave client = new NoCarProposalSaveService(url).getNoCarProposalSavePort();
		return client.doCarProposalSave(req);
	}
	
	public String getUrlString() {
		return urlString;
	}

	public void setUrlString(String urlString) {
		this.urlString = urlString;
	}
}
