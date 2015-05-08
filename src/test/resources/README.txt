#use following command to run test
node mainTest.js
#use following command to generate tianan webservice client from wsdl
d:\dev\apache-cxf-2.4.4\bin\wsdl2java.bat -p com.huibao.esb.insureservice.client.tianan -frontend jaxws21 http://180.168.131.15/netsalesServicedev/doCarProposalSave?wsdl

#use following command to generate tianan query webservice client from wsdl
d:\dev\apache-cxf-2.4.4\bin\wsdl2java.bat -p com.huibao.esb.insureservice.client.tiananquery -frontend jaxws21 http://180.168.131.15/netsalesService/doPolicyQueryDetail?wsdl