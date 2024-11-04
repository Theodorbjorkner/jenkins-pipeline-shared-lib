public void call(){
    _nmpInstall();
}

private void _npmInstall(){
    // if nmp ci doesnt work, use npm install
    sh(script: "npm ci", label: "Install npm dependencies");
}