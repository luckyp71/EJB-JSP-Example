<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EJB JSP Example</title>
    </head>
    <body>
        <h1>EJB JSP Example</h1>
        <form method="post" action="Result">
            <table>
                <tbody>
                    <tr>
                        <td>
                            Current Assets
                        </td>
                        <td>
                            <input type="text" name="currentAssets"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Current Liabilities
                        </td>
                        <td>
                            <input type="text" name="currentLiabilities"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Select your choice:</td>
                    </tr>
                    <tr>
                        <td><input type="radio" name="group1" value="currentRatio" checked/>Current Ratio</td>
                    </tr>
                    <tr>
                        <td><input type="radio" name="group1" value="workingCapital"/>Working Capital</td>
                    </tr>
                </tbody>
            </table>
            <br/>
            <button type="submit">Process</button>
        </form>
    </body>
</html>
