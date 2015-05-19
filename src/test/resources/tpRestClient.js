var restify = require('restify');

var tpRestClient = function() {
    var client;
    return {
        config: function(conf) {
            client = restify.createJsonClient({
//                url: 'http://127.0.0.1:18002'
                	url: 'http://121.40.82.99:18002'
            });
        },
        queryBlank: function(reqObj, cb) {
            client.post('/external/insure/tianping/tpcar', reqObj, function(err, req, res, obj) {
                cb(err, obj);
            });
        }
        
    };
};

module.exports = tpRestClient();