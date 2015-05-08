//To test the RESTful style webServcie.
//Please run this client using nodejs.

var http = require('http');
var iconv = require('iconv-lite');

console.log('##########post start############');


//var options = {
//  host: 'localhost',
//  port: 18085,
//  path: '/webService/outSystem/extension/newbiz/insuredConfirmation',
//  method: 'POST',
//  headers: {
//    'Content-Type': 'application/json'
//  }
//};
//
//var req = http.request(options, function(res) {
//  console.log('STATUS: ' + res.statusCode);
//  console.log('HEADERS: ' + JSON.stringify(res.headers));
//  res.setEncoding('utf8');
//  res.on('data', function (chunk) {
//    console.log('BODY: ' + chunk);
//  });
//});
//
////req.write('data\n');
//var cus = {
//		"requestHeadDTO":{
//			"seqNo":"PLOJHKJKJLKJSDFSDFSDFSDF"
//		},
//		"mainDTO":{
//			"brand":"1811",
//			"brandName":"\u5965\u8fea",
//			"scheme":"01",
//			"model":"05",
//			"displacement":"100",
//			"oldStartDate":"2014-09-30",
//			"oldMonth":"24",
//			"saleDate":"2014-09-30",
//			"newStartDate":"2014-09-29",
//			"frameno":"LOKIJUHYGVBNHUJKI"
//		},
//		"productDTO":{
//			"guaranteeType":"01",
//			"coverType":"01",
//			"newMonth":"24",
//			"uwPremium":1804.93
//		},
//		"carDTO":{
//			"licenseno":"\u6e58A9987",
//			"actualvalue":"254000",
//			"invoice":"\u53d1\u7968\u62ac\u5934",
//			"engineno":"\u53d1\u52a8\u673a\u53f7",
//			"salesmanName":"\u4e25\u6587\u9633",
//			"salesmanTelephone":"18616010476"
//		},
//		"relatedPartyList":[
//			{
//				"proposalNo":"",
//				"serialNo":"1",
//				"insuredType":"1",
//				"insuredName":"\u4efb\u6eb6\u6eb6",
//				"insuredAddress":"\u4e0a\u6d77\u5e02\uff0c\u6d66\u4e1c\u65b0\u533a\uff0c\u5b81\u6865\u8def999\u53f7",
//				"insuredFlag":"1",
//				"identifyType":"04",
//				"identifyNumber":"4534535345",
//				"sex":"2",
//				"birthDate":"1988-07-11",
//				"mobilePhone":"34534535354",
//				"email":"345345345@qq.com"
//			},
//			{
//				"proposalNo":"",
//				"serialNo":"1",
//				"insuredType":"1",
//				"insuredName":"\u4efb\u6eb6\u6eb6",
//				"insuredAddress":"\u4e0a\u6d77\u5e02\uff0c\u6d66\u4e1c\u65b0\u533a\uff0c\u5b81\u6865\u8def999\u53f7",
//				"insuredFlag":"2",
//				"identifyType":"04",
//				"identifyNumber":"4534535345",
//				"sex":"2",
//				"birthDate":"1988-07-11",
//				"mobilePhone":"34534535354",
//				"email":"345345345@qq.com"
//			},
//			{
//				"serialNo":"2",
//				"insuredType":"1",
//				"insuredName":"\u4efb\u6eb6\u6eb6",
//				"insuredAddress":"\u4e0a\u6d77\u5e02\uff0c\u6d66\u4e1c\u65b0\u533a\uff0c\u5b81\u6865\u8def999\u53f7",
//				"insuredFlag":"4",
//				"identifyType":"04",
//				"identifyNumber":"4534535345",
//				"sex":"2",
//				"birthDate":"1988-07-11",
//				"mobilePhone":"34534535354",
//				"email":"345345345@qq.com"
//			}
//		]
//	};
//req.write(JSON.stringify(cus));
//req.write('\n');
//req.end();



var options = {
		  host: '180.168.192.25',
		  port: 20680,
		  path: '/ecws/mobPhonePayDispatcherController.do',
		  method: 'POST',
		  headers: {
		    'Content-Type': 'text/xml',
		    'charset': 'UTF-8'
		  }
		};


var req = http.request(options, function(res) {
	  console.log('STATUS: ' + res.statusCode);
	  console.log('HEADERS: ' + JSON.stringify(res.headers));
//	  res.setEncoding('utf8');
	  res.on('data', function (chunk) {
	    console.log('BODY: ' + chunk);
	  });
	});

//var cus = {
//		quotationReqDTO:{
//			brand:"1811",
//			coverType:"1",
//			guaranteeType:"03",
//			model:"A4",
//			newMonth:"36",
//			newStartDate:"2014-09-26",
//			oldMonth:"36",
//			oldStartDate:"2013-09-17",
//			saleDate:"2014-09-17",
//			scheme:"00",
//			signMileage:"1"
//		},
//		requestHeadDTO:{
//			seqNo:"45634563"
//		}
//	};

var xml = '<?xml version="1.0" encoding="GBK" standalone="yes"?><PackageList xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"><Package><Header><Version>2</Version><RequestType>100</RequestType><InsureType>100</InsureType><SessionId>14203599081568627857</SessionId><SellerId>315612465</SellerId><Status>100</Status><ErrorMessage></ErrorMessage><SendTime>2015-01-04 16:25:08</SendTime></Header><Request><InputsList><Inputs type="vehicleInfo"><Input name="licenseNo">苏H2D487</Input><Input name="cityCode">310100</Input><Input name="noLicenseFlag">0</Input><Input name="idNo">1111</Input><Input name="idNoType">09</Input><Input name="mobilePhone"></Input></Inputs></InputsList></Request><Sign><![CDATA[kuRw2GcbZSGqrsE8h9ENgYRBS_UX1eUKq9AYePWxL_gwlKOuM8ti51QufOJBqe2BGUeSFg8O7_3RT7HgF37x01ausJizMX77u5gv7rOzKhoLoTC3y3wP2fheZmZc8Zs0enihzmri33tm0H78tZ3we0S1RyN9uJZ378ay_7EUgaU]]></Sign></Package></PackageList>';
//var xml = '<?xml version="1.0" encoding="GBK" standalone="yes"?><PackageList xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"><Package><Header><Version>2</Version><RequestType>100</RequestType><InsureType>100</InsureType><SessionId>14203599081568627857</SessionId><SellerId>315612465</SellerId><Status>100</Status><ErrorMessage></ErrorMessage><SendTime>2015-01-04 16:25:08</SendTime></Header><Request><InputsList><Inputs type="vehicleInfo"><Input name="licenseNo">浙AQ1S26</Input><Input name="cityCode">330100</Input><Input name="noLicenseFlag">0</Input><Input name="idNo">1111</Input><Input name="idNoType">09</Input><Input name="mobilePhone"></Input></Inputs></InputsList></Request><Sign><![CDATA[kuRw2GcbZSGqrsE8h9ENgYRBS_UX1eUKq9AYePWxL_gwlKOuM8ti51QufOJBqe2BGUeSFg8O7_3RT7HgF37x01ausJizMX77u5gv7rOzKhoLoTC3y3wP2fheZmZc8Zs0enihzmri33tm0H78tZ3we0S1RyN9uJZ378ay_7EUgaU]]></Sign></Package></PackageList>';
var buf = iconv.encode(xml, 'GBK');//return GBK encoded bytes from unicode string
	
req.write(buf);
req.write('\n');
req.end();
