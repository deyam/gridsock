var stompClient = null;

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    }
    else {
        $("#conversation").hide();
    }
    $("#greetings").html("");
    $("#mon").html("");
}

function connect() {
    var socket = new SockJS('/gs-guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        // stompClient.subscribe('/topic/greetings', function (greeting) {
        //     showGreeting(JSON.parse(greeting.body).content);
        // });
        stompClient.subscribe('/topic/mon', function (stats) {
            showGreeting(JSON.parse(stats.body).content);
        });

        stompClient.subscribe('/topic/chart3', function (stats) {
            showGreeting(JSON.parse(stats.body).content);
        });

    });
}

function disconnect() {
    if (stompClient != null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

function sendName() {
    // stompClient.send("/app/hello", {}, JSON.stringify({'name': $("#name").val()}));
    stompClient.send("/app/mon", {}, JSON.stringify({'name': $("#name").val()}));
}

function sendName2() {
    // stompClient.send("/app/hello", {}, JSON.stringify({'name': $("#name").val()}));
    stompClient.send("/app/chart3", {}, JSON.stringify({'name': $("#name").val()}));
}


function showGreeting(message) {
  //  $("#greetings").append("<tr><td>" + message + "</td></tr>");
    $("#stats").append("<tr><td>" + message + "</td></tr>");
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#connect" ).click(function() { connect(); });
    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#send" ).click(function() { sendName(); });
    $( "#sendChart3" ).click(function() { sendName2(); });
});
