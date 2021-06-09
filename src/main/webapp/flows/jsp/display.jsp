<%@ page isELIgnored="false"%>
<html>
<body>
    <h2>Please Input</h2>

    <form method="post" action="${flowExecutionUrl}">

        <input type="hidden" name="_eventId" value="performInput">
        <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />

        <input type="text" name="param1" maxlength="40"><br>
        <input type="text" name="param2" maxlength="40"><br>
        <input type="submit" value="ShowModelValue" />

    </form>

</body>
</html>