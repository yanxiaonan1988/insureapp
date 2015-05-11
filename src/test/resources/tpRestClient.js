var restify = require('restify');

var tpRestClient = function() {
    var client;
    return {
        config: function(conf) {
            client = restify.createJsonClient({
                url: 'http://10.100.98.230:18002'
//                	url: 'http://121.40.82.99:18002'
            });
        },
        queryBlank: function(reqObj, cb) {
            client.post('/external/insure/tianping/queryBlank', reqObj, function(err, req, res, obj) {
                cb(err, obj);
            });
        }
        
    };
};

module.exports = tpRestClient();