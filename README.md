#启动配置
##配置样例
--shtelpaas.app.name=mktrescCenterDataIms    //服务单元名字，自定义，必填
--shtelpaas.app.basepkg=com.shtel.mktrescenter.data.ims   //服务的根包路径，必填
--shtelpaas.app.config.profile=app$dev$1.0  //服务配置文件的环境,版本，必填
--shtelpaas.log.profile=log$dev$1.0             //日志配置文件的环境，版本，必填
--shtelpaas.app.nameserver=http://61.152.234.197:8761/eureka/       //注册中心地址，选填，这里使用平台在云端部署的一个测试实例
##data_ims
--shtelpaas.app.name=mktrescCenterDataIms
--shtelpaas.app.basepkg=com.shtel.mktrescenter.data.ims
--shtelpaas.app.config.profile=app$dev$1.0
--shtelpaas.log.profile=log$dev$1.0
--shtelpaas.app.nameserver=http://61.152.234.197:8761/eureka/