<?php 
    $con = mysqli_connect("localhost", "luck0707", "disorder2848!", "luck0707");
    mysqli_query($con,'SET NAMES utf8');

    $userID = $_POST["userID"];
    $userBirth = $_POST["userBirth"];
    $userEmail = $_POST["userEmail"];

    $statement = mysqli_prepare($con, "INSERT INTO USER VALUES (?,?,?)");
    mysqli_stmt_bind_param($statement, "sss", $userID, $userBirth, $userEmail);
    mysqli_stmt_execute($statement);

    $response = array();
    $response["success"] = true;
 
   
    echo json_encode($response);

?>