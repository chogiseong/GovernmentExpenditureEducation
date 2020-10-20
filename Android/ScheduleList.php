<?php
    header("Content-Type: text/html; charset=UTF-8");
    $con = mysqli_connect("localhost", "luck0707", "disorder2848!", "luck0707");
    
    $userID = $_GET["userID"];

    $result = mysqli_query($con, "SELECT 
    FREETIME.freetimeID,
    FREETIME.freetimeTitle,
    FREETIME.freetimeName,
    FREETIME.freetimeTime 
    FROM USER, FREETIME, SCHEDULE 
    WHERE USER.userID = '$userID' AND
    USER.userID = SCHEDULE.userID AND
    SCHEDULE.userID = FREETIME.freetimeID");

    $response = array();
    while($row = mysqli_fetch_array($result)){
        array_push($response, array("freetimeID"=>$row[0], "freetimeTitle"=>$row[1], "freetimeName"=>$row[2], "freetimeTime"=>$row[3]));
    }

    echo json_encode(array("response"=>$response), JSON_UNESCAPED_UNICODE);
    mysqli_close($con);
?>