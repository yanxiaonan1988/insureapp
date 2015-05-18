var restify = require('restify');

var restClient = function() {
    var client;
    return {
        config: function(conf) {
            client = restify.createJsonClient({
                url: 'http://127.0.0.1:18002'
//                	url: 'http://121.40.82.99:18002'
            });
        },
        saveNoCarProposal: function(reqObj, cb) {
            client.post('/external/insure/tianan/saveNoCarProposal', reqObj, function(err, req, res, obj) {
                cb(err, obj);
            });
        },
        
        doPolicyQueryDetail: function(reqObj, cb) {
            client.post('/external/insure/tianan/doPolicyQueryDetail', reqObj, function(err, req, res, obj) {
                cb(err, obj);
            });
        }
        
    };
};

module.exports = restClient();