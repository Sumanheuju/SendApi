<%-- 
    Document   : index
    Created on : Aug 18, 2016, 12:24:46 PM
    Author     : Suman Heuju
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student API -></h1>
        
        <div id="display"></div>
        <div>
            
        </div>
        <div>
            
    <form id="Student-form">
        <div class="form-group">
            <label>First-Name: </label>
            <input type="text" name="firstName" id="firstName" class="form-control"/>
        </div>
        
        <div class="form-group">
            <label>Last-Name: </label>
            <input type="text" name="firstName" id="firstName" class="form-control"/>
        </div>
        
        <div class="form-group">
            <label>Email: </label>
            <input type="email" name="Email" id="Email" class="form-control" />
        </div>
        
        <div class="form-group">
            <label>Contact-No: </label>
            <input type="text" name="contact_no" id="contact_no" class="form-control"/>
        </div>
        
        <div class="form-group">
            <label>Status: </label>
            <input type="checkbox" name="Status" id="Status" value="1"/>
        </div>
        
        <button type="submit" id="btn-save" class="btn btn-success">Save</button>
         
    </form>
</div>
    </body>
<script>
    function loadStudents() {
        $.getJSON("api/student").done(function (data) {
            var $display = $("#display")
            var content = "";
            $.each(data, function (i, o) {
                content += "<li>" + o.firstName + "</li>";
            });
            $display.html(content);
        });
    }

    $(document).on("ready", function () {
        loadStudents();

        $("#btn-save").on("click", function () {
            var status = $("#Status").is(":checked");
            var c = {
                Name: $("#Name").val(),
                Email: $("#Email").val(),
                Status: status
            };
            $.post("api/students", c , function (data) {
                loadStudents();
            }, "JSON");

            return false;
        });
    });
</script>
</html>
