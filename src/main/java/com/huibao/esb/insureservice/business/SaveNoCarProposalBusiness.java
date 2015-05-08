package com.huibao.esb.insureservice.business;

import com.huibao.esb.insureservice.connector.TiananConnector;

public class SaveNoCarProposalBusiness {

	private TiananConnector connector;
	
	public String baseDataQuery(String req) {
		System.out.println(req);
		return connector.saveNoCarProposal(req);
	}
	
	public TiananConnector getConnector() {
		return connector;
	}

	public void setConnector(TiananConnector connector) {
		this.connector = connector;
	}
}
