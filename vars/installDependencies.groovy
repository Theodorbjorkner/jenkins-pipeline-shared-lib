public void call(){
    _npmInstall();
}

private void _npmInstall() {
    // if nmp ci doesnt work, use npm install
    sh(script: "npm ci", label: "Install npm dependencies");
}