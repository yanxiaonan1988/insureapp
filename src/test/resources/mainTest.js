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
					"SellerId" : "425604694",
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
								"$" : "浙AZ8Y55"
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
				}
//				"Sign" : "Bt5SWMri-ytt7PMvolukbVb_eXyr8q3Qb8nUmoNDyRY0NNw2xdrDZrSh8unkFpq6qsaIwdzOHfwCqeA7gqmCM4siO3pW_5wm2_ApV6GH6MCOQg0hj5HpFbqOms_b5I_8cpkO0QV_bs2JG-dXjzWV3Q4yTqphp4OY8ha8FMexFxw"
			}
		}
	};


//报价请求
var queryPriceReq = {
	"PackageList" : {
		"@xmlns:xsi" : "http://www.w3.org/2001/XMLSchema-instance",
		"Package" : {
			"Header" : {
				"Version" : "2",
				"RequestType" : "105",
				"InsureType" : "100",
				"SessionId" : "14203599081568627857",
				"SellerId" : "425604694",
				"Status" : "100",
				"ErrorMessage" : null,
				"SendTime" : "2015-01-04 16:27:35"
			},
			"Request" : {
				"InputsList" : {
					"Inputs" : [ {
						"@type" : "vehicleInfo",
						"Input" : [ {
							"@name" : "vehicleId",
							"$" : "402880882e931707012ec6c26e2722ae"
						}, {
							"@name" : "specialCarFlag",
							"$" : "0"
						}, {
							"@name" : "vehicleModelName",
							"$" : "蒙迪欧CAF7230A轿车 - (￥157200)手自一体 时尚型 国Ⅳ(201103)"
						}, {
							"@name" : "firstRegisterDate",
							"$" : "2011-01-01"
						}, {
							"@name" : "specialCarDate"
						}, {
							"@name" : "engineNo",
							"$" : "3131314"
						}, {
							"@name" : "vehicleFrameNo",
							"$" : "LVSHBFAF37F011623"
						}, {
							"@name" : "bizBeginDate",
							"$" : "2015-01-01"
						}, {
							"@name" : "forceBeginDate",
							"$" : "2015-01-01"
						} ]
					}, {
						"@type" : "ownerInfo",
						"Input" : {
							"@name" : "ownerName",
							"$" : "方法"
						}
					} ]
				}
			}
//			"Sign" : "KR-jWDXUXIkzyf1MXi2qVgKvdAp2HHa7lqQ80A4ao0GKDailffHXMC9ngSh15vF4oVVm1qa1tA6R2BdR2nlK696bJxdKly4zRH9QQX4keB6qTLWN6OPPtBp8LCCgFu8FB_IbEmo5azQ0Q78hdYJ5TRwA5tawO3txiPxSZs26J_Q"
		}
	}
};


//自定义报价请求
var diyQueryPriceReq = {
		"PackageList" : {
			"@xmlns:xsi" : "http://www.w3.org/2001/XMLSchema-instance",
			"Package" : {
				"Header" : {
					"Version" : "2",
					"RequestType" : "110",
					"InsureType" : "100",
					"SessionId" : "14203599081568627857",
					"SellerId" : "425604692",
					"Status" : "100",
					"ErrorMessage" : null,
					"SendTime" : "2015-03-31 17:59:00"
				},
				"Request" : {
					"InputsList" : {
						"Inputs" : {
							"@type" : "optional",
							"Input" : [ {
								"@name" : "bizFlag",
								"$" : "1"
							}, {
								"@name" : "cov_200",
								"$" : "1"
							}, {
								"@name" : "cov_600",
								"$" : "300000.00"
							}, {
								"@name" : "cov_500",
								"$" : "0"
							}, {
								"@name" : "cov_701",
								"$" : "10000.00"
							}, {
								"@name" : "cov_702",
								"$" : "10000.00"
							}, {
								"@name" : "cov_231",
								"$" : "0"
							}, {
								"@name" : "forceFlag",
								"$" : "1"
							}, {
								"@name" : "cov_310",
								"$" : "0"
							}, {
								"@name" : "cov_210",
								"$" : "0"
							}, {
								"@name" : "cov_290",
								"$" : "0"
							} ]
						}
					}
				}
//				"Sign" : "IJv0fl06wjcUuiuVnkjhqrdikHsYuTqJwt2fiqJhpg0QB8R0f6zaJlQMWTrQvB5Gtnriph8edPGvT9IYy3Yl7Ht51l_lrPHjX9kH1v_YwWb4q8ICDEb6e7YSYufne442gwHqLdVlCQrnDYVUUtwJXbn9WlyRDoozXipt9G3LDHA"
			}
		}
	}; 

