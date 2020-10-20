<?php
    $con = mysqli_connect("localhost", "luck0707", "disorder2848!", "luck0707");
    mysqli_query($con,'SET NAMES utf8');

    $userID = $_POST["userID"];
    
    $statement = mysqli_prepare($con, "SELECT * FROM USER WHERE userID = ?");
    mysqli_stmt_bind_param($statement, "s", $userID);
    mysqli_stmt_execute($statement);

    mysqli_stmt_store_result($statement);
    mysqli_stmt_bind_result($statement, $userID, $userBirth, $userEmail);

    $response = array();
    $response["success"] = false;
    
    while(mysqli_stmt_fetch($statement)) {
        $response["success"] = true;
        $response["userID"] = $userID;
        $response["userBirth"] = $userBirth;
        $response["userEmail"] = $userEmail;
    }
    echo json_encode($response);

?>