<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<table>
    <thead>
    <th>Expenses</th>
    <th>Vendor</th>
    <th>Amount</th>
    </thead>

    <tbody>
    <tr>
        <td>
            <h3>${expense.id}</h3>
        </td>
        <td>
            <h3>${expense.expenses}</h3>
        </td>
        <td>
            <h3>${expense.vendor}</h3>
        </td>
        <td>
            <h3>${expense.amount}</h3>
        </td>
        <td>
            <a href="/edit/${expense.id}">edit</a>
        </td>
    </table>
</body>
</html>