<?php
    header("Content-Type: text/html; charset=UTF-8");
    $con = mysqli_connect("localhost", "luck0707", "disorder2848!", "luck0707");
    
    $freetimeName = $_GET["freetimeName"];
    $freetimeDate = $_GET["freetimeDate"];
    $freetimePlace = $_GET["freetimePlace"];

    $result = mysqli_query($con, "SELECT * FROM FREETIME WHERE
    freetimeName = '$freetimeName' AND
    freetimeDate = '$freetimeDate' AND
    freetimePlace = '$freetimePlace'");
    $response = array();
    while($row = mysqli_fetch_array($result)){
        array_push($response, array("freetimeID"=>$row[0], "freetimeName"=>$row[1], "freetimeDate"=>$row[2], "freetimePlace"=>$row[3]));

    }

    echo json_encode(array("response"=>$response), JSON_UNESCAPED_UNICODE);
    mysqli_close($con);
?>