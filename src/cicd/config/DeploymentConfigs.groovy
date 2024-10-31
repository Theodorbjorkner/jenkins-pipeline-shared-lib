package cicd.config

class DeploymentConfigs {
    public static def jobInstance = null;

    /**
    configurations from jenkins-lib <b> resources/global-configs.yaml </b>
     */
    public static Map globalConfigs= null;
    public static Map loadGlobalConfigs(){
        final String globalConfigsResources = DeploymentConfigs.jobInstance.libraryResource("global-configs.yaml");
       DeploymentConfigs.globalConfigs = DeploymentConfigs.jobInstance.readYaml(text: globalConfigsResources);
        DeploymentConfigs.jobInstance.echo("DEBUG " + DeploymentConfigs.globalConfigs); // TODO remove it after debug
        return DeploymentConfigs.globalConfigs;
    }
}
