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
<#list animals as animal>
    ${animal.animalName}
    ${animal.breed}
    ${animal.age}
    ${animal.weight}
    <br>
</#list>
</body>
</html>