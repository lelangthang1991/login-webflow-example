<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang = "en">
<body>
    <head>
        <title>Example login page</title>
    </head>

    <h2>Please Login</h2>

    <form method="post" action="${flowExecutionUrl}">

        <input type="hidden" name="_eventId" value="performLogin">
        <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />

        <input type="text" name="userName" maxlength="40"><br>
        <input type="password" name="password" maxlength="40">
        <input type="submit" value="Login" />

    </form>

</body>
</html>