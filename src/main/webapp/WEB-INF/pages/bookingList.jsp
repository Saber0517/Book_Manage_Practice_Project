<%--
  Created by IntelliJ IDEA.
  User: ZHANGJA4
  Date: 8/18/2015
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

count :${shoppingList.size()}
foodId: ${shoppingList.get(0).foodId}<br>
foodPrice ${shoppingList.get(0).foodPrice}
foodId: ${shoppingList.get(1).foodId}
foodPrice ${shoppingList.get(1).foodPrice}<br>
foodId: ${shoppingList.get(2).foodId}
foodPrice ${shoppingList.get(2).foodPrice}<br>
</body>
</html>
