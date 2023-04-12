<html>
<body>    
    <form method="post" action="11.php"> <!--POST 방식 / 11로 이동-->
        id : <input type="text" name="id" />  <!--아이디 입력-->
        password : <input type="password" name="password" />  <!--비번 입력-->
        <input type="submit" />  <!--확인 기능-->
    </form>
</body>
</html>

<!----------------------------------------------------------------------------->


<?php
if(($_POST["id"]) === "php"){   #아이디 입력부분, 해당 아이디 일치하는지 확인
    if($_POST["password"] === "1234"){#아이디 일치시, 비번 일치하는지 확인
        echo 'hello, world!';     //아이디,비번 둘다 일치 시, TRUE
    } else {
        echo 'wrong password.';  //비번 일치 하지 않을 시, false
    }//else
}//if
else {      //아이디 일치 하지 않을 시, false
    echo 'no id';
}//else

//논리 연산자
// && == and
//true and true = true
if(true and true){
    echo 1;
} //true and false = false
if(true and false){
    echo 2;
}//false and true = false
if(false and true){
    echo 3;
}//false and false = false
if(false and false){
    echo 4;
}
//ex
if($_POST['id'] === 'php' && $_POST['password'] === '1234'){
    echo 'hello';
}else {
    echo 'wrong';
}

//or == ||
//true or false = true
if($_POST['id'] === 'php' or $_POST['id'] === '1234' or $_POST['id'] === 'egoing'){
    echo 'hello';
}else {
    echo 'wrong';
}
if(($_POST['id'] === 'php' or $_POST['id'] === '1234' or $_POST['id'] === 'egoing')
and $_POST['password'] === '111111'){
    echo 'hello';
}//if
else {
    echo 'wrong';
}//else

//!값 == not
// !true = false  반대가 된다
// !false = true
?>