var doProposalReq = {
		"PackageList" : {
			"@xmlns:xsi" : "http://www.w3.org/2001/XMLSchema-instance",
			"Package" : {
				"Header" : {
					"Version" : "2",
					"RequestType" : "115",
					"InsureType" : "100",
					"SessionId" : "14203599081568627857",
					"SellerId" : "425604694",
					"Status" : "100",
					"ErrorMessage" : null,
					"SendTime" : "2015-01-04 16:28:34"
				},
				"Request" : {
					"InputsList" : {
						"Inputs" : [ {
							"@type" : "insuredInfo",
							"Input" : [ {
								"@name" : "insuredIdNo",
								"$" : "440181198208167873"
							}, {
								"@name" : "insuredName",
								"$" : "方法"
							}, {
								"@name" : "insuredIdType",
								"$" : "01"
							}, {
								"@name" : "insuredBirthday",
								"$" : "1982-08-16"
							}, {
								"@name" : "insuredMobile",
								"$" : "13222222222"
							}, {
								"@name" : "insuredGender",
								"$" : "1"
							} ]
						}, {
							"@type" : "economic",
							"Input" : [ {
								"@name" : "cov_200",
								"$" : "212996.40"
							}, {
								"@name" : "cov_600",
								"$" : "200000"
							}, {
								"@name" : "cov_310",
								"$" : "0"
							}, {
								"@name" : "cov_290",
								"$" : "0"
							}, {
								"@name" : "forceFlag",
								"$" : "0"
							}, {
								"@name" : "bizTotalPremium",
								"$" : "588699"
							}, {
								"@name" : "totalPremium",
								"$" : "588699"
							}, {
								"@name" : "standardPremium",
								"$" : "692499"
							} ]
						}, {
							"@type" : "ownerInfo",
							"Input" : [ {
								"@name" : "ownerIdType",
								"$" : "01"
							}, {
								"@name" : "ownerMobile",
								"$" : "13222222222"
							}, {
								"@name" : "ownerGender",
								"$" : "1"
							}, {
								"@name" : "ownerIdNo",
								"$" : "440181198208167873"
							}, {
								"@name" : "ownerName",
								"$" : "方法"
							}, {
								"@name" : "ownerBirthday",
								"$" : "1982-08-16"
							} ]
						}, {
							"@type" : "deliverInfo",
							"Input" : [ {
								"@name" : "addresseeName",
								"$" : "rrr"
							}, {
								"@name" : "addresseeProvince"
							}, {
								"@name" : "addresseeCityName",
								"$" : "韶关市"
							}, {
								"@name" : "addresseeMobile",
								"$" : "13335003235"
							}, {
								"@name" : "addresseeTown"
							}, {
								"@name" : "addresseeDetails",
								"$" : "广东省韶关市浈江区rrr"
							}, {
								"@name" : "addresseeCity",
								"$" : "4402"
							} ]
						}, {
							"@type" : "applicantInfo",
							"Input" : [ {
								"@name" : "applicantIdType",
								"$" : "01"
							}, {
								"@name" : "applicantMobile",
								"$" : "13222222222"
							}, {
								"@name" : "applicantBirthday",
								"$" : "1982-08-16"
							}, {
								"@name" : "applicantIdNo",
								"$" : "440181198208167873"
							}, {
								"@name" : "applicantGender",
								"$" : "1"
							}, {
								"@name" : "applicantName",
								"$" : "方法"
							} ]
						}, {
							"@type" : "deadline",
							"Input" : [ {
								"@name" : "forceBeginDate",
								"$" : "2015-01-07"
							}, {
								"@name" : "bizBeginDate",
								"$" : "2015-01-07"
							} ]
						}, {
							"@type" : "force",
							"Input" : [ {
								"@name" : "forceTotalPremium",
								"$" : "0"
							}, {
								"@name" : "vehicleTaxPremium",
								"$" : "0"
							}, {
								"@name" : "forcePremium",
								"$" : "0"
							} ]
						} ]
					},
					"Order" : {
						"TBOrderId" : "2015010400000028",
						"Premium" : "588699",
						"SubOrderList" : {
							"SubOrder" : {
								"@type" : "biz",
								"TBOrderId" : "2015010400000006",
								"ItemId" : "2015010400000028",
								"Premium" : "588699"
							}
						}
					}
				}
//				"Sign" : "jZRvZIyMEvOhAOAlvdSYfs3N-Ny3PXNC2CupAC9HYUviQQthYrDD9GIgjX0EEpparM126xE6M8CHSBFancmjyjhooAJyVFGMPRcyOWeXJahZ9ZOBStYl5M7cGCzA2L6na5UbuC9VA_1XtuqOGWUJ_QsEYGOIzseyE4pRvk2ZUZw"
			}
		}
	};


tpRestClient.queryBlank(doProposalReq, function(err, obj){
if(err){console.log(err);}
//console.log('%d -> %j', res.statusCode, res.headers);
console.log('%s', "TIANPING QUERYBLANK RES:"+JSON.stringify(obj));
});
