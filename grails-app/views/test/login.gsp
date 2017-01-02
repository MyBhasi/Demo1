

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title></title>
    <script src="${resource(dir: 'theme/jQuery', file: 'jQuery-2.1.4.min.js')}" type="text/javascript"></script>
</head>
<body>
<input type="button"  class="btn-success" onclick="check()">
<div id="field"  style="display: none">
    jvdskjvdsk

</div>
<input  type="text" id="user" />
<script  type="text/javascript">
    function check() {
        var name=$('#user').val()
        console.log("check")
        var url = '${createLink(controller: 'test', action: 'afterAjax')}';
        $.ajax({

            url: url,
            success: function (data) {
                var name=$('#user').val()
                console.log("hi")
                console.log(data)
                console.log(name)
                $('#user').val('bhaskar')
                $('#field').show()


            },
            error: function () {
                console.log('error')

            }
        });
    }

</script>

</body>
</html>