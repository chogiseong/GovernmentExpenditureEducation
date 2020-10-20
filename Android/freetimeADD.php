<?php
    $con = mysqli_connect("localhost", "luck0707", "disorder2848!", "luck0707");

    $userID = $_POST["userID"];
    $freetimeID = $_POST["freetimeID"];

    $statement = mysqli_prepare($con, "INSERT INTO SCHEDULE VALUES (?, ?)");
    mysqli_stmt_bind_param($statement, "si", $userID, $freetimeID);
    mysqli_stmt_execute($statement);

    $response = array();
    $response["success"] = true;

    echo json_encode($response);
?>