var restClient = require('./restClient');
var tpRestClient = require('./tpRestClient');
var extend = require('util')._extend;

restClient.config({});
tpRestClient.config({});

var saveNoCarProposalReq = {};

saveNoCarProposalReq.tXInsuranceRequest = {};
saveNoCarProposalReq.tXInsuranceRequest.transExeDate = '2015-03-04';
saveNoCarProposalReq.tXInsuranceRequest.transExeTime = '13:05:00';
saveNoCarProposalReq.tXInsuranceRequest.transType = '1';
saveNoCarProposalReq.tXInsuranceRequest.IInsuranceExtension = {};
saveNoCarProposalReq.tXInsuranceRequest.IInsuranceExtension.pageFlag = '0';
saveNoCarProposalReq.tXInsuranceRequestExtension = {};
saveNoCarProposalReq.tXInsuranceRequestExtension.operator = 'netsales';
saveNoCarProposalReq.tXInsuranceRequestExtension.operatorKey = 'netsales';
saveNoCarProposalReq.requestType = '1';
saveNoCarProposalReq.rationType = '59';
saveNoCarProposalReq.comCode = '0160300121';
saveNoCarProposalReq.riskCode = '1105';
saveNoCarProposalReq.startDate = '2015-03-05';
saveNoCarProposalReq.endDate = '2015-09-04';
saveNoCarProposalReq.inputDate = '2015-03-04';
saveNoCarProposalReq.cFinTyp = '212';
saveNoCarProposalReq.certiNo = '016431A00586';
saveNoCarProposalReq.certiName = '���ݱ�������';
saveNoCarProposalReq.businessSource = '50';
saveNoCarProposalReq.nAmt = '1';
saveNoCarProposalReq.nPrm = '198';
saveNoCarProposalReq.orderNo = '2015031704231553';
saveNoCarProposalReq.unitCount = '1';
saveNoCarProposalReq.teamId = '016431T197';
saveNoCarProposalReq.insuranceAccount = '7311010187100001141';
saveNoCarProposalReq.channelDetailCode = '05';
saveNoCarProposalReq.payTime = '2015-03-04 13:05:00';
saveNoCarProposalReq.codind = 'Y';
saveNoCarProposalReq.currency = 'CNY';
saveNoCarProposalReq.payWaySource = '01-��Ǯ';

saveNoCarProposalReq.holderNum = '1';
saveNoCarProposalReq.payStandard = '1';
saveNoCarProposalReq.appDataDto = {};
saveNoCarProposalReq.appDataDto.address = '�Ϻ��к����԰·';
saveNoCarProposalReq.appDataDto.birthday = '1989-01-24';
saveNoCarProposalReq.appDataDto.email = '1047136372@qq.com';
saveNoCarProposalReq.appDataDto.gender = '01';
saveNoCarProposalReq.appDataDto.identifyNumber = '34032319900101179X';
saveNoCarProposalReq.appDataDto.identifyType = '01';
saveNoCarProposalReq.appDataDto.mobile = '18521511610';
saveNoCarProposalReq.appDataDto.partyName = 'Ͷ����';
saveNoCarProposalReq.insuredList = [];
saveNoCarProposalReq.insuredList[0] = {};
saveNoCarProposalReq.insuredList[0].address = '�Ϻ��к����԰·';
saveNoCarProposalReq.insuredList[0].birthday = '1989-01-24';
saveNoCarProposalReq.insuredList[0].email = '1047136372@qq.com';
saveNoCarProposalReq.insuredList[0].gender = '01';
saveNoCarProposalReq.insuredList[0].identifyNumber = '34032319900101179X';
saveNoCarProposalReq.insuredList[0].identifyType = '01';
saveNoCarProposalReq.insuredList[0].mobile = '15821757321';
saveNoCarProposalReq.insuredList[0].partyName = '��··';
saveNoCarProposalReq.benfcList = null;
saveNoCarProposalReq.itemDataDto = {};
saveNoCarProposalReq.itemDataDto.seatCount = 0

var doPolicyQueryDetailReq = {};
doPolicyQueryDetailReq.tXInsuranceRequest = {};
doPolicyQueryDetailReq.tXInsuranceRequest.transExeDate = '2015-03-04';
doPolicyQueryDetailReq.tXInsuranceRequest.transExeTime = '13:05:00';
doPolicyQueryDetailReq.tXInsuranceRequest.transType = '1';
doPolicyQueryDetailReq.tXInsuranceRequest.IInsuranceExtension = {};
doPolicyQueryDetailReq.tXInsuranceRequest.IInsuranceExtension.pageFlag = '0';
doPolicyQueryDetailReq.tXInsuranceRequestExtension = {};
doPolicyQueryDetailReq.tXInsuranceRequestExtension.operator = 'netsales';
doPolicyQueryDetailReq.tXInsuranceRequestExtension.operatorKey = 'netsales';

doPolicyQueryDetailReq.requestType = '1';
doPolicyQueryDetailReq.policyNo = '6603001113320150000013';


//restClient.saveNoCarProposal(saveNoCarProposalReq, function(err, obj){
//if(err){console.log(err);}
////console.log('%d -> %j', res.statusCode, res.headers);
//console.log('%s', "TIANAN RES:"+JSON.stringify(obj));
//});
//
//
//restClient.doPolicyQueryDetail(doPolicyQueryDetailReq, function(err, obj){
//	if(err){console.log(err);}
//	//console.log('%d -> %j', res.statusCode, res.headers);
//	console.log('%s', "TIANAN QUERY RES:"+JSON.stringify(obj));
//});



var queryBlankReq = {
		"PackageList" : {
			"@xmlns:xsi" : "http://www.w3.org/2001/XMLSchema-instance",
			"Package" : {
				"Header" : {
					"Version" : "2",
					"RequestType" : "100",
					"InsureType" : "100",
					"SessionId" : "14203599081568627857",
					"SellerId" : "315612465",
					"Status" : "100",
					"ErrorMessage" : null,
					"SendTime" : "2015-01-04 16:25:08"
				},
				"Request" : {
					"InputsList" : {
						"Inputs" : {
							"@type" : "vehicleInfo",
							"Input" : [ {
								"@name" : "licenseNo",
								"$" : "浙AQ1S26"
							}, {
								"@name" : "cityCode",
								"$" : "330100"
							}, {
								"@name" : "noLicenseFlag",
								"$" : "0"
							}, {
								"@name" : "idNo",
								"$" : "1111"
							}, {
								"@name" : "idNoType",
								"$" : "09"
							}, {
								"@name" : "mobilePhone"
							} ]
						}
					}
				},
				"Sign" : "kuRw2GcbZSGqrsE8h9ENgYRBS_UX1eUKq9AYePWxL_gwlKOuM8ti51QufOJBqe2BGUeSFg8O7_3RT7HgF37x01ausJizMX77u5gv7rOzKhoLoTC3y3wP2fheZmZc8Zs0enihzmri33tm0H78tZ3we0S1RyN9uJZ378ay_7EUgaU"
			}
		}
	}


tpRestClient.queryBlank(queryBlankReq, function(err, obj){
if(err){console.log(err);}
//console.log('%d -> %j', res.statusCode, res.headers);
console.log('%s', "TIANPING QUERYBLANK RES:"+JSON.stringify(obj));
});
