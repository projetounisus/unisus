var Utils = function(){
  function _buildURL(urlMethod){
    //var baseURL = window.location.protocol + window.location.host;
    return "/uniSusWeb" + urlMethod;
  }

  var scope = {
    buildURL: _buildURL
  }

  return scope;
}

var utils = new Utils();
