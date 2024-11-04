import cicd.config.DeploymentConfigs

public void call(String repositoryName, String sourceBranch){
    // fail if source brand is not provided
    if(!sourceBranch){
        error("source branch for git clone is '${sourceBranch}'");
    }
    // Clone repo
    final String gitUrl = _generateGitUrl(repositoryName);
    //checkout(
      //      scm: [
        //      $class:"GitSCM",
          //          userRemoteConfigs: [[url:gitUrl]],
            //        branches:[[name: "refs/heads/${sourceBranch}"]],
              //      extensions: []
                //    ],

            //changelog: true, poll: false);

    checkout (
            scm: [
            scmGit(branches: [[name: "refs/heads/${sourceBranch}"]],
                    extensions: [],
                    userRemoteConfigs: [[url: gitUrl]]),
            ],
            changelog: true, poll: false);
}
 private String _generateGitUrl(String repositoryName){
    final String remoteUrlPattern = DeploymentConfigs.globalConfigs["git"]["remoteHTTPS"];
    return remoteUrlPattern.replace("<REPOSITORY_NAME>", repositoryName);

}
