<%--
  Created by IntelliJ IDEA.
  User: anuj
  Date: 15/12/16
  Time: 6:28 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<script>
    window.fbAsyncInit = function() {
        FB.init({
            appId      : '95100348886',
            xfbml      : true,
            version    : 'v2.6'
        });
    };

    (function(d, s, id){
        var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) {return;}
        js = d.createElement(s); js.id = id;
        js.src = "//connect.facebook.net/en_US/sdk.js";
        fjs.parentNode.insertBefore(js, fjs);
    }(document, 'script', 'facebook-jssdk'));
</script>

<div class="fb-messengermessageus"
     messenger_app_id=""
     page_id="XYZ"
     color="blue"
     size="large">
</div>
</body>
</html>