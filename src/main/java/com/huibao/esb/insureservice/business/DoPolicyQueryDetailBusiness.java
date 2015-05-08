package com.huibao.esb.insureservice.business;

import com.huibao.esb.insureservice.connector.TiananQueryConnector;


public class DoPolicyQueryDetailBusiness {

	private TiananQueryConnector connector;
	
	public String baseDataQuery(String req) {
		return connector.doPolicyQueryDetail(req);
	}
	
	public TiananQueryConnector getConnector() {
		return connector;
	}

	public void setConnector(TiananQueryConnector connector) {
		this.connector = connector;
	}
}
