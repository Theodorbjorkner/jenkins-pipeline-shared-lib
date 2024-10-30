public void call(String additionalMessage = ""){
    sh(label: 'Print server time', script: 'date');
    echo("additional message: " + additionalMessage);
}