#项目说明
[项目文档](http://phabricator.tontron.com.cn/w/project/marketing_center/)
#IDE配置
安装Alibaba Java Coding Guidelines插件，通过该插件统一coding style
#启动配置(Program arguments配置项)
##配置中心配置样例
--shtelpaas.app.name=mktresCenterDataIms    //服务单元名字，自定义，必填
--shtelpaas.app.basepkg=com.shtel.mktrescenter.data.ims   //服务的根包路径，必填
--shtelpaas.app.config.profile=app$dev$1.0  //服务配置文件的环境,版本，必填
--shtelpaas.log.profile=log$dev$1.0             //日志配置文件的环境，版本，必填
--shtelpaas.app.nameserver=http://61.152.234.197:8761/eureka/       //注册中心地址，选填，这里使用平台在云端部署的一个测试实例
##本地配置样例
--shtelpaas.app.name=mktresCenterDataIms
--shtelpaas.app.basepkg=com.shtel.mktrescenter.data.ims
--shtelpaas.app.config.mode=local
--shtelpaas.app.nameserver=http://61.152.234.197:8761/eureka/
##biz-ui
--shtelpaas.app.name=mktresCenterBizUi
--shtelpaas.app.basepkg=com.shtel.mktrescenter.biz.ui
--shtelpaas.app.config.mode=local
--shtelpaas.app.nameserver=http://61.152.234.197:8761/eureka/
##data-ui
--shtelpaas.app.name=mktresCenterDataUi
--shtelpaas.app.basepkg=com.shtel.mktrescenter.data.ui
--shtelpaas.app.config.mode=local
--shtelpaas.app.nameserver=http://61.152.234.197:8761/eureka/
##data-ims
--shtelpaas.app.name=mktresCenterDataIms
--shtelpaas.app.basepkg=com.shtel.mktrescenter.data.ims
--shtelpaas.app.config.mode=local
--shtelpaas.app.nameserver=http://61.152.234.197:8761/eureka